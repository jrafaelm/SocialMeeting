package com.socialmeeting.domain;

import java.util.List;

public class ProductFeatures implements ProductEdition {
	
	private boolean meetingLimitation;
	private boolean recording;
	private List<MeetingType> meetingTypes;
	private List<Language> languages;
	
	public void addMeetingType(MeetingType... meetingTypes) {
		for (MeetingType meetingType : meetingTypes) {
			getMeetingTypes().add(meetingType);
		}
//		getMeetingTypes().toArray(meetingTypes);
	}
	
	public void addLanguage(Language... languages) {
		for (Language language : languages) {
			getLanguages().add(language);
		}
	}
	
	public boolean isMeetingLimitation() {
		return meetingLimitation;
	}
	
	public void setMeetingLimitation(boolean meetingLimitation) {
		this.meetingLimitation = meetingLimitation;
	}
	
	public boolean isRecording() {
		return recording;
	}
	
	public void setRecording(boolean recording) {
		this.recording = recording;
	}
	
	public List<MeetingType> getMeetingTypes() {
		return meetingTypes;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

}
