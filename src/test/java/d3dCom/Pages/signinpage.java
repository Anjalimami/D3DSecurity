package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class signinpage extends Basepage {


    public void Click_Login() {
        driver.findElement(By.xpath("//*[@id='menu-item-4532']/a")).click();
    }

    public void Myaccount() {
        Boolean Actual_Myaccount = driver.findElement(By.linkText("My Account")).isDisplayed();
        assertTrue(Actual_Myaccount);

    }

    public void Log_out() {
        boolean Actual_Logout = driver.findElement(By.linkText("Log Out")).isDisplayed();
    }

    public void Login_button() {
        driver.findElement(By.name("submit")).click();
    }

    public void Error_message(String Errormessage) {
        String actual_error = driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]/p\n")).getText();
        assertEquals(Errormessage, actual_error);
        driver.close();
    }

    public void whyd3d() {
        driver.findElement(By.linkText("Why D3D")).click();
    }

    public void enterUsername(String Username) {
        driver.findElement(By.xpath(".//*[@id='post-4521']/div/div/form/fieldset[1]/div[1]/input")).sendKeys(Username);
    }

    public void CurrentUrl(String arg0) {

        // get elements for I should see
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains(arg0));
        driver.close();


    }

    public void enterpassword(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
    }

    public void clicklog_in() {
        driver.findElement(By.linkText("log in")).click();
    }

    public void Headermenu() {
        String actual_header = driver.findElement(By.xpath(".//*[@id='masthead']/div[1]/div[1]/div/a/img")).getText();

    }
}

