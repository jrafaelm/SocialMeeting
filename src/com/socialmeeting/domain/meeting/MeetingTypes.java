package com.socialmeeting.domain.meeting;

import java.io.Serializable;

public enum MeetingTypes implements Serializable{
	
	STANDARD("S"), DEMOCRATIC("D"), PRIVATE("P");
	
	private String value;
	
	private MeetingTypes(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}

}
