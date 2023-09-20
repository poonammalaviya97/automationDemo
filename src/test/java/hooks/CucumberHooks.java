package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("----Before hook----");
    }

    @After
    public void tearDown(){
        System.out.println("----After hook----");
    }


}
