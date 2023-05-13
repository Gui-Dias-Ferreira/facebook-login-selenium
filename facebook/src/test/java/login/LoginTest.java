package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[data-testid='royal_email']"))
				.sendKeys("email");

		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("senha");

		driver.findElement(By.cssSelector("button[data-testid='royal_login_button'")).click();

		driver.close();

	}

}
