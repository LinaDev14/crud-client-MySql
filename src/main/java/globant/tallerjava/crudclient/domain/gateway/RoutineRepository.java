package globant.tallerjava.crudclient.domain.gateway;


import globant.tallerjava.crudclient.domain.entities.Routine;

import java.util.List;

public interface RoutineRepository {

    Routine findById(int id);
    List<Routine> findByName (String name);
    List<Routine> findByDuration(String duration);
    List<Routine> findByDifficultyLevel(String difficultyLevel);
    Routine saveRoutine(Routine routine);
    Routine updateRoutine(Routine routine);
    List<Routine> getAllRoutines();
    Routine deleteRoutine(int id);
}
