package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.DeepObjectDTO;
import com.project.messiercatalog.service.DeepObjectService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project/catalog/")
public class DeepObjectCotroller {

	private DeepObjectService service;

	public DeepObjectCotroller(DeepObjectService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<DeepObjectDTO> save(@RequestBody DeepObjectDTO deepObjectDto) {
		return service.saveDeepObject(deepObjectDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DeepObjectDTO> listid(@PathVariable Long id) {
		return service.listInfoId(id);
	}
}
