package com.project.messiercatalog.service;

import com.project.messiercatalog.dto.CatalogingMappingDTO;
import com.project.messiercatalog.exceptions.HandlingErrorReturnMessage;
import com.project.messiercatalog.model.CatalogingMapping;
import com.project.messiercatalog.repository.CatalogingMappingRepository;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CatalogingMappingService {
  
	private ModelMapper mapper;
	private CatalogingMappingRepository repository;
	
	public CatalogingMappingService(ModelMapper mapper, CatalogingMappingRepository repository) {
		this.mapper = mapper;
		this.repository = repository;
	}
	
	
	public ResponseEntity<CatalogingMappingDTO> saveDeepObject(CatalogingMappingDTO catalaMdTO) {
 		try {
 			CatalogingMapping convertEntity = mapper.map(catalaMdTO, CatalogingMapping.class);
 			CatalogingMapping convertBase = repository.save(convertEntity);
			ResponseEntity<CatalogingMappingDTO> response = ResponseEntity.status(HttpStatus.OK)
					.body(mapper.map(convertBase, CatalogingMappingDTO.class));
			return response;
		} catch (Exception e) {
			throw new HandlingErrorReturnMessage(
					"Erro ao salvar dados Por favor tente mais tarde");
		}
	}

	
} 
