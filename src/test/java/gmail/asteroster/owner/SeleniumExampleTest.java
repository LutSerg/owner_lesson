package gmail.asteroster.owner;

import gmail.asteroster.owner.config.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumExampleTest {


    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGitHubTitle () {

        //код выполнения теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
        driver.quit();
    }

    @AfterEach
    public void closeBrowser () {
        driver.quit();
    }
}
