package com.socialmeeting.domain.meeting;

import java.io.Serializable;

public class Meeting implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;
	private IMeetingType meetingType;
	
	
	
	public Meeting(String description, IMeetingType meetingType) {
		super();
		this.description = description;
		this.meetingType = meetingType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public IMeetingType getMeetingType() {
		return meetingType;
	}
	public void setMeetingType(IMeetingType meetingType) {
		this.meetingType = meetingType;
	}
	
	

}
