package serenityTest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import serenityTest.steps.serenity.CustomerSteps;

import java.util.Map;

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
    @Then("he should see the name <name>")
    @Alias("he should see the name $name")
    public void thenShouldSeeTheCertainCoachName(String name){
        customerSteps.shouldSeeCoachName(name);
    }
    @Then("coach view contains $coachesTable")
    public void findAllCoaches(ExamplesTable coahesTable){
        for (Map<String,String> row : coahesTable.getRows()) {
            String name = row.get("name");
            String course = row.get("course");
            System.out.println(name + course);
        }
    }


}
