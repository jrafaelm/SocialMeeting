package com.socialmeeting.domain.meeting;

public interface IMeetingType {

	public boolean hasModerador();
	public void setModerador(boolean flag);
	public boolean hasQueue();
	public void setQueue(boolean flag);
	
}
