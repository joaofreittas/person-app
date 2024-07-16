package joao.app.personapp.entrypoint.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class AddressResponse {

    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;

}
