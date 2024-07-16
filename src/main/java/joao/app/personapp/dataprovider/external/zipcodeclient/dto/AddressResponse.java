package joao.app.personapp.dataprovider.external.zipcodeclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import joao.app.personapp.core.domain.Address;

public record AddressResponse(

    @JsonProperty("cep") String zipCode,
    @JsonProperty("logradouro") String street,
    @JsonProperty("complemento") String complement,
    @JsonProperty("bairro") String neighborhood,
    @JsonProperty("localidade") String city,
    @JsonProperty("uf") String uf

) {

    public static Address toDomain(AddressResponse response) {
        return Address.builder()
            .zipCode(response.zipCode)
            .street(response.street)
            .complement(response.complement)
            .neighborhood(response.neighborhood)
            .city(response.city)
            .uf(response.uf)
            .build();
    }

}
