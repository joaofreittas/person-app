package joao.app.personapp.core.gateway;

import joao.app.personapp.core.domain.Address;

public interface AddressGateway {

    Address findAddressByZipCode(final String zipCode);

}
