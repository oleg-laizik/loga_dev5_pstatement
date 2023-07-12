package loga.dev5.pstatement.dto;

import lombok.Data;


        import java.util.ArrayList;
        import java.util.List;

@Data
public class Client {
    private String name;
    public Client(){

    }
    private Client(String name){
        this.name = name;
    }

    public List<Client> generateFiveClient(){
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("A"));
        clients.add(new Client("B"));
        clients.add(new Client("C"));
        clients.add(new Client("D"));
        clients.add(new Client("E"));
        return clients;
    }
}
