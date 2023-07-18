package globant.tallerjava.crudclient.domain.gateway;

import globant.tallerjava.crudclient.domain.entities.Client;

import java.util.List;

public interface ClientRepository {

    Client findById(int id);
    List<Client> findByName (String name);
    List<Client> findByAge (String age);
    List<Client> findByHeight(String height);
    Client saveClient(Client client);
    Client updateClient(Client client);
    List<Client> getAllClients();
    Client deleteClient(int id);
}
