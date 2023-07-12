package loga.dev5.pstatement.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Worker {
    private String name;
    private LocalDate birthday;
    private String level;
    private int salary;

    public Worker() {
    }

    public Worker(String name, LocalDate birthday, String level, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }

    public static List<Worker> generateWorkerList() {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John Doe", LocalDate.of(1990, 01, 01), "Trainee", 800));
        workers.add(new Worker("Jane Smith", LocalDate.of(1985, 02, 15), "Junior", 1200));
        workers.add(new Worker("Mark Johnson", LocalDate.of(1980, 06, 30), "Middle", 2500));
        workers.add(new Worker("Sarah Williams", LocalDate.of(1975, 9, 10), "Middle", 2800));
        workers.add(new Worker("Michael Brown", LocalDate.of(1972, 12, 20), "Senior", 4000));
        workers.add(new Worker("Emily Davis", LocalDate.of(1992, 03, 05), "Trainee", 900));
        workers.add(new Worker("Daniel Anderson", LocalDate.of(1988, 07, 12), "Junior", 1500));
        workers.add(new Worker("Olivia Taylor", LocalDate.of(1983, 11, 25), "Middle", 2700));
        workers.add(new Worker("James Wilson", LocalDate.of(1978, 04, 15), "Middle", 3000));
        workers.add(new Worker("Sophia Martinez", LocalDate.of(1970, 10, 8), "Senior", 4500));
        return workers;
    }
}