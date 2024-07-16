package joao.app.personapp.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Person {

    private String id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private Address address;

    public Person(String id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
