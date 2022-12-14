package com.project.messiercatalog.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


	public List<DeepObjectDTO> findAll() {
      try {
    	  List<DeepObject> list = repository.findAll();
    	  return list
    			  .stream()
    			  .map(l -> mapper.map(l, DeepObjectDTO.class))
    			  .collect(Collectors.toList());
      }catch(Exception e) {
			throw new HandlingErrorReturnMessage("Erro ao listar parametro de observação.");
      }
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
			throw new HandlingErrorReturnMessage(
					"Erro ao salvar objeto " + deppDto.getNome() + " Por favor tente mais tarde");
		}
	}

	public void validValueDuplicationData(DeepObjectDTO deepObjectdto) {
		DeepObject convertEntity = mapper.map(deepObjectdto, DeepObject.class);
		DeepObject findValue = repository.findByNome(deepObjectdto.getNome());
		if (findValue != null && findValue.getId() != convertEntity.getId()) {
			throw new HandlingErrorReturnMessage(
					"O objeto de nome : " + deepObjectdto.getNome() + " já esta cadastrado");
		}
	}

	public ResponseEntity<DeepObjectDTO> listInfoId(Long id) {
		Optional<DeepObject> findid = repository.findById(id);
		if (findid.isPresent()) {
			DeepObjectDTO convert = mapper.map(findid.get(), DeepObjectDTO.class);
			return ResponseEntity.ok(convert);
		} else {
			throw new HandlingErrorReturnMessage(
					"Erro ao buscar objeto de id : " + id + ", Por favor tente mais tarde");
		}
	}

	public ResponseEntity<DeepObjectDTO> update(DeepObjectDTO deepObjectDto, Long id) {
		Optional<DeepObject> findbase = repository.findById(id);
		if (findbase.isPresent()) {
			DeepObject data = findbase.get();
			data.setConstelacao(deepObjectDto.getConstelacao());
			data.setImage(deepObjectDto.getImage());
			data.setMagnitude(deepObjectDto.getMagnitude());
			data.setNome(deepObjectDto.getNome());
			repository.save(data);
			return ResponseEntity.ok(mapper.map(data, DeepObjectDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	public ResponseEntity<DeepObjectDTO> delete(Long id) {
		Optional<DeepObject> listid = repository.findById(id);
		if (listid.isPresent()) {
			repository.delete(listid.get());
			return new ResponseEntity<DeepObjectDTO>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

}