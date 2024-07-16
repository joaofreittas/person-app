package joao.app.personapp.core.gateway;

import joao.app.personapp.core.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonGateway {

    Person save(Person person);

    List<Person> findAll();

    Optional<Person> findById(String id);

    Person update(Person person, String id);

}
