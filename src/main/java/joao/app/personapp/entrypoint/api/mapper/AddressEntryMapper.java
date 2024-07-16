package joao.app.personapp.entrypoint.api.mapper;

import joao.app.personapp.core.domain.Address;
import joao.app.personapp.entrypoint.api.dto.AddressResponse;

public class AddressEntryMapper {

    public static AddressResponse toResponse(final Address address) {
        if (address == null) {
            return null;
        }

        return AddressResponse.builder()
            .zipCode(address.getZipCode())
            .street(address.getStreet())
            .complement(address.getComplement())
            .neighborhood(address.getNeighborhood())
            .city(address.getCity())
            .uf(address.getUf())
            .build();
    }

}
