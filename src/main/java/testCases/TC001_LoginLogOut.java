package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper1.ProjectSpecificWrapper1;

public class TC001_LoginLogOut extends ProjectSpecificWrapper1{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC001_LoginLogOut";
	}
	
	@Test(dataProvider="getData")
	public void loginLogOut(String uName, String pwd) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin();
	
		
	}
	
	

}
