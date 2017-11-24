package d3dCom;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage {

    public  static WebDriver driver;

    public void OpenBrowser(){
      String Browser = System.getProperty("Browser");

      if( Browser.equals("Chrome")){
          ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();}

        else if (Browser.equals("Firefox")) {
          FirefoxDriverManager.getInstance().setup();
          driver = new FirefoxDriver();
      }

      else if (Browser.equals("InternetExplorer")) {
          InternetExplorerDriverManager.getInstance().setup();
          driver = new InternetExplorerDriver();
      }
    }

    public void openUrl(String Urlname){
        driver.manage().window().maximize();//to maximise window

        //  FirefoxDriverManager.getInstance().setup();
        // driver= new FirefoxDriver();
        //  //go to url "http.//d3dsecurity.co.uk"
        driver.get(Urlname);
    }

    public void CloseBrowser(){
        driver.close();
    }
}
