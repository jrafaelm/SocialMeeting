package com.socialmeeting.domain.meeting;

import java.io.Serializable;

public class MeetingFeatures implements IMeetingType, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean moderador;
	private boolean queue;
	
	public boolean hasModerador() {
		return moderador;
	}
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	public boolean hasQueue() {
		return queue;
	}
	public void setQueue(boolean queue) {
		this.queue = queue;
	}
	

	
	
}
