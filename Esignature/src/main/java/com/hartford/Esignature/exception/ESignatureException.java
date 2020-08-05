package com.hartford.Esignature.exception;

public class ESignatureException  extends Exception{

	private String errorMessage;

	public ESignatureException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ESignatureException [errorMessage=" + errorMessage + "]";
	}

}
