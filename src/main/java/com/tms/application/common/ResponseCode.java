package com.tms.application.common;

public class ResponseCode {
		
	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>> RESPONSE CODE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	     
	    public static Integer SUCCESS_CODE = 200;
	    public static Integer INTERAL_SERVER_ERROR_CODE = 500;
	    public static Integer SERVICE_UNAVIABLE_ERROR_CODE = 503;
	    public static Integer BAD_REQUEST_CODE = 400;
	    public static Integer NOT_AUTHORIZIED_ERROR_CODE = 401;
	    public static Integer FORBIDDEN_ERROR_CODE = 403;
	    public static Integer NOT_FOUND_ERROR_CODE = 404;
	    public static Integer HTTP_NOT_ALLOWED_ERROR_CODE = 405;   //HTTP method not supported
	    public static Integer MEDIA_TYPE_NOT_SUPPORTED = 415;
	    
	    
	    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>> RESPONSE MESSAGE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	    
	    public static String SUCCESS_MESSAGE = "Successful";
	    public static String FAILURE_MESSAGE = "Failure";
	    public static String INTERNAL_SERVICE_ERROR_MESSAGE = "Interal Server Error";
	    public static String SERVICE_UNAVIABLE_MESSAGE = "Server is temporarily unavailable or busy";
	    public static String BAD_REQUEST_MESSAGE = "Bad Request";
	    public static String NOT_AUTHORIZED_MESSAGE = "Authentication failure";
	    public static String FORBIDDEN_MESSAGE = "Not permitted to access";
	    public static String NOT_FOUND_MESSAGE = "Couldn’t find resource";
	    public static String HTTP_NOT_ALLOWED_MESSAGE = "HTTP method not supported";
	    public static String MEDIA_TYPE_NOT_SUPPORTED_MESSAGE  = "Client posted media type not supported";
	    
	    
}
