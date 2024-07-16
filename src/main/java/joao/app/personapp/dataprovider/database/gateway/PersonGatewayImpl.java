package joao.app.personapp.dataprovider.database.gateway;

import joao.app.personapp.core.domain.Person;
import joao.app.personapp.core.gateway.PersonGateway;
import joao.app.personapp.dataprovider.database.mapper.PersonInfrastructureMapper;
import joao.app.personapp.dataprovider.database.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonGatewayImpl implements PersonGateway {

    private final PersonRepository personRepository;

    @Override
    public Person save(final Person person) {
        var entity = PersonInfrastructureMapper.toEntity(person);
        var entitySaved = personRepository.save(entity);
        return PersonInfrastructureMapper.toDomain(entitySaved);
    }

    @Override
    public Person update(final Person person, final String id) {
        var entity = PersonInfrastructureMapper.toEntity(person);
        var entitySaved = personRepository.save(entity);
        return PersonInfrastructureMapper.toDomain(entitySaved);
    }

    @Override
    public List<Person> findAll() {
        return personRepository
            .findAll()
            .stream()
            .map(PersonInfrastructureMapper::toDomain)
            .toList();
    }

    @Override
    public Optional<Person> findById(final String id) {
        return personRepository
            .findById(id)
            .map(PersonInfrastructureMapper::toDomain);
    }

}
