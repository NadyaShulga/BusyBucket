import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver wd;

    @BeforeClass
    public void preConditions(){
        //open browser
        wd = new ChromeDriver();
        //open site
        wd.get("");

    }

   @Test
    public void loginSuccess(){
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)

    }

    @Test
    public void loginWrongEmail(){
        //open form
        //fill form
        //submit form
    }

    @Test
    public void loginWrongPassword(){
        //open form
        //fill form
        //submit form
    }

    @AfterClass
    public void postCondition(){
        //close browser
        wd.close();
    }
}
