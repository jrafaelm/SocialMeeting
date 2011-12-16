package com.socialmeeting.domain;

import java.util.List;

public interface ProductEdition {
	public void addMeetingType(MeetingType... meetingTypes);
	
	public void addLanguage(Language... languages);
	
	public boolean hasMeetingLimitation();
	
	public void setMeetingLimitation(boolean meetingLimitation);
	
	public boolean hasRecording();
	
	public void setRecording(boolean recording);
	
	public List<MeetingType> getMeetingTypes();
	
	public List<Language> getLanguages();
}
