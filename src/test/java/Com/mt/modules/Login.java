package Com.mt.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.mt.pages.FlightFinderpage;
import Com.mt.pages.loginpage;

public class Login 
{
@Parameters ({"usernm","passwd"})
@Test
public void executeLogin(String username,String password)
{
loginpage lgpg= new loginpage();
lgpg.loadLoginpage();
lgpg.enterUsername(username);
lgpg.enterPassword(password);
lgpg.clickonLogin();
		
FlightFinderpage fg= new FlightFinderpage();
fg.loadFlightFinderpage();
fg.verifyFlightFinderimg();
fg.clickonSignoff();	
}
}

