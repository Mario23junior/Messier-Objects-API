package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.ObservationParametersDTO;
import com.project.messiercatalog.service.ObservationParametersService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project/observationParameters/")
public class ObservationParametersController {

	private ObservationParametersService service;

	public ObservationParametersController(ObservationParametersService servic) {
		this.service = servic;
	}

	@PostMapping
	public ResponseEntity<ObservationParametersDTO> save(
			@RequestBody ObservationParametersDTO obserParaDto) {
		return service.save(obserParaDto);
	}
	
 }
