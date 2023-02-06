package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikuli {
	
	WebDriver driver;
	@Test
	public void abc() throws  InterruptedException, FindFailed {
		
		Screen s =new Screen();
		Pattern p =new Pattern("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots\\subscription.PNG");
		Pattern p1 =new Pattern("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots\\videoclick.PNG");
		Pattern p2 =new Pattern("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots\\skipadd.PNG");
		Pattern p3=new Pattern("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots\\pause.PNG");
		//Pattern p4=new Pattern("C:\\Users\\cdipa\\OneDrive\\Pictures\\Screenshots");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		s.click(p);
		s.click(p1);
		s.click(p2);
		Thread.sleep(5000);
		s.click(p3);
		
		
			
	}
}
