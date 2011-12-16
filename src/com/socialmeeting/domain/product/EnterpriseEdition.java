package com.socialmeeting.domain.product;

import com.socialmeeting.domain.meeting.MeetingTypes;

public class EnterpriseEdition extends ProductFeatures {
	
	public EnterpriseEdition() {
		setMeetingLimitation(false);
		setRecording(true);
		addMeetingType(MeetingTypes.STANDARD,MeetingTypes.DEMOCRATIC,MeetingTypes.PRIVATE); 
//		addLanguage(english,france,espanish);
	}

}
