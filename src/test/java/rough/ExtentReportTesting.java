package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTesting {
	public WebDriver driver;
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\test-output\\myReport.html");
		//Title of report
		htmlReporter.config().setDocumentTitle("Automation Report");
		//Name of report
		htmlReporter.config().setReportName("Functional Report");
		//Set report theme
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Tester", "Nikunj");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		//waitDriver = new WebDriverWait(driver, 15);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/");
	}
	
	@Test
	public void nopCommerceTitleTest() {
		test = extent.createTest("nopCommerceTitleTest");
		String title = driver.getTitle();
		Assert.assertEquals(title, "nopCommerce demo store");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		driver.quit();
	}
}
