package d3dCom.stepdefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.Basepage;
import d3dCom.Pages.Registerpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static d3dCom.Basepage.driver;

public class Register_Step {
    public class Registration extends Basepage {
        public Registerpage rPage = PageFactory.initElements(Basepage.driver, Registerpage.class);


        //Registration Stepdefinations


        @When("^I click on Register button$")
        public void iClickOnRegisterButton() throws Throwable {

//        driver.findElement(By.linkText("Register")).click();
            rPage.Click_rbutton();
        }

        @And("^I enter a valid email address as \"([^\"]*)\"$")
        public void iEnterAValidEmailAddressAs(String userid) throws Throwable {
            //go to email
            //right click to find element by fire bug.
          //  driver.findElement(By.name("email")).sendKeys("userid");
            rPage.email();
        }

        @And("^I enter valid  new password as \"([^\"]*)\"$")
        public void iEnterValidNewPasswordAs(String new_password) throws Throwable {
          //  driver.findElement(By.name("pass1")).sendKeys(new_password);
            rPage.new_pwd(new_password);
        }

        @And("^I enter valid  confirm password as \"([^\"]*)\"$")
        public void iEnterValidConfirmPasswordAs(String confirm_password) throws Throwable {
         //   driver.findElement(By.name("pass2")).sendKeys(confirm_password);
            rPage.Confirm_pwd(confirm_password);
        }

//      @Then("^I click on \"([^\"]*)\" button.$")
//    public void iClickOnButton(String rb) throws Throwable {
//      driver.findElement(By.name("submit")).click(rb);
//     }


        @And("^I enter a invalid email address as \"([^\"]*)\"$")
        public void iEnterAInvalidEmailAddressAs(String userid) throws Throwable {
            //driver.findElement(By.name("email")).sendKeys(userid);
            rPage.invalid_email(userid);
        }


        @And("^I enter   invalid  new password as \"([^\"]*)\"$")
        public void iEnterInvalidNewPasswordAs(String new_password) throws Throwable {
           // driver.findElement(By.name("pass1")).sendKeys(new_password);
            rPage.invalid_newpwd(new_password);
        }


        @Then("^I click on \"([^\"]*)\" button\"$")
        public void iClickOnButton(String arg0) throws Throwable {
            //driver.findElement(By.name("submit")).click();
            rPage.click_botton();
        }

        @And("^I enter invalid  confirm password as \"([^\"]*)\"$")
        public void iEnterInvalidConfirmPasswordAs(String confirm_password) throws Throwable {
           // driver.findElement(By.name("pass2")).sendKeys(confirm_password);
            rPage.Invalid_confirmpwd(confirm_password);
        }


        @And("^I should see My account page\"$")
        public void iShouldSeeMyAccountPage() throws Throwable {
            //driver.findElement(By.linkText("My Account")).isDisplayed();
            rPage.myaccountpage();
        }


        @When("^I click on Resister button on register page$")
        public void iClickOnResisterButtonOnRegisterPage() throws Throwable {
           // driver.findElement(By.name("submit")).click();
            rPage.click_Rbutton();
        }

    }
}