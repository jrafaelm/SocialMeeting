package com.socialmeeting.domain.meeting;

public class MeetingFactory {
	
	public static Meeting create(String type) {
		
		Meeting meeting = null;
		
		if(type.equalsIgnoreCase(MeetingTypes.STANDARD.name())) {
			meeting = new Meeting("Standard Meeting", new StandardMeetingType());
		}
		else if(type.equalsIgnoreCase(MeetingTypes.DEMOCRATIC.name())) {
			meeting = new Meeting("Democratic Meeting", new DemocraticMeetingType());
		}
		else if(type.equalsIgnoreCase(MeetingTypes.PRIVATE.name())) {
			meeting = new Meeting("Private Meeting", new PrivateMeetingType());
		}
		
		return meeting;
	}

}
