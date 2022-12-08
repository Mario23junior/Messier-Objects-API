package com.project.messiercatalog.errorModularization;

import java.util.Date;

public class ModelErroReturn {

	private Integer status;
	private String message;
	private Date timestap;
	private String path;

	public ModelErroReturn() {
		// TODO Auto-generated constructor stub
	}

	public ModelErroReturn(Integer status, String message, Date timestap, String path) {
		super();
		this.status = status;
		this.message = message;
		this.timestap = timestap;
		this.path = path;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimestap() {
		return timestap;
	}

	public void setTimestap(Date timestap) {
		this.timestap = timestap;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
