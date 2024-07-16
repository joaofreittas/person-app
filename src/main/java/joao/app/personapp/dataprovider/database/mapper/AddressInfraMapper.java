package joao.app.personapp.dataprovider.database.mapper;

import joao.app.personapp.core.domain.Address;
import joao.app.personapp.dataprovider.database.entity.AddressEntity;

public class AddressInfraMapper {

    public static AddressEntity toEntity(Address address) {
        if (address == null) {
            return null;
        }

        return new AddressEntity(
            address.getZipCode(),
            address.getStreet(),
            address.getComplement(),
            address.getNeighborhood(),
            address.getCity(),
            address.getUf()
        );
    }

    public static Address toDomain(AddressEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Address(
            entity.getZipCode(),
            entity.getStreet(),
            entity.getComplement(),
            entity.getNeighborhood(),
            entity.getCity(),
            entity.getUf()
        );
    }

}
