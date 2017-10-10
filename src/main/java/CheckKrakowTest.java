import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckKrakowTest {

    @Test
            public void CheckWordKrakow () {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuki\\Desktop\\selenium-java-3.6.0(1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get ("https://google.com");
    driver.findElement(By.id("lst-ib")).sendKeys("Kraków");
    driver.findElement(By.id("lst-ib")).submit();
    String word = driver.findElement(By.id("rhs_title")).getText();
        Assertions.assertEquals("Kraków", word);

    }
}
