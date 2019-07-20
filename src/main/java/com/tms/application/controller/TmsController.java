package com.tms.application.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.application.common.Response;
import com.tms.application.common.ResponseCode;


@RestController
@RequestMapping("TMSController")
public class TmsController {
		
	  @GetMapping(value = "/ping",produces = MediaType.APPLICATION_JSON_VALUE)
	   public Response<String> pingController() {
		  Response<String> response = new Response<String>();
		  response.setResponseCode(ResponseCode.SUCCESS_CODE);
		  response.setWrappedList("ping success !....");
		  response.setResponseMessage(ResponseCode.SUCCESS_MESSAGE);
		  response.setErrorMap(null);
		  return response;
	   }
}
