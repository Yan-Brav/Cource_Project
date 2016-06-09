package serenityTest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://skillsup.ua/")
public class SkillsupPage extends PageObject {
    private By moveToOurTeam = By.xpath("//a[@href='/about/our-team/']");
    private By moveToAboutUs = By.xpath("//a[@href='/about/']");
    private By members = By.className("name");
    private By position = By.className("position");



    public void jumpToOurTeamPage(){
        Actions action = new Actions(super.getDriver());
        action.moveToElement(super.getDriver().findElement(moveToAboutUs)).build().perform();
        action.click(super.getDriver().findElement(moveToOurTeam)).build().perform();
    }
    public List<String> getListCoachNames(){
        List<String> coachNames = new ArrayList<>();
        List<WebElementFacade> elements = findAll(members);
        for (WebElement element : elements){
            coachNames.add(element.getText());
        }
        return coachNames;
    }
    public List<String> getListCoachPosition(){
        List<String> coachPosition = new ArrayList<String>();
        List<WebElementFacade> elements = findAll(position);
        for (WebElement element : elements){
            coachPosition.add(element.getText());
        }
        return coachPosition;
    }

}
