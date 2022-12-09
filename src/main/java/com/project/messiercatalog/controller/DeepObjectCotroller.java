package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.DeepObjectDTO;
import com.project.messiercatalog.service.DeepObjectService;

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

	@PutMapping("{id}")
	public ResponseEntity<DeepObjectDTO> update(@PathVariable Long id, 
			@RequestBody DeepObjectDTO deepObjectDto) {
		return service.update(deepObjectDto, id);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<DeepObjectDTO> delete(@PathVariable Long id) {
		return service.delete(id);
	}
	
}
