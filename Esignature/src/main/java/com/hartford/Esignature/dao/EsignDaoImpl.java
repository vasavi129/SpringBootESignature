package com.hartford.Esignature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;

import com.hartford.Esignature.exception.ESignatureException;

public class EsignDaoImpl implements EsignDao {

	String uri = "jdbc:mysql://localhost:3306/vasavi";
	String un = "root";
	String pw = "root";
	
	@Value(value = "mysql.password")
	private String pwd;
	Connection conn = null;
	Statement stmnt = null;

	@Override
	public void createEnv() throws SQLException, ESignatureException {
		String sql = "INSERT INTO  (envelopeId,envelopeName,envelopemailId) VALUES (?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(uri, un, pw);

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 13);
			ps.setString(2, "vinod");
			ps.setString(3, "vinod656@gmail.com");

			int affectedRows = ps.executeUpdate();
			System.out.println(affectedRows);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			throw new ESignatureException("exception occured while inserting EnvelopeDetails");
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException, ESignatureException {
		EsignDaoImpl impl = new EsignDaoImpl();
		// impl.createEnv();
		impl.getEnvelopeDetails();
	}

	@Override
	public void updateEnv() {
		// TODO Auto-generated method stub

	}

	@Override
	public void EnvStatus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void EnvCreatedAt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void EnvModified() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getEnvelopeDetails() throws SQLException, ClassNotFoundException, ESignatureException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(uri, un, pw);
			stmnt = conn.createStatement();
			String sql = "select envelopeId, envelopeName,envelopemailId from EnvelopeDetails";
			ResultSet rs = stmnt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("envelopeId");
				String name = rs.getString("envelopeName");
				String gmail = rs.getString("envelopemailId");
				System.out.println("  id : " + id + "  name : " + name + "  envelopemailId : " + gmail);

			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			throw new ESignatureException("exception ocuured at query");

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			throw new ESignatureException("exception ocuured while retrieving envelope details");

		} finally {
			try {
				if (stmnt != null) {
					stmnt.close();
				}

			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
