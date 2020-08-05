package com.hartford.Esignature.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hartford.Esignature.exception.ESignatureException;

@RestController
public class ESignatureController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Value("${app.title}") 
	private String name;
	@Value("${app.description}")
	private String description;

	@RequestMapping("/msg")
	public String getMsg() throws ESignatureException {
		try{
			log.info("entered into /msg resource");
			return "hello world welcome" + name + description;

		}

		 catch (Exception e) {
			// TODO: handle exception
			throw new ESignatureException("exception ocuured at  /msg request");
		}
		
	}

}
