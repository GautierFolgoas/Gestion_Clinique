package com.myapp.gestionclinique;

import java.util.HashMap;

public class ExceptionsMessages {
	
	private HashMap<String, String> tabExceptionMessage = new HashMap<String, String>();
	
	
	public ExceptionsMessages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionsMessages(HashMap<String, String> tabExceptionMessage) {
		super();
		this.tabExceptionMessage = tabExceptionMessage;
	}

	public HashMap<String, String> getTabExceptionMessage() {
		return tabExceptionMessage;
	}

	public void setTabExceptionMessage(HashMap<String, String> tabExceptionMessage) {
		this.tabExceptionMessage = tabExceptionMessage;
	}

}
