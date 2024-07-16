package joao.app.personapp.entrypoint.api.mapper;

import joao.app.personapp.core.domain.Person;
import joao.app.personapp.entrypoint.api.dto.PersonRequest;
import joao.app.personapp.entrypoint.api.dto.PersonResponse;

import java.time.LocalDate;

public class PersonEntrypointMapper {

    public static Person toDomain(final PersonRequest request) {
        return new Person(
            null,
            request.getName(),
            request.getEmail(),
            LocalDate.now()
        );
    }

    public static PersonResponse toResponse(final Person personSaved) {
        return new PersonResponse(
            personSaved.getId(),
            personSaved.getName(),
            personSaved.getEmail(),
            AddressEntryMapper.toResponse(personSaved.getAddress())
        );
    }

}
