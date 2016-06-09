package serenityTest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://skillsup.ua/")
public class SearchPage extends PageObject {
    private By searchField = By.id("u5016-2");
    private By searchButton = By.id("u1552-2");
    private By searchResultTitle = By.className("xsltsearch_result_title");
    private By searchResultDescription = By.className("xsltsearch_result_description");

    public void enterNameInSearchField(String name){
        find(searchField).type(name);
    }
    public void pressSearchButton(){
        find(searchButton).click();
    }
    public List<String> createListTitleFromSearchResultPage(){
        List<String> listTitle = new ArrayList<>();
        List<WebElementFacade> elementFacadeList = findAll(searchResultTitle);
        for (WebElement element : elementFacadeList){
            listTitle.add(element.getText());
        }
        return listTitle;
    }
    public List<String> createListDescriptionFromSearchResultPage(){
        List<String> listDescription = new ArrayList<>();
        List<WebElementFacade> elementFacadeList = findAll(searchResultDescription);
        for (WebElement element : elementFacadeList){
            listDescription.add(element.getText());
        }
        return listDescription;
    }
}
