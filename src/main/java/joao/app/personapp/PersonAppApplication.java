package joao.app.personapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({
    "joao.app.personapp.core",
    "joao.app.personapp.dataprovider",
    "joao.app.personapp.entrypoint"})
public class PersonAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonAppApplication.class, args);
    }

}
