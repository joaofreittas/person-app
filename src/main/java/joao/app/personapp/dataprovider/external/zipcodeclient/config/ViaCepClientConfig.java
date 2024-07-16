package joao.app.personapp.dataprovider.external.zipcodeclient.config;

import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.httpclient.ApacheHttpClient;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import joao.app.personapp.dataprovider.external.zipcodeclient.ViaCepClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties("services.via-cep")
public record ViaCepClientConfig(
    String url,
    int maxConnections,
    int maxConnectionsPerRoute,
    int connectionTimeout,
    int socketTimeout
) {

    @Bean
    public ViaCepClient viaCepClient() {
        return getDefaultClientBuilder()
            .target(ViaCepClient.class, this.url);
    }

    private Feign.Builder getDefaultClientBuilder() {
        return Feign.builder()
            .client(feignClient())
            .encoder(new JacksonEncoder())
            .decoder(new JacksonDecoder())
            .logLevel(Logger.Level.FULL);
    }

    private Client feignClient() {
        return new ApacheHttpClient(HttpClientBuilder.create()
            .setMaxConnTotal(maxConnections)
            .setMaxConnPerRoute(maxConnectionsPerRoute)
            .setDefaultRequestConfig(RequestConfig.custom()
                .setConnectTimeout(connectionTimeout)
                .setSocketTimeout(socketTimeout)
                .build())
            .build());
    }

}



