package joao.app.personapp.dataprovider.external.zipcodeclient;

import joao.app.personapp.core.domain.Address;
import joao.app.personapp.core.gateway.AddressGateway;
import joao.app.personapp.dataprovider.external.zipcodeclient.dto.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AddressGatewayImpl implements AddressGateway {

    private final ViaCepClient viaCepClient;

    @Override
    public Address findAddressByZipCode(final String zipCode) {
        return AddressResponse.toDomain(viaCepClient.findAddressByZipCode(zipCode));
    }

}
