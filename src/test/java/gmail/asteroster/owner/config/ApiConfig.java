package gmail.asteroster.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:api.properties",
        "file:/tmp/secret.properties"
})

public interface ApiConfig extends Config {

    @Key("baseApiUrl")
    String baseApiUrl();

    @Key("apiToken")
    String apiToken();


}
