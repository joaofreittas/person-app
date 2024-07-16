package joao.app.personapp.entrypoint.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {

    private String name;
    private String email;

}
