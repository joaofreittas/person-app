package joao.app.personapp.dataprovider.database.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressEntity {

    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;

}
