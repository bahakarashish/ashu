package Com.mt.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.mt.utility.LaunchApp;

public class Launch 
{
@Parameters({"browser","url","seconds"})
@Test
public void executeLaunch(String browsername,String urlnm,int seconds)throws IOException
{
LaunchApp lc= new LaunchApp();
lc.openBrowser(browsername);
lc.EnterApplicationURL(urlnm);
lc.maximizeBrowser();
lc.waittillLoginpageLoaded(seconds);			
}	
}

