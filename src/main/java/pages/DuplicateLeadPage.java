package pages;

import wrapper1.ProjectSpecificWrapper1;

public class DuplicateLeadPage extends ProjectSpecificWrapper1{
	
	public DuplicateLeadPage verifyTitleAsDuplicateLead(String title) {
		verifyTitle(title);
		return this;
		
	}
	
	public ViewLeadPage clickCreateLeadBtn() {
		clickByXpath("//input[@value='Create Lead']");
		return new ViewLeadPage(); 
		
		
		
	}

}
