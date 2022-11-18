package pages;

import wrapper1.ProjectSpecificWrapper1;

public class LoginPage extends ProjectSpecificWrapper1{
	
	
	public LoginPage enterUserName(String uName) {	
		enterById("username", uName);
		return this;
	}
	public LoginPage enterPassword(String pwd) {			
		enterById("password", pwd);
		return this;
		
	}
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
		
	}	

	
	
}