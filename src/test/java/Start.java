import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd = new ChromeDriver();
        wd.get("https://www.busybucket.io/"); // without history
        //wd.navigate().to("https://www.busybucket.io/"); // with history

        wd.close();
        //wd.quit();

    }
}
