package joao.app.personapp.core.usecase;

import joao.app.personapp.core.domain.Person;

public interface RegisterPersonUseCase {

    Person execute(Person person);

}
