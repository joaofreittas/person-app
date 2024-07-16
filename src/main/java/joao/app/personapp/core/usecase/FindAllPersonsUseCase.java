package joao.app.personapp.core.usecase;

import joao.app.personapp.core.domain.Person;

import java.util.List;

public interface FindAllPersonsUseCase {

    List<Person> execute();

}
