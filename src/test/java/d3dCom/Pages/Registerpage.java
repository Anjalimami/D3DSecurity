package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends Basepage {


    public void Click_rbutton() {
        driver.findElement(By.linkText("Register")).click();
    }

    public void email() {
        driver.findElement(By.name("email")).sendKeys("userid");
    }
    public void new_pwd(String new_password ){ driver.findElement(By.name("pass1")).sendKeys(new_password);}

    //why it will be String??
    public void Confirm_pwd(String confirm_password){driver.findElement(By.name("pass2")).sendKeys(confirm_password);}

    public void invalid_email(String userid){driver.findElement(By.name("email")).sendKeys(userid);}


    public void invalid_newpwd (String new_password){driver.findElement(By.name("pass1")).sendKeys(new_password);}

    public void click_botton (){driver.findElement(By.name("submit")).click();}


    public void Invalid_confirmpwd(String confirm_password){driver.findElement(By.name("pass2")).sendKeys(confirm_password);}

    public void myaccountpage (){driver.findElement(By.linkText("My Account")).isDisplayed();}

    public void click_Rbutton(){ driver.findElement(By.name("submit")).click();}

}