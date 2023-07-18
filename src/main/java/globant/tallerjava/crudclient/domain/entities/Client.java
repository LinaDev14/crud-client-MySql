package globant.tallerjava.crudclient.domain.entities;

import lombok.Data;

@Data
public class Client {

    private final Long id;
    private final String name;
    private final String age;
    private final String height;
    private final String weight;
    private final String objective;

}
