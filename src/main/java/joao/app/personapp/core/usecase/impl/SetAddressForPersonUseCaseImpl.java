package joao.app.personapp.core.usecase.impl;

import joao.app.personapp.core.gateway.AddressGateway;
import joao.app.personapp.core.gateway.PersonGateway;
import joao.app.personapp.core.usecase.SetAddressForPersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetAddressForPersonUseCaseImpl implements SetAddressForPersonUseCase {

    private final PersonGateway personGateway;
    private final AddressGateway addressGateway;

    @Override
    public void execute(final String zipCode, final String personId) {
        personGateway.findById(personId).ifPresent((person -> {
            var address = addressGateway.findAddressByZipCode(zipCode);
            person.setAddress(address);
            personGateway.update(person, personId);
        }));
    }

}
