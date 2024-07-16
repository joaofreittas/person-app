package joao.app.personapp.entrypoint.api.facade;

import joao.app.personapp.core.usecase.FindAllPersonsUseCase;
import joao.app.personapp.core.usecase.RegisterPersonUseCase;
import joao.app.personapp.core.usecase.SetAddressForPersonUseCase;
import joao.app.personapp.entrypoint.api.dto.PersonRequest;
import joao.app.personapp.entrypoint.api.dto.PersonResponse;
import joao.app.personapp.entrypoint.api.mapper.PersonEntrypointMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonFacade {

    private final RegisterPersonUseCase registerPersonUseCase;
    private final FindAllPersonsUseCase findAllPersonsUseCase;
    private final SetAddressForPersonUseCase setAddressForPersonUseCase;

    public PersonResponse registerPerson(final PersonRequest personRequest) {
        var personDomain = PersonEntrypointMapper.toDomain(personRequest);
        var personSaved = registerPersonUseCase.execute(personDomain);
        return PersonEntrypointMapper.toResponse(personSaved);
    }

    public List<PersonResponse> findAll() {
        return findAllPersonsUseCase.execute()
            .stream()
            .map(PersonEntrypointMapper::toResponse)
            .toList();
    }

    public void setAddressForPerson(final String personId, final String zipCode) {
        setAddressForPersonUseCase.execute(zipCode, personId);
    }

}
