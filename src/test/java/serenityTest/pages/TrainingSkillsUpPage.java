package serenityTest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://skillsup.ua/")
public class TrainingSkillsUpPage extends PageObject {
    private By moveToEducation = By.xpath("//a[@href='/training/']");
    private By moveToTraining = By.xpath("//a[@href='/training/training/']");
    private By goToConcreteTraining = By.xpath("//a[@href='/training/training/leader/']");
    private By checkOutPrice = By.xpath("//p[contains(text(),'4500')]");
    private By checkOutGroupSize = By.xpath("//strong[contains(text(),'16')]");

    public void jumpToTrainingPage(){
        Actions action = new Actions(super.getDriver());
        action.moveToElement(super.getDriver().findElement(moveToEducation)).perform();
        action.moveToElement(super.getDriver().findElement(moveToTraining)).perform();
        action.click(super.getDriver().findElement(goToConcreteTraining)).perform();
    }
    public String getPrice(){
        return find(checkOutPrice).getText();
    }
    public String getGroupSize(){
        return find(checkOutGroupSize).getText();
    }
}
