package step_def;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {

	@Before
	public void setup() {
		// System.out.println("before each feature scenario");
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		Driver.closerDriver();

		// System.out.println("After each feature scenario");

	}

}
