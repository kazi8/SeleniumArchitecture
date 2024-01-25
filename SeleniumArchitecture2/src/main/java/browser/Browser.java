package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class Browser {

    private static WebDriver driver;
    private static String driverName= "Chrome";

    public static void setWebDriver(){
        if(driverName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (driverName.equalsIgnoreCase("firefox")) {
            driver= new FirefoxDriver();
        }
        else
            driver= new EdgeDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }
}
