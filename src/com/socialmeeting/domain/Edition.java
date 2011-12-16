package com.socialmeeting.domain;

public enum Edition {
	
	DEMONSTRATION("D"), PERSONAL("P"), ENTERPRISE("E");
	
	private String value;
	
	private Edition(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}

}
