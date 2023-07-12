package loga.dev5.pstatement.dto;

import lombok.Data;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Project {
    private int id;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Project() {
    }

    private Project(int id, LocalDate startDate, LocalDate finishDate) {
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public static List<Project> generateProjectList() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, LocalDate.of(2023, 1, 1), LocalDate.of(2023, 6, 30)));
        projects.add(new Project(2, LocalDate.of(2023, 2, 15), LocalDate.of(2023, 9, 30)));
        projects.add(new Project(3, LocalDate.of(2023, 3, 1), LocalDate.of(2023, 12, 31)));
        projects.add(new Project(4, LocalDate.of(2023, 4, 10), LocalDate.of(2024, 3, 31)));
        projects.add(new Project(5, LocalDate.of(2023, 5, 1), LocalDate.of(2024, 6, 30)));
        projects.add(new Project(3, LocalDate.of(2023, 6, 15), LocalDate.of(2024, 2, 28)));
        projects.add(new Project(2, LocalDate.of(2023, 7, 1), LocalDate.of(2024, 1, 31)));
        projects.add(new Project(1, LocalDate.of(2023, 8, 10), LocalDate.of(2024, 5, 31)));
        projects.add(new Project(4, LocalDate.of(2023, 9, 1), LocalDate.of(2024, 3, 31)));
        projects.add(new Project(5, LocalDate.of(2023, 10, 15), LocalDate.of(2024, 6, 30)));
        return projects;
    }
}

