import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUp {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://www.busybucket.io/");
        wd.manage().window().maximize();
    }

    @Test
    public void SighUp(){
        wd.findElement(By.xpath("//a[@class='primary-small-button w-button']")).click();

        wd.findElement(By.cssSelector("#companyName")).sendKeys("Company");
        wd.findElement(By.cssSelector("#firstName")).sendKeys("John");
        wd.findElement(By.cssSelector("#lastName")).sendKeys("Smith");
        wd.findElement(By.cssSelector("#email")).sendKeys("john16@gmail.com");
        wd.findElement(By.cssSelector("#phoneNumber")).click();
        wd.findElement(By.cssSelector("#phoneNumber")).sendKeys("9293932116");
        wd.findElement(By.cssSelector("#loginPassword")).sendKeys("John12345");
        wd.findElement(By.cssSelector("#passwordConfirmation")).sendKeys("John12345");
        wd.findElement(By.cssSelector("input[type='checkbox']")).click();
        wd.findElement(By.cssSelector("button[type='submit']")).click();

        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement code = wd.findElement(By.xpath("p[@class='MuiTypography-root MuiTypography-body1 css-1usnxkn']"));
        Assert.assertEquals(code.getText(), "Enter Verification Code");

    }
}
