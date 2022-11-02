package com.tax.employees.response;

public class AppResponse {

	public String message;

	public Object data;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public AppResponse(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

	public AppResponse() {
		super();
	}

}
