import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fleapo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://wishbox2.vercel.app/");
        driver.manage().window().maximize();
        
        driver.findElement(By.className(".form-control ")).sendKeys("Shubham Verma");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        Thread.sleep(5);
        
        driver.findElement(By.xpath("//h2[text()='Enter OTP']")).isDisplayed();
        
        driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        Thread.sleep(5);
        
        driver.findElement(By.xpath("//div[@class='add-new-p-card flex-center-center text-center']")).click();
        
        driver.findElement(By.xpath("//h2[text()='Create new wishlist']")).isDisplayed();
        
        driver.findElement(By.xpath("//input[@placeholder='Wishlist Name']")).sendKeys("Shubham Verma");
        
        driver.findElement(By.id("description")).sendKeys("Demo");
        
        driver.findElement(By.id("upload-cover-input")).sendKeys("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.shorturl.at%2Fimg%2Fshorturl-icon.png&tbnid=BItbp5rBnoFabM&vet=12ahUKEwiM_aykwpOBAxVKSmwGHc61BfwQMygAegQIARBz..i&imgrefurl=https%3A%2F%2Fwww.shorturl.at%2F&docid=8m5cWULGS8amNM&w=350&h=350&q=image%20short%20url&ved=2ahUKEwiM_aykwpOBAxVKSmwGHc61BfwQMygAegQIARBz");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        Thread.sleep(5);
        
        driver.findElement(By.xpath("//h2[text()='Shubham Verma']")).isDisplayed();
        
        Thread.sleep(5);
        
        driver.quit();
        
       
    }
}
