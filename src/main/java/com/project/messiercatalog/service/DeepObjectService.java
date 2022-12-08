package com.project.messiercatalog.service;

import com.project.messiercatalog.dto.DeepObjectDTO;
import com.project.messiercatalog.exceptions.HandlingErrorReturnMessage;
import com.project.messiercatalog.model.DeepObject;
import com.project.messiercatalog.repository.DeepObjectRepository;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeepObjectService {

	private DeepObjectRepository repository;
	private ModelMapper mapper;

	public DeepObjectService(DeepObjectRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public ResponseEntity<DeepObjectDTO> saveDeepObject(DeepObjectDTO deppDto) {
		validValueDuplicationData(deppDto);
		try {
			DeepObject convertEntity = mapper.map(deppDto, DeepObject.class);
			DeepObject convertBase = repository.save(convertEntity);
			ResponseEntity<DeepObjectDTO> response = ResponseEntity.status(HttpStatus.OK)
					.body(mapper.map(convertBase, DeepObjectDTO.class));
			return response;
		} catch (Exception e) {
			throw new HandlingErrorReturnMessage("Erro ao salvar objeto "+ deppDto.getNome() +" Por favor tente mais tarde");
		}
	}
	
	public void validValueDuplicationData(DeepObjectDTO deepObjectdto) {
		DeepObject convertEntity = mapper.map(deepObjectdto, DeepObject.class);
		DeepObject findValue = repository.findByNome(deepObjectdto.getNome());
		if(findValue != null && findValue.getId() != convertEntity.getId()) {
			throw new HandlingErrorReturnMessage("O objeto de nome : "+ deepObjectdto.getNome() +" já esta cadastrado");
		}
		
		
	}
}
