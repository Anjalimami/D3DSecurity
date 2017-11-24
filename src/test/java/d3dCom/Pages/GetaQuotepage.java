package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class GetaQuotepage extends Basepage {


    public void click_menu(){ driver.findElement(By.linkText("https://www.d3dsecurity.co.uk/products/")).click();}

    public void first_name(){ driver.findElement(By.name("First Name *"));}

    public void Last_name(){ driver.findElement(By.name("last Name *"));}

    public void Email(){ driver.findElement(By.name("your-email"));}

    public void phonenum(){ driver.findElement(By.name("tel-879"));}


}
