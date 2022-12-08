package com.project.messiercatalog.errorModularization;

import java.util.Date;

import com.project.messiercatalog.exceptions.HandlingErrorReturnMessage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class customModularization {

	@ExceptionHandler(HandlingErrorReturnMessage.class)
	public ModelErroReturn returnErroCustom(HandlingErrorReturnMessage ex, WebRequest request) {
		ModelErroReturn returnbase = new ModelErroReturn();
		returnbase.setMessage(ex.getMessage());
		returnbase.setPath(request.getDescription(false));
		returnbase.setTimestap(new Date());
		returnbase.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return returnbase;
	}

}
