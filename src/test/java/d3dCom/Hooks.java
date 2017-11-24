package d3dCom;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    Basepage bPage = new Basepage();

    @Before
    public void SetupBrowser() {//open browser
        bPage.OpenBrowser();
    }

    @After
    public void TearDown() {//close browser
        bPage.CloseBrowser();
    }
}
