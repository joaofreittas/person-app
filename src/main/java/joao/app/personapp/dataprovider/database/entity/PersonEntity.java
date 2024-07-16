package joao.app.personapp.dataprovider.database.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Document(collection = "person")
public class PersonEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private AddressEntity address;

    public PersonEntity(final String id, final String name, final String email, final LocalDate birthDate, AddressEntity address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
    }

}
