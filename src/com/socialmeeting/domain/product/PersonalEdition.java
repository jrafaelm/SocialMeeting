package com.socialmeeting.domain.product;

import com.socialmeeting.domain.meeting.MeetingTypes;
import com.socialmeeting.domain.meeting.StandardMeetingType;

public class PersonalEdition extends ProductFeatures {
	
	public PersonalEdition() {
		setMeetingLimitation(true);
		setRecording(false);
		addMeetingType(MeetingTypes.STANDARD,MeetingTypes.DEMOCRATIC,MeetingTypes.PRIVATE); 
//		addLanguage(english);
	}

}
