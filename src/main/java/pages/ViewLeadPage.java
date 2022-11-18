package pages;

import wrapper1.ProjectSpecificWrapper1;

public class ViewLeadPage extends ProjectSpecificWrapper1{
	
/*	public ViewLeadPage verifyFirstName(String firstName) {
		verifyTextByXpath("//span[text()='First name']", firstName);
		return this;	
		
	}*/
	public ViewLeadPage verifyTitleOfPage(String title) {
		verifyTitleOfPage(title);
		return this;
		
	}
	public OpenTapsCRMPage clickEdit() {
		clickByLinkText("Edit");
		return new OpenTapsCRMPage();
				
	}
/*	public ViewLeadPage confirmChangeName(String firstName) {
		verifyFirstName(firstName);
		return this;
		
	}*/
	
}
