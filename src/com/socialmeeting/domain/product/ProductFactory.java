package com.socialmeeting.domain.product;

public class ProductFactory {
	
	public IProductEdition create(Editions edition) {
		
		IProductEdition productEdition = null;
		
		if(edition == Editions.DEMONSTRATION) {
			productEdition = new DemonstrationEdition();
		}
		else if(edition == Editions.ENTERPRISE) {
			productEdition = new EnterpriseEdition();
		}
		else if(edition == Editions.PERSONAL) {
			productEdition = new PersonalEdition();
		}
		
		return productEdition;
	}

}
