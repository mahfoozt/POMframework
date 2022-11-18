package pages;

import wrapper1.ProjectSpecificWrapper1;

public class CreateLeadPage extends ProjectSpecificWrapper1 {
	
	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName",cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
		
	}
	public CreateLeadPage enterLastName(String lName) {
		enterById("createLeadForm_lastName",lName );
		return this;
			
	}
	public ViewLeadPage clickCreateLead() {
		clickByXpath("//input[@name='submitButton']");
		return new ViewLeadPage();
		
		
	}
	
	
}
