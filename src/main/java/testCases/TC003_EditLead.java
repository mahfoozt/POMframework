package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper1.ProjectSpecificWrapper1;

public class TC003_EditLead extends ProjectSpecificWrapper1{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC003_EditLead";
	}
	
	@Test(dataProvider="getData")
	public void EditLead(String uName, String pwd, String fName) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsLink()
	.clickFindLeads()
	.enterFirstName(fName)
	.clickFindLeadsBtn();
		 
	}

}
