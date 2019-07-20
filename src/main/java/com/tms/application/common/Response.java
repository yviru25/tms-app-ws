package com.tms.application.common;

import java.util.List;
import java.util.Map;

public class Response<T> {
		
	public Integer responseCode; 
	public T wrappedList;
	public String responseMessage;
	public Map<String,Object> errorMap;
	
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	
	public T getWrappedList() {
		return wrappedList;
	}
	public void setWrappedList(T wrappedList) {
		this.wrappedList = wrappedList;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Map<String, Object> getErrorMap() {
		return errorMap;
	}
	public void setErrorMap(Map<String, Object> errorMap) {
		this.errorMap = errorMap;
	}
}
