package pages;

import wrapper1.ProjectSpecificWrapper1;

public class FindLeadsPage extends ProjectSpecificWrapper1 {

	public FindLeadsPage enterFirstName(String Fname) {
		enterByXpath("(//input[@name='firstName'])[3]", Fname);
		
		return this;
	}
	public FindLeadsPage clickFindLeadsBtn() {
		clickByXpath("//button[text()='Find Leads']");
		return this;
		
	}
	public ViewLeadPage clickFstResLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return new ViewLeadPage();
		
	}
	
	

}
