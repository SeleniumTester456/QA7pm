package maventest.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemo {
	
	@Test
	public void setUp() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
	}

}
