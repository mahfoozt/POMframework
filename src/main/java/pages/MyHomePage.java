package pages;

import wrapper1.ProjectSpecificWrapper1;

public class MyHomePage extends ProjectSpecificWrapper1 {
	
	public MyLeadsPage clickLeadsLink() {
		clickByLinkText("Create Lead");
		return new MyLeadsPage();
		   		
		
	}

}
