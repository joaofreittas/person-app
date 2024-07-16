package joao.app.personapp.entrypoint.api.controller;

import joao.app.personapp.entrypoint.api.dto.PersonRequest;
import joao.app.personapp.entrypoint.api.dto.PersonResponse;
import joao.app.personapp.entrypoint.api.facade.PersonFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonFacade facade;

    @PostMapping
    public ResponseEntity<PersonResponse> registerPerson(@RequestBody PersonRequest personRequest) {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(facade.registerPerson(personRequest));
    }

    @GetMapping
    public ResponseEntity<List<PersonResponse>> findAll() {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(facade.findAll());
    }

    @PatchMapping("/set-address/{personId}/{zipCode}")
    public ResponseEntity<Void> setAddressForPerson(@PathVariable String personId, @PathVariable String zipCode) {
        facade.setAddressForPerson(personId, zipCode);
        return ResponseEntity.ok().build();
    }

}
