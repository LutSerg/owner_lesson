package gmail.asteroster.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {
    public String getBaseUrl () {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        return baseUrl;
    }

    public Browser getBrowser () {
        // зачитываем данные из командной строки
        String browser = System.getProperty("browser");
        //обрабатываем дефолтное значение
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        //конвертируем в возвращаемый тип
        return Browser.valueOf(browser);
    }

    public URL getRemoteUrl() {
        // зачитываем данные из командной строки
        String remoteUrl = System.getProperty("remoteUrl");
        // обрабатывает дефолтное значение
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "https://selenium:4444/wd/hub";
        }
        // конвертируем в возращаемый тип
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
