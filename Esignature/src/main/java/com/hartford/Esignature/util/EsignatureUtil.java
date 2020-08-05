package com.hartford.Esignature.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hartford.Esignature.model.Envelope;
import com.hartford.Esignature.model.Signer;
import com.sun.org.apache.bcel.internal.generic.ObjectType;

public class EsignatureUtil {

	public String ObjToJson(Envelope env) {
		String obj = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			// mapper.setDefaultPrettyPrinter(pp)
			obj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(env);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public Envelope JsonToObject(String string) {
		Envelope envobj = null;
		ObjectMapper mapper = new ObjectMapper();
		String obj = "{\"envelopeId\":\"123\":\"envelopeName\":\"vasavi\":\"createdAt\":\"2-07-2020\":\"modifiedAt\":\"20-07-2020\"}";
		try {
			envobj = mapper.readValue(string, Envelope.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return envobj;
	}

	public static void main(String[] args) {
		EsignatureUtil esignatureUtil = new EsignatureUtil();
		Signer signer = new Signer();
		signer.setSignerName("vasu");
		signer.setSignerMailId("vasu@gmail.com");
		Envelope env = new Envelope();
		env.setEnvelopeId(123);
		env.setEnvelopeName("vas");
		env.setCreatedAt("17-07-2020");
		env.setModifiedAt("19-07-2020");
		env.setSigner(signer);

		System.out.println(esignatureUtil.ObjToJson(env));
		// esignatureUtil.ObjToJson();
		// sesignatureUtil.JsonToObject(obj);
	}
}
