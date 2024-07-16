package joao.app.personapp.dataprovider.database.mapper;

import joao.app.personapp.core.domain.Person;
import joao.app.personapp.dataprovider.database.entity.PersonEntity;

public class PersonInfrastructureMapper {

    public static PersonEntity toEntity(Person person) {
        return new PersonEntity(
            person.getId(),
            person.getName(),
            person.getEmail(),
            person.getBirthDate(),
            AddressInfraMapper.toEntity(person.getAddress())
        );
    }

    public static Person toDomain(PersonEntity entity) {
        return new Person(
            entity.getId(),
            entity.getName(),
            entity.getEmail(),
            entity.getBirthDate(),
            AddressInfraMapper.toDomain(entity.getAddress())
        );
    }

}
