package Base;

import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
public class BeforeClassTest {

    @Parameters("BName")
    @BeforeClass
    public void launchApplication(String bName){
        System.out.println("BROWSER NAME IS "+bName);
    }
}
