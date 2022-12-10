package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.ObservationParametersDTO;
import com.project.messiercatalog.service.ObservationParametersService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<ObservationParametersDTO> save(@RequestBody ObservationParametersDTO obserParaDto) {
		return service.save(obserParaDto);
	}

	@GetMapping("{id}")
	public ResponseEntity<ObservationParametersDTO> list(@PathVariable Long id) {
		return service.listId(id);
	}

	@PutMapping("{id}")
	public ResponseEntity<ObservationParametersDTO> listId(@PathVariable Long id,
			@RequestBody ObservationParametersDTO observation) {
		return service.updateDate(observation, id);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ObservationParametersDTO> delete(@PathVariable Long id) {
		return service.delete(id);
	}
}
