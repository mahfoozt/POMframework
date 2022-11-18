package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper1.ProjectSpecificWrapper1;

public class TC006_MergeLead extends ProjectSpecificWrapper1{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC006_MergeLead";
	}
	
	@Test(dataProvider="getData")
	public void createLead(String uName, String pwd, String cName, String fName, String lName) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsLink()
	.clickCreateLeadLink()
	.enterCompanyName(cName)
	.enterFirstName(fName)
	.enterLastName(lName) 
	.clickCreateLead();
	
		 
	}
	
	

}
