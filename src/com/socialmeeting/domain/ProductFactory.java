package com.socialmeeting.domain;

public class ProductFactory {
	
	public ProductEdition create(Edition edition) {
		
		ProductEdition productEdition = null;
		
		if(edition == Edition.DEMONSTRATION) {
			productEdition = new DemonstrationEdition();
		}
		else if(edition == Edition.ENTERPRISE) {
			productEdition = new EnterpriseEdition();
		}
		else if(edition == Edition.PERSONAL) {
			productEdition = new PersonalEdition();
		}
		
		return productEdition;
	}

}
