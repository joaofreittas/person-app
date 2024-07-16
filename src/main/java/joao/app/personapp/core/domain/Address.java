package joao.app.personapp.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Address {

    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;

}
