package com.hartford.Esignature.dao;

import java.sql.SQLException;

import com.hartford.Esignature.exception.ESignatureException;

public interface EsignDao {

	public void createEnv() throws SQLException, ESignatureException;

	public void getEnvelopeDetails() throws SQLException, ClassNotFoundException, ESignatureException;

	public void updateEnv();

	public void EnvStatus();

	public void EnvCreatedAt();

	public void EnvModified();

}
