import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fleapo {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://wishbox2.vercel.app/");
        driver.manage().window().maximize();
        
        // Add your automation code here
        
        // Don't forget to close the driver when done
        driver.quit();
    }
}
