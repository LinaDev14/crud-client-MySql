package globant.tallerjava.crudclient.infraestructure.adapters.sql.configuration;

import globant.tallerjava.crudclient.domain.entities.Client;
import globant.tallerjava.crudclient.infraestructure.adapters.dto.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlConfigurationClient extends JpaRepository<ClientDto, Long> {
    List<ClientDto> findByName (String name);
    List<ClientDto> findByAge (String age);
    List<ClientDto> findByHeight(String height);
    ClientDto saveClient(ClientDto clientDto);
    ClientDto updateClient(ClientDto clientDto);
    List<ClientDto> getAllClients();
    ClientDto deleteClient(int id);
}
