package joao.app.personapp.dataprovider.database.repository;

import joao.app.personapp.dataprovider.database.entity.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
