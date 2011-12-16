package com.socialmeeting.domain.product;

import java.util.List;

import com.socialmeeting.domain.Language;
import com.socialmeeting.domain.meeting.IMeetingType;
import com.socialmeeting.domain.meeting.MeetingTypes;

public class ProductFeatures implements IProductEdition {
	
	private boolean meetingLimitation;
	private boolean recording;
	private List<MeetingTypes> meetingTypes;
	private List<Language> languages;
	
	public void addMeetingType(MeetingTypes... meetingTypes) {
		for (MeetingTypes meetingType : meetingTypes) {
			getMeetingTypes().add(meetingType);
		}
//		getMeetingTypes().toArray(meetingTypes);
	}
	
	public void addLanguage(Language... languages) {
		for (Language language : languages) {
			getLanguages().add(language);
		}
	}
	
	public boolean hasMeetingLimitation() {
		return meetingLimitation;
	}
	
	public void setMeetingLimitation(boolean meetingLimitation) {
		this.meetingLimitation = meetingLimitation;
	}
	
	public boolean hasRecording() {
		return recording;
	}
	
	public void setRecording(boolean recording) {
		this.recording = recording;
	}
	
	public List<MeetingTypes> getMeetingTypes() {
		return meetingTypes;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

}
