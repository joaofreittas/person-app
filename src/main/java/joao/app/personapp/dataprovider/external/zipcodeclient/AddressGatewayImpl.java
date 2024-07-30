package joao.app.personapp.dataprovider.external.zipcodeclient;

import io.github.resilience4j.retry.annotation.Retry;
import joao.app.personapp.core.common.exception.AddressClientException;
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
    @Retry(name = "addressRetry", fallbackMethod = "findAddressByZipCodeFallback")
    public Address findAddressByZipCode(final String zipCode) {
        return AddressResponse.toDomain(viaCepClient.findAddressByZipCode(zipCode));
    }

    public Address findAddressByZipCodeFallback(final String zipCode, final Throwable throwable) {
        throw new AddressClientException("address service is unavailable. error: " + throwable.getMessage());
    }

}
