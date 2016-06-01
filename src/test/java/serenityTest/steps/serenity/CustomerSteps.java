package serenityTest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenityTest.pages.SkillsupPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class CustomerSteps extends ScenarioSteps {
    SkillsupPage pageSkillsup;

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

}
