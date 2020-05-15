package com.salestaxes.vo;

public class ResponseVO<T> {

	private T output;

	private String message;

	private String error;

	public T getOutput() {
		return output;
	}

	public void setOutput(T output) {
		this.output = output;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
