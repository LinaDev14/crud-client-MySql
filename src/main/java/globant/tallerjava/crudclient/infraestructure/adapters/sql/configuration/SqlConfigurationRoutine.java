package globant.tallerjava.crudclient.infraestructure.adapters.sql.configuration;

import globant.tallerjava.crudclient.domain.entities.Routine;
import globant.tallerjava.crudclient.infraestructure.adapters.dto.RoutineDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlConfigurationRoutine extends JpaRepository<RoutineDto, Long> {

    List<RoutineDto> findByName (String name);
    List<RoutineDto> findByDuration(String duration);
    List<RoutineDto> findByDifficultyLevel(String difficultyLevel);
    RoutineDto saveRoutine(RoutineDto routineDto);
    RoutineDto updateRoutine(RoutineDto routineDto);
    List<RoutineDto> getAllRoutines();
    RoutineDto deleteRoutine(int id);
}
