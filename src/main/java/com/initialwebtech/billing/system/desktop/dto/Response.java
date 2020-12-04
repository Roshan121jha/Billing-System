package com.initialwebtech.billing.system.desktop.dto;

import com.initialwebtech.billing.system.desktop.exception.CustomException;
import com.initialwebtech.billing.system.desktop.exception.ErrorCode;

import java.util.Date;

public class Response {

	private Boolean success;

	private Object data;


	private Date timestamp;

	private String message;

	private String errorCode;

	public Response() {
		this.timestamp = new Date();
	}

	public Response(Throwable exception) {
		this();
		this.fail();

		String errorCodeString = ErrorCode.UNKNOWN.code();

		if (exception instanceof CustomException) {

			CustomException ex = (CustomException) exception;
			ErrorCode errorCode = ex.getErrorCode();

			errorCodeString = errorCode.code();
		}

		this.setErrorCode(errorCodeString);
	}

	public Response(Throwable exception, String message) {
		this(exception);
		this.setMessage(message);
	}

	public Boolean getSuccess() {
		return this.success;
	}

	private void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void fail() {
		this.setSuccess(Boolean.FALSE);
	}

	public void succeed() {
		this.setSuccess(Boolean.TRUE);
	}

}