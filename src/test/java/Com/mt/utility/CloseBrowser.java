package Com.mt.utility;

import org.testng.annotations.Test;
import Com.mt.config.Config;

public class CloseBrowser 
{
@Test
public void CloseBrowser()
{
Config.Driver.quit();
}
	
}
