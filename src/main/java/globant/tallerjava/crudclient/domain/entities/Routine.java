package globant.tallerjava.crudclient.domain.entities;

import lombok.Data;

@Data
public class Routine {

    private final int id;
    private final String name;
    private final String duration;
    private final String difficultyLevel;
    private final String  description;

}
