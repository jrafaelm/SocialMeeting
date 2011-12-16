package com.socialmeeting.domain;

public class DemonstrationEdition extends ProductFeatures implements ProductEdition {
	
	public DemonstrationEdition() {
		setMeetingLimitation(true);
		setRecording(false);
//		addMeetingType(standard); 
//		addLanguage(english);
	}

}
