package loga.dev5.pstatement;


import loga.dev5.pstatement.dto.Client;
import loga.dev5.pstatement.dto.Project;
import loga.dev5.pstatement.dto.ProjectWorker;
import loga.dev5.pstatement.dto.Worker;

public class LauncherMain {

    public static void main(String[] args) {
        var woe = new ProjectWorker().generateProjectWorkerList();
        var wor = new Worker().generateWorkerList();
        var woq = new Project().generateProjectList();
        var wot = new Client().generateFiveClient();
        }
    }
