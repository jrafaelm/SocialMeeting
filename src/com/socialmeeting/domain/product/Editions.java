package com.socialmeeting.domain.product;

import java.io.Serializable;

public enum Editions implements Serializable{
	
	DEMONSTRATION("D"), PERSONAL("P"), ENTERPRISE("E");
	
	private String value;
	
	private Editions(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value;
	}

}
