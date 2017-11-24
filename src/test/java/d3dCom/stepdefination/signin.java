package d3dCom.stepdefination;

import cucumber.api.PendingException;
import d3dCom.Basepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Pages.signinpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class signin extends Basepage {
    public signinpage sPage = PageFactory.initElements(Basepage.driver, signinpage.class);
    @Given("^I go to Url \"([^\"]*)\"$")
    public void iGoToUrl(String Urlname) throws Throwable {
        //Open a browser

//        OpenBrowser();
        //driver.manage().window().maximize();//to maximise window

        //  FirefoxDriverManager.getInstance().setup();
        // driver= new FirefoxDriver();
        //  //go to url "http.//d3dsecurity.co.uk"
//        driver.get(Urlname);

        openUrl(Urlname);
    }

    @When("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        //When I click on login button.

        sPage.Click_Login();
    }

    @Given("^I enter login as \"([^\"]*)\"$")
    public void iEnterLoginAs(String Username) throws Throwable {
// I enter login

        sPage.enterUsername(Username);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        //I enter password.
        //  driver.findElement(By.name("pwd")).sendKeys(password);
        sPage.enterpassword(password);
    }

    @When("^I click Log in button$")
    public void iClickLogInButton() throws Throwable {
        //I click on login button.
        //driver.findElement(By.linkText("log in")).click();

        sPage.clicklog_in();
    }

    @Then("^I should see \"([^\"]*)\" header with menu$")
    public void iShouldSeeHeaderWithMenu(String expected_header) throws Throwable {
        // 1: we need element of header
//     2: Get the Text of that element.
//     3: Move that Text to a variable. variable is actual_header
// 4: Compare variable with Expected_header
        //    String actual_header = driver.findElement(By.xpath(".//*[@id='masthead']/div[1]/div[1]/div/a/img")).getText();

//        assertEquals(expected_header, actual_header);

        sPage.Headermenu();
    }

    @And("^I should see My Account button$")
    public void iShouldSeeMyAccountButton() throws Throwable {

        //Get the element of my account button
        //driver.findElement(By.name("element4").isDisplayed();
        // Move above line to a bolean variable
        //compare
        sPage.Myaccount();

    }

    @And("^I should see Log Out button$")
    public void iShouldSeeLogOutButton() throws Throwable {
// Get the elements of log out button.
        //driver.findElement(By.name("element4").isDisplayed();
        // Move above line to a bolean variable
        //compire
        sPage.Log_out();

    }

    @When("^I click Log in button on login page$")
    public void iClickLogInButtonOnLoginPage() throws Throwable {
        sPage.Login_button();
    }

    @Then("^I should see  error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String Expected_errormessage) throws Throwable {
        //Get elements for error message
        //move the text to a variable actual_error
        //compire message variable with Expected_errormessage
        sPage.Error_message(Expected_errormessage);
    }


    @When("^I click on the link why d(\\d+)d$")
    public void iClickOnTheLinkWhyDD(int arg0) throws Throwable {
        // Get element for I click on the link
        sPage.whyd3d();


    }

    @Then("^I should see \"([^\"]*)\" in the current url$")
    public void iShouldSeeInTheCurrentUrl(String arg0) throws Throwable {
        // get elements for I should see
        //   String currentUrl = driver.getCurrentUrl();
        //   assertTrue(currentUrl.contains(arg0));
        //   driver.close();

        sPage.CurrentUrl(arg0);
    }


}