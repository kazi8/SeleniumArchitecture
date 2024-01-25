package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(linkText = "Recruitment") private WebElement recruitmentLink;
    WebDriver driver= Browser.getDriver();

    public RecruitmentPage clickRecruitment() {
        recruitmentLink.click();
        return PageFactory.initElements(driver, RecruitmentPage.class);
    }
}
