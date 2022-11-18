package pages;

import wrapper1.ProjectSpecificWrapper1;

public class OpenTapsCRMPage extends ProjectSpecificWrapper1 {

	public OpenTapsCRMPage changeCompanyName(String ComName) {
		enterById("updateLeadForm_companyName", ComName);
		return this;
		
	}
	public ViewLeadPage clickUpdate() {
		clickByXpath("//input[@value='Update']");
		return new ViewLeadPage();
		
	
	
}


}
