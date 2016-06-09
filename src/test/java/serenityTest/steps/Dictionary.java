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
    private String price;
    private String groupSize;

    @Given("the customer is on the main page SkillsUp site")
    public void givenTheCustomerIsOnTheMainPageSkillsup(){
        customerSteps.customerIsOnTheMainPageSkillsup();
    }
    @When("the customer is on the our team page SkillsUp site")
    public void whenTheCustomerJumpOnOurTeampage(){
        customerSteps.customerJumpOnOurTeamPage();
    }
    @Then("customer should see <name>")
    public void thenShouldSeeTheCertainCoachName(@Named("name")String name, @Named ("position")String position){
        customerSteps.shouldSeeCoachName(name);
        customerSteps.shouldSeeCoachPosition(position);
    }

    @Given("the customer enter $name in search field")
    public void enterNameForSearch(String name){
        customerSteps.enterNameIntoSearchField(name);
    }
    @When("the customer press button search")
    public void pressSearchButton(){
        customerSteps.pressCustomerOnSearchButton();
    }
    @Then("he should see $coachTable")
    public void checkSearchResult(ExamplesTable coachTable){
            for (Map<String, String> row : coachTable.getRows()){
                String title = row.get("title");
                String description = row.get("description");
                assertThat(customerSteps.getListTitleFromSearchResultPage(), hasItem(containsString(title)));
                assertThat(customerSteps.getListDescriptionFromSearchResultPage(), hasItem(containsString(description)));
        }
    }
    @Then("he should see $expression")
    public void checkOutNegativeSearchResult(String expression){
        assertThat("The search result isn't empty", customerSteps.checkOutNegativeSearchResult(expression));
    }
    @When("the customer go to the concrete training page")
    public void goToTheTrainingPage(){
        customerSteps.customerJumpOnTrainingPage();
    }
    @Then("he may see <price> and <groupSize>")
    public void checkOutTrainingByPriceAndGroupSize(@Named("price") String price, @Named("groupSize") String groupSize){
        assertThat("Price isn't fit", customerSteps.checkOutPrice().contains(price));
        assertThat("Size of group isn't fit", customerSteps.checkOutGroupSize().contains(groupSize));
    }
}
