package joao.app.personapp.core.usecase.impl;

import joao.app.personapp.core.domain.Person;
import joao.app.personapp.core.gateway.PersonGateway;
import joao.app.personapp.core.usecase.FindAllPersonsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllPersonsUseCaseImpl implements FindAllPersonsUseCase {

    private final PersonGateway personGateway;

    @Override
    public List<Person> execute() {
        return personGateway.findAll();
    }

}
