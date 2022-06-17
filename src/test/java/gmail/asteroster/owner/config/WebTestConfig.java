package gmail.asteroster.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "classpath:${environment}.properties",
})
public interface WebTestConfig extends Config {

    @Key("url")
    String getUrl();

    @Key("browser")
    String getBrowser ();

    @Key("version")
    String version();
}
