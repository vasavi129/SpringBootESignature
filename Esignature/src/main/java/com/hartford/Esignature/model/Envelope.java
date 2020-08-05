package com.hartford.Esignature.model;

public class Envelope {

	private int envelopeId;

	private String envelopeName;

	private String createdAt;

	private String modifiedAt;

	private Signer signer;

	public Envelope() {
		super();
	}

	public int getEnvelopeId() {
		return envelopeId;
	}

	public void setEnvelopeId(int envelopeId) {
		this.envelopeId = envelopeId;
	}

	public String getEnvelopeName() {
		return envelopeName;
	}

	public void setEnvelopeName(String envelopeName) {
		this.envelopeName = envelopeName;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Signer getSigner() {
		return signer;
	}

	public void setSigner(Signer signer) {
		this.signer = signer;
	}

	@Override
	public String toString() {
		return "Envelope [envelopeId=" + envelopeId + ", envelopeName=" + envelopeName + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + ", signer=" + signer + "]";
	}

}
