package gmail.asteroster.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {
    // зачитываем данные из командной строки
    @Key("baseUrl")
    // обрабатывает дефолтное значение
    @DefaultValue("https://github.com")
    // конвертируем в возращаемый тип
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser ();

    @Key("remoteUrl")
    @DefaultValue("https://localhost:4444/wd/hub")
    URL getRemoteUrl ();
}
