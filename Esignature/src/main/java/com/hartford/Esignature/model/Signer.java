package com.hartford.Esignature.model;

public class Signer {

	private String signerName;
	private String signerMailId;
	public Signer() {
		super();
	}
	public Signer(String signerName, String signerMailId) {
		super();
		this.signerName = signerName;
		this.signerMailId = signerMailId;
	}
	public String getSignerName() {
		return signerName;
	}
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}
	public String getSignerMailId() {
		return signerMailId;
	}
	public void setSignerMailId(String signerMailId) {
		this.signerMailId = signerMailId;
	}
	@Override
	public String toString() {
		return "Signer [signerName=" + signerName + ", signerMailId=" + signerMailId + "]";
	}
	
	
}
