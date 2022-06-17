package gmail.asteroster.owner;

import gmail.asteroster.owner.config.WebTestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests {

    @Test
    public void localWebTest() {
        System.setProperty("environment", "local");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());

        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getUrl()).isEqualTo("https://www.gog.com/ru");
        assertThat(config.version()).isEqualTo("99.0");
    }

    @Test
    public void remoteWebTest() {
        System.setProperty("environment", "remote");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());

        assertThat(config.getBrowser()).isEqualTo("CHROME");
        assertThat(config.getUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
        assertThat(config.version()).isEqualTo("99.0");
    }
}
