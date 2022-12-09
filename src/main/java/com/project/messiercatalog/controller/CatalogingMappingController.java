package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.CatalogingMappingDTO;
import com.project.messiercatalog.service.CatalogingMappingService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project/cataloging/")
public class CatalogingMappingController {

	private CatalogingMappingService service;

	public CatalogingMappingController(CatalogingMappingService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<CatalogingMappingDTO> save(@RequestBody CatalogingMappingDTO catalgDto) {
		return service.saveCatalogin(catalgDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<CatalogingMappingDTO> listid(@PathVariable Long id) {
		return service.listCatalogin(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CatalogingMappingDTO> update(@PathVariable Long id, 
			@RequestBody CatalogingMappingDTO catalogMDto){
		return service.updateCatalogin(id, catalogMDto);
		
	}
}
