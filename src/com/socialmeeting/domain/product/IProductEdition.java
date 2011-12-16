package com.socialmeeting.domain.product;

import java.util.List;

import com.socialmeeting.domain.Language;
import com.socialmeeting.domain.meeting.IMeetingType;
import com.socialmeeting.domain.meeting.MeetingTypes;

public interface IProductEdition {
	public void addMeetingType(MeetingTypes... meetingTypes);
	
	public void addLanguage(Language... languages);
	
	public boolean hasMeetingLimitation();
	
	public void setMeetingLimitation(boolean meetingLimitation);
	
	public boolean hasRecording();
	
	public void setRecording(boolean recording);
	
	public List<MeetingTypes> getMeetingTypes();
	
	public List<Language> getLanguages();
}
