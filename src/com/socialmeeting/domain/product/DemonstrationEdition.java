package com.socialmeeting.domain.product;

import com.socialmeeting.domain.meeting.MeetingTypes;

public class DemonstrationEdition extends ProductFeatures implements IProductEdition {
	
	public DemonstrationEdition() {
		setMeetingLimitation(true);
		setRecording(false);
		addMeetingType(MeetingTypes.STANDARD); 
//		addLanguage(english);
	}

}
