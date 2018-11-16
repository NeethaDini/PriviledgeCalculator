package TestNGAutomation.PriviledgeCalculator.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PriviledgeCalculator {
	public static WebDriver driver;
     public static final By txt_MortgageAmount= By.name("MORTAMT");
     public static final By txt_InterestRate= By.name("RATE");
     public static final By txt_MortgagePayment=By.name("MAINPAY");
     public static final By sel_MortgageFrequency=By.name("PFREQ");
     public static final By sel_Accelerated=By.name("ACCSEL");
     public static final By txt_LumpsumPayment=By.name("LUMPAMT");
     public static final By txt_Period=By.name("LUMPYRS");
     public static final By txt_MortPaymentIncrease=By.name("INCPAY");
     public static final By txt_MortPaymentIncreasePeriod=By.name("INCYEARS");
     public static final By btn_Calculate=By.id("btnCalculate");
     public static final By txt_RevertAmortizationPeriod=By.name("AMNEWY");
     public static final By txt_RevertAmortizationMonth=By.name("AMNEWM");
     public static final By txt_AmortizationSavings=By.name("AMINTSAVE");
     public static final By btn_ComputeAmortizationSchedule=By.xpath("//input[@value='Compute Amortization Schedule']");
     
     public PriviledgeCalculator(WebDriver driver) {
    	 this.driver=driver;
     }
     
     public void setMortgageAmount(String mortgageAmount) {
    	 driver.findElement(txt_MortgageAmount).clear();
    	 driver.findElement(txt_MortgageAmount).sendKeys(mortgageAmount);
     }
     
     public void setInterestRate(String interestRate) {
    	 driver.findElement(txt_InterestRate).clear();
    	 driver.findElement(txt_InterestRate).sendKeys(interestRate);
     }
     
     public void setMortgagePayment(String mortgagePayment) {
    	 driver.findElement(txt_MortgagePayment).clear();
    	 driver.findElement(txt_MortgagePayment).sendKeys(mortgagePayment);
     }
     
     public void selectMortgageFrequency(String mortgageFrequency)
     {
    	 WebElement ele=driver.findElement(sel_MortgageFrequency);
    	 Select select=new Select(ele);
    	 select.selectByVisibleText(mortgageFrequency);
     }
     
     public void selectAccelerated(String accelerated) {
    	 WebElement ele1=driver.findElement(sel_Accelerated);
    	 Select sel=new Select(ele1);
    	 sel.selectByVisibleText(accelerated);
     }
     
     public void setlumpsumPayment(String lumpsumPayment) {
    	 driver.findElement(txt_LumpsumPayment).clear();
    	 driver.findElement(txt_LumpsumPayment).sendKeys(lumpsumPayment);
     }
     
     public void setPeriod(String Period) {
    	 driver.findElement(txt_Period).clear();
    	 driver.findElement(txt_Period).sendKeys(Period);
     }
     
     public void setmortPaymentIncrease(String mortPaymentIncrease) {
    	 driver.findElement(txt_MortPaymentIncrease).clear();
    	 driver.findElement(txt_MortPaymentIncrease).sendKeys(mortPaymentIncrease);
     }
     
     public void setmortPaymentIncreasePeriod(String mortPaymentIncreasePeriod) {
    	 driver.findElement(txt_MortPaymentIncreasePeriod).clear();
    	 driver.findElement(txt_MortPaymentIncreasePeriod).sendKeys(mortPaymentIncreasePeriod);
     }
     
     public void clickCalculate() {
    	 
    	 driver.findElement(btn_Calculate).click();;
     }
     
     public String getRevertAmortizationPeriod() {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 String value = (String) js.executeScript("return arguments[0].value", driver.findElement(txt_RevertAmortizationPeriod)).toString();
    	 return value;
     }
     
     public String getRevertAmortizationMonth() {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 String value=(String)js.executeScript("return arguments[0].value" , driver.findElement(txt_RevertAmortizationMonth)).toString();
    	 return value;
     }
     
     public String getAmortizationSavings() {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 String value=(String)js.executeScript("return arguments[0].value", driver.findElement(txt_AmortizationSavings)).toString();
    	 return value;
     }
     
     public void clickbtnComputeAmortizationSchedule() {
    	 driver.findElement(btn_ComputeAmortizationSchedule).click();
     }
}
