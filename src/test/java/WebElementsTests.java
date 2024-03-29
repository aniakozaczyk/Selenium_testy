import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementsTests {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/dev/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://przyklady.javastart.pl/test/full_form.html");
    }

    @Test
    public void typingIntoWebElementTest(){
        WebElement userNameFiled= driver.findElement(By.id("uresrname"));
        userNameFiled.sendKeys("Selenium Start");

        String typeUserNameValue= userNameFiled.getAttribute("value");


        Assert.assertEquals(typeUserNameValue, "Selenium Start");
    }


    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

}
