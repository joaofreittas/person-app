package joao.app.personapp.core.usecase.impl;

import joao.app.personapp.core.domain.Person;
import joao.app.personapp.core.gateway.PersonGateway;
import joao.app.personapp.core.usecase.RegisterPersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterPersonUseCaseImpl implements RegisterPersonUseCase {

    private final PersonGateway personGateway;

    @Override
    public Person execute(final Person person) {
        return personGateway.save(person);
    }

}
