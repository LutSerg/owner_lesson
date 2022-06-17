package gmail.asteroster.owner;

import gmail.asteroster.owner.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {
    @Test
    public void apiTestFromRes () {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.baseApiUrl()).isEqualTo("https://www.gog.com/");
        assertThat(config.apiToken()).isEqualTo("daAa34GhLda221fVa");
    }

    @Test
    public void apiTestSysProp () {
        System.setProperty("baseApiUrl", "https://www.gog.com/");
        System.setProperty("apiToken", "daAa34GhLda221fVa");

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.baseApiUrl()).isEqualTo("https://www.gog.com/");
        assertThat(config.apiToken()).isEqualTo("daAa34GhLda221fVa");
    }
}
