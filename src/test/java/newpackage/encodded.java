package newpackage;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class encodded {
	
public static WebDriver driver;


@Test
public  void name() {
		
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(coded(""));
		driver.close();
		
	}
static String coded(String input) {
		byte[] decodedstring =Base64.decodeBase64(input);

		return (new String(decodedstring));
		

}
}
