package serenityTest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://skillsup.ua/")
public class SkillsupPage extends PageObject {
    private By getOurTeam = By.linkText("Наша команда");
    private By members = By.className("name");

    public void jumpToOurTeamPage(){
       find(getOurTeam).click();
    }
    public List<String> getListCoachNames(){
        List<String> coachNames = new ArrayList<String>();
        List<WebElementFacade> elements = findAll(members);
        for (WebElement element : elements){
            coachNames.add(element.getText());
        }
        return coachNames;
    }
}
