package wrapper1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel1;

//import com.beust.jcommander.Parameters;



public class ProjectSpecificWrapper1 extends GenericWrapper1 {
	
	public String excelfile;
	//@Parameters({"url"})
	@BeforeMethod
	public void login() throws IOException {
		invokeApp("http://leaftaps.com/opentaps");
		
	}
		
	@AfterMethod
	public void closeBrowser() {
		quitBrowser();
	}
	
	@DataProvider
	public String [][] getData() throws IOException{
		ReadExcel1 r1 = new ReadExcel1();
		return r1.readExcel(excelfile);
	}
	
	

}
	
	