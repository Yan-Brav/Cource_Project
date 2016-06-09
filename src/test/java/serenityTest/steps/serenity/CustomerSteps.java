package serenityTest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenityTest.pages.SearchPage;
import serenityTest.pages.SkillsupPage;
import serenityTest.pages.TrainingSkillsUpPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class CustomerSteps extends ScenarioSteps {
    SkillsupPage pageSkillsup;
    TrainingSkillsUpPage pageTraining;
    SearchPage pageSearch;

    @Step
    public void customerIsOnTheMainPageSkillsup(){
        pageSkillsup.open();
    }
    @Step
    public void customerJumpOnOurTeamPage(){
        pageSkillsup.jumpToOurTeamPage();
    }
    @Step
    public void shouldSeeCoachName(String name){
        assertThat(pageSkillsup.getListCoachNames(), hasItem(containsString(name)));
    }
    @Step
    public void shouldSeeCoachPosition(String position){
        assertThat(pageSkillsup.getListCoachPosition(), hasItem(containsString(position)));
    }
    @Step
    public void enterNameIntoSearchField(String name){
        pageSearch.enterNameInSearchField(name);
    }
    @Step
    public void pressCustomerOnSearchButton(){
        pageSearch.pressSearchButton();
    }
    @Step
    public List<String> getListTitleFromSearchResultPage(){
        return pageSearch.createListTitleFromSearchResultPage();
    }
    @Step
    public List<String> getListDescriptionFromSearchResultPage(){
        return pageSearch.createListDescriptionFromSearchResultPage();
    }
    @Step
    public boolean checkOutNegativeSearchResult(String expression){
        return pageSearch.getNegativeSummary().equals(expression);
    }
    @Step
    public void customerJumpOnTrainingPage(){
        pageTraining.jumpToTrainingPage();
    }
    @Step
    public String checkOutPrice(){
        return pageTraining.getPrice();
    }
    @Step
    public String checkOutGroupSize(){
        return pageTraining.getGroupSize();
    }

}
