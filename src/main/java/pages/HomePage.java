 package pages;

import wrapper1.ProjectSpecificWrapper1;

public class HomePage extends ProjectSpecificWrapper1{
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage();	
	}
	

	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		return new MyHomePage();
		
	}
	

}
  
