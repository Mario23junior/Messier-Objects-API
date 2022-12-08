package com.project.messiercatalog.errorModularization;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelErroReturn {

	private Integer status;
	private String message;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ", locale = "pt_br")
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

	public String getTimestap() {
 	    SimpleDateFormat dateformt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    String stringdate = dateformt.format(timestap);
		return stringdate;
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
