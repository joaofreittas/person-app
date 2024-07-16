package joao.app.personapp.entrypoint.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {

    private String id;
    private String name;
    private String email;
    private AddressResponse address;

}
