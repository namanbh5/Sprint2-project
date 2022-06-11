package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Media;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefination2 extends Base{
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
    }

	@And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
    	LoginPage lp =new LoginPage(driver);
        lp.getUsername().sendKeys(username);
        lp.getPassword().sendKeys(password);
        lp.getLogin().click();
    }

    @Then("^Click on add to cart$")
    public void click_on_add_to_cart() throws Throwable {
        Media  a=new Media(driver);
        a.getmedia().click();
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	driver.quit();
    }

}
