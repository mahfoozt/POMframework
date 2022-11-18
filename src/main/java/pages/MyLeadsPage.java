package pages;

import wrapper1.ProjectSpecificWrapper1;

public class MyLeadsPage extends ProjectSpecificWrapper1{ 
	
	
	public CreateLeadPage clickCreateLeadLink() {
		clickByLinkText("Create Lead");
		return new CreateLeadPage();	
	}
	
	public FindLeadsPage clickFindLeads() {
		clickByLinkText("Find Leads");
		return new FindLeadsPage();	
		
	}
	public MergeLeadsPage clickMergeLeads() {
		clickByXpath("//a[text()='Merge Leads']");
		return new MergeLeadsPage();	
		
	}
	
	public void moveToNewWindow() {
	
}
	
	
}
