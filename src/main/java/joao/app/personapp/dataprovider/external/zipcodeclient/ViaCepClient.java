package joao.app.personapp.dataprovider.external.zipcodeclient;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import joao.app.personapp.dataprovider.external.zipcodeclient.dto.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "via-cep-client")
@Headers({"Content-Type: application/json; charset=utf-8", "Accept: application/json; charset=utf-8"})
public interface ViaCepClient {

    @RequestLine("GET /ws/{zipCode}/json/")
    AddressResponse findAddressByZipCode(@Param("zipCode") final String zipCode);

}
