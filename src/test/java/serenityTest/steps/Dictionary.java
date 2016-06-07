package serenityTest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import serenityTest.steps.serenity.CustomerSteps;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class Dictionary {
    @Steps
    CustomerSteps customerSteps;
    @Given("the customer is on the main page SkillsUp site")
    public void givenTheCustomerIsOnTheMainPageSkillsup(){
        customerSteps.customerIsOnTheMainPageSkillsup();
    }
    @When("the customer is on the our team page SkillsUp site")
    public void whenTheCustomerJumpOnOurTeampage(){
        customerSteps.customerJumpOnOurTeamPage();
    }
    @Then("customer should see <name>")
    public void thenShouldSeeTheCertainCoachName(@Named("name")String name){
        customerSteps.shouldSeeCoachName(name);
    }
    /*@Then("coach view contains $coachesTable")
    public void findAllCoaches(ExamplesTable coahesTable){
        for (Map<String,String> row : coahesTable.getRows()) {
            String name = row.get("name");
            String course = row.get("course");
            System.out.println(name + " " + course);
        }
    }*/
    @Given("the customer enter $coach in search field")
    @Alias("the customer enter 'Alexander Galkovskiy' in search field")
    public void enterNameForSearch(String coach){
        customerSteps.enterNameIntoSearchField(coach);
    }
    @When("the customer press button search")
    public void pressSearchButton(){
        customerSteps.pressCustomerOnSearchButton();
    }
    @Then("he should see $coachTable")
    public void checkSearchResult(ExamplesTable coachTable){
            for (Map<String, String> row : coachTable.getRows()){
                String title = row.get("title");
                String desciption = row.get("desciption");
                //System.out.println("The coach " + name + " has certificate # " + certificate);
                assertThat(customerSteps.getListTitleFromSearchResultPage(), hasItem(containsString(title)));
                assertThat(customerSteps.getListDescriptionFromSearchResultPage(), hasItem(containsString(desciption)));
                /*boolean checkOutTitle = false;
                for (String title : customerSteps.getListTitleFromSearchResultPage()){
                     checkOutTitle = title.equals(certificate);
                }
                assertTrue(checkOutTitle);
                boolean checkOutDescription = false;
                for (String description : customerSteps.getListDescriptionFromSearchResultPage()){
                    checkOutDescription = description.equals(name);
                }
                assertTrue(checkOutDescription);*/
        }
    }
    @Then("he should see $alTable")
    public void checkSearchResultByArtemLoginov(ExamplesTable alTable){
            for (Map<String, String> row : alTable.getRows()){
                String position = row.get("position");
                String course = row.get("course");
                System.out.println("Artem Loginov teach " + course + " and work as " + position);
                assertThat(customerSteps.getListDescriptionFromSearchResultPage(), hasItem(containsString(position)));
                assertThat(customerSteps.getListDescriptionFromSearchResultPage(), hasItem(containsString(course)));
        }
    }


}
