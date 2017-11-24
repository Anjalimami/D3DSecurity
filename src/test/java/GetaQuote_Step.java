import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Basepage;
import d3dCom.Pages.GetaQuotepage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

import static d3dCom.Basepage.driver;

public class GetaQuote_Step extends Basepage {

    public WebDriver driver;
    public GetaQuotepage Gpage = PageFactory.initElements(Basepage.driver, GetaQuotepage.class);


    @When("^I click on products on the menu button$")
    public void iClickOnProductsOnTheMenuButton() throws Throwable {
        driver.findElement(By.linkText("https://www.d3dsecurity.co.uk/products/")).click();
        Gpage.click_menu();
    }

    @When("^I entered first name \"([^\"]*)\"$")
    public void iEnteredFirstName(String arg0) throws Throwable {
        //driver.findElement(By.name("First Name *"));
        Gpage.first_name();
    }

    @And("^I entered last name \"([^\"]*)\"$")
    public void iEnteredLastName(String arg0) throws Throwable {
        // driver.findElement(By.name("last-name"));
        Gpage.Last_name();
    }

    @And("^I entered email as \"([^\"]*)\"$")
    public void iEnteredEmailAs(String arg0) throws Throwable {
        // driver.findElement(By.name("your-email"));
        Gpage.Email();
    }

    @And("^I entered phone number as \"([^\"]*)\"$")
    public void iEnteredPhoneNumberAs(String arg0) throws Throwable {
        // driver.findElement(By.name("tel-879"));
        Gpage.phonenum();
    }


    @And("^I should enter Subject as \"([^\"]*)\"$")
    public void iShouldEnterSubjectAs(String arg0) throws Throwable {
        driver.findElement(By.name("your-subject")).sendKeys();
    }

    @And("^I should enter message as \"([^\"]*)\"$")
    public void iShouldEnterMessageAs(String arg0) throws Throwable {
        driver.findElement(By.name("your-message")).sendKeys();
    }

    @And("^I click on the check box I am not a Robert$")
    public void iClickOnTheCheckBoxIAmNotARobert() throws Throwable {
        driver.findElement(By.name("captcha-005")).click();
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {

    }

    @Then("^I should see error message$")
    public void iShouldSeeErrorMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should enter First name as \"([^\"]*)\"$")
    public void iShouldEnterFirstNameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter below details:$")
    public void iEnterBelowDetails(DataTable details) throws Throwable {//to Create datatable
        System.out.println(details);
        System.out.println(details.raw());
        System.out.println(details.raw().get(1));
        System.out.println(details.raw().get(1).get(0));
        System.out.println(details.raw().get(1).get(1));
        System.out.println(details.raw().get(1).get(2));
        System.out.println(details.raw().get(1).get(3));


        String Firstname = details.raw().get(1).get(0);

        String lastname = details.raw().get(1).get(1);
        String email = details.raw().get(1).get(2);

        String phonenum = details.raw().get(1).get(3);

    }
}

