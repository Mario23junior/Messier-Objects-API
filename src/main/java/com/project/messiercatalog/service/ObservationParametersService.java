package com.project.messiercatalog.service;

import java.util.Optional;

import com.project.messiercatalog.dto.DeepObjectDTO;
import com.project.messiercatalog.dto.ObservationParametersDTO;
import com.project.messiercatalog.exceptions.HandlingErrorReturnMessage;
import com.project.messiercatalog.model.DeepObject;
import com.project.messiercatalog.model.ObservationParameters;
import com.project.messiercatalog.repository.ObservationParametersRepository;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ObservationParametersService {

	private ModelMapper mapper;
	private ObservationParametersRepository repository;

	public ObservationParametersService(ObservationParametersRepository repository, ModelMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public ResponseEntity<ObservationParametersDTO> save(ObservationParametersDTO obserVationDto) {
		try {
			ObservationParameters convert = mapper.map(obserVationDto, ObservationParameters.class);
			ObservationParameters convertbase = repository.save(convert);
			ResponseEntity<ObservationParametersDTO> response = ResponseEntity.status(HttpStatus.OK)
					.body(mapper.map(convertbase, ObservationParametersDTO.class));
			return response;
		} catch (Exception e) {
			throw new HandlingErrorReturnMessage("Erro ao salvar parametro de observação.");
		}
	}

	public ResponseEntity<ObservationParametersDTO> listId(Long id) {
		Optional<ObservationParameters> findid = repository.findById(id);
		if (findid.isPresent()) {
			ObservationParametersDTO convert = mapper.map(findid.get(), ObservationParametersDTO.class);
			return ResponseEntity.ok(convert);
		} else {
			throw new HandlingErrorReturnMessage(
					"Erro ao buscar objeto de id : " + id + ", Por favor tente mais tarde");
		}
	}

	public ResponseEntity<ObservationParametersDTO> updateDate(ObservationParametersDTO obserVatParamDto, Long id) {
		Optional<ObservationParameters> findBaseId = repository.findById(id);
		if (findBaseId.isPresent()) {
			ObservationParameters base = findBaseId.get();
			base.setAssecaoReta(obserVatParamDto.getAssecaoReta());
			base.setDistanciaTerra(obserVatParamDto.getDistanciaTerra());
			base.setIdade(obserVatParamDto.getIdade());
			base.setTipo(obserVatParamDto.getTipo());
			repository.save(base);
			return ResponseEntity.ok(mapper.map(base, ObservationParametersDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		}
	}

	public ResponseEntity<ObservationParametersDTO> delete(Long id) {
		Optional<ObservationParameters> listid = repository.findById(id);
		if (listid.isPresent()) {
			repository.delete(listid.get());
			return new ResponseEntity<ObservationParametersDTO>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

}
