package globant.tallerjava.crudclient.infraestructure.adapters.sql.configuration;

import globant.tallerjava.crudclient.infraestructure.adapters.dto.RoutineDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlConfigurationRoutine extends JpaRepository<RoutineDto, Long> {
}
