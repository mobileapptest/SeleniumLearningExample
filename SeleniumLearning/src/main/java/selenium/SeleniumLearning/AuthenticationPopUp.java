package selenium.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Passing username and password and URL. for Authentic Pop Up.
		//http://username:password@URL.com
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.get("admin:amin@http://the-internet.herokuapp.com/basic_auth");
		
		

	}

}
