package TestNGAutomation.PriviledgeCalculator;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class PriviledgeCalculatorTest {
    static ExtentReports report;
    Properties p;
    String mortgageAmount;
    String interestRate;
	@BeforeSuite
	public void ReadPropertyFile() throws IOException {
		report=new ExtentReports("ExtentReportsResult.html");
		PropertiesReader pr=new PropertiesReader();
		p=pr.getProperty();
		mortgageAmount=p.getProperty("MortgageAmount");
		interestRate=p.getProperty("InterestRate");
		
	}
}
