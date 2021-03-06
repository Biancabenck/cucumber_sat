package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public Driver() {
	}

	private static WebDriver driver;

	public static final WebDriver getDriver() {

		if (driver == null) {
			String browser = System.getProperty("browser") != null ? System.getProperty("browser")
					: ConfigReader.getProperty("browser");

			switch (browser) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
		}
		return driver;

	}

	public static void closerDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}






}
