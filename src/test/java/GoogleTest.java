import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}