package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper1.ProjectSpecificWrapper1;

public class TC004_DeleteLead extends ProjectSpecificWrapper1{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC004_DeleteLead";
	}
	
	@Test(dataProvider="getData")
	public void createLead(String uName, String pwd, String cName, String PhNo, String capId) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsLink();
	
	
		 
	}
	
	

}
