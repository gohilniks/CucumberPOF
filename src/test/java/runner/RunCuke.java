package runner;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html"},
		features = "src/test/resources/features",
		glue = "steps",
		monochrome = true,
		tags = {"@Search-Cars"})
public class RunCuke  extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void setup() {
		//SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		//Date curDate = new Date();
		//String strDate = sdf.format(curDate);
		//String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + strDate + ".html";
		//File newFile = new File(fileName);
		
		//Reporter.loadXMLConfig(new File("\\src\\test\\resources\\ReportsConfig.xml"));
	}
}
