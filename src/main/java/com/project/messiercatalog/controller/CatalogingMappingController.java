package com.project.messiercatalog.controller;

import com.project.messiercatalog.dto.CatalogingMappingDTO;
import com.project.messiercatalog.service.CatalogingMappingService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
