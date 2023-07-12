
package loga.dev5.pstatement.services;

import loga.dev5.pstatement.Database;
import loga.dev5.pstatement.dto.Client;
import loga.dev5.pstatement.dto.Project;
import loga.dev5.pstatement.dto.ProjectWorker;
import loga.dev5.pstatement.dto.Worker;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabasePopulateService {
    public static void main(String[] args) {
        populateWorkerTable();
        populateClientTable();
        populateProjectTable();
        populateProjectWorkerTable();
    }

    public static void populateWorkerTable() {
        String sql = "INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY) VALUES (?, ?, ?, ?)";
        try (Connection connection = Database.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            for (Worker worker : new Worker().generateWorkerList()) {
                statement.setString(1, worker.getName());
                statement.setDate(2, Date.valueOf(worker.getBirthday()));
                statement.setString(3, worker.getLevel());
                statement.setInt(4, worker.getSalary());
                statement.addBatch();
            }


            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateClientTable() {
        String sql = "INSERT INTO client (name) VALUES (?)";
        try (Connection connection = Database.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            for (Client client : new Client().generateFiveClient()) {
                statement.setString(1, client.getName());
                statement.addBatch();
            }

            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectTable() {
        String sql = "INSERT INTO project (client_id, start_date, finish_date) VALUES (?, ?, ?)";
        try (Connection connection = Database.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            for (Project project : new Project().generateProjectList()) {
                statement.setInt(1, project.getId());
                statement.setDate(2, Date.valueOf(project.getStartDate()));
                statement.setDate(3, Date.valueOf(project.getFinishDate()));
                statement.addBatch();
            }

            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectWorkerTable() {
        String sql = "INSERT INTO project_worker (project_ID, worker_ID) VALUES (?, ?)";
        try (Connection connection = Database.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);

            for (ProjectWorker projectWorker : new ProjectWorker().generateProjectWorkerList()) {
                statement.setInt(1, projectWorker.getProjectId());
                statement.setInt(2, projectWorker.getWorkerId());
                statement.addBatch();
            }

            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}