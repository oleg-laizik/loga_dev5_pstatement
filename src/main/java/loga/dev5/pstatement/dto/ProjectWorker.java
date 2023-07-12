package loga.dev5.pstatement.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProjectWorker {
    private int projectId;
    private int workerId;

    public ProjectWorker() {
    }

    private ProjectWorker(int projectId, int workerId) {
        this.projectId = projectId;
        this.workerId = workerId;
    }

    public static List<ProjectWorker> generateProjectWorkerList() {
        List<ProjectWorker> projectWorkers = new ArrayList<>();
        projectWorkers.add(new ProjectWorker(1, 1));
        projectWorkers.add(new ProjectWorker(1, 2));
        projectWorkers.add(new ProjectWorker(1, 3));
        projectWorkers.add(new ProjectWorker(2, 4));
        projectWorkers.add(new ProjectWorker(2, 5));
        projectWorkers.add(new ProjectWorker(3, 6));
        projectWorkers.add(new ProjectWorker(4, 7));
        projectWorkers.add(new ProjectWorker(5, 8));
        projectWorkers.add(new ProjectWorker(6, 9));
        projectWorkers.add(new ProjectWorker(7, 10));
        projectWorkers.add(new ProjectWorker(7, 1));
        projectWorkers.add(new ProjectWorker(8, 2));
        projectWorkers.add(new ProjectWorker(8, 3));
        projectWorkers.add(new ProjectWorker(8, 4));
        projectWorkers.add(new ProjectWorker(9, 5));
        projectWorkers.add(new ProjectWorker(10, 6));
        projectWorkers.add(new ProjectWorker(10, 7));
        projectWorkers.add(new ProjectWorker(10, 8));
        projectWorkers.add(new ProjectWorker(10, 9));
        projectWorkers.add(new ProjectWorker(10, 10));
        return projectWorkers;
    }
}

