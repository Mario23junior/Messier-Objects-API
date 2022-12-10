package com.project.messiercatalog.dto;

import java.util.List;

public class DeepObjectDTO {

	private Long id;
	private String image;
	private String constelacao;
	private String nome;
	private Double magnitude;

	private List<CatalogingMappingDTO> catalogingMappingDto;
	private List<ObservationParametersDTO> observationParametersDto;

	public DeepObjectDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getConstelacao() {
		return constelacao;
	}

	public void setConstelacao(String constelacao) {
		this.constelacao = constelacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(Double magnitude) {
		this.magnitude = magnitude;
	}

	public List<CatalogingMappingDTO> getCatalogingMappingDto() {
		return catalogingMappingDto;
	}

	public void setCatalogingMappingDto(List<CatalogingMappingDTO> catalogingMappingDto) {
		this.catalogingMappingDto = catalogingMappingDto;
	}

	public List<ObservationParametersDTO> getObservationParametersDto() {
		return observationParametersDto;
	}

	public void setObservationParametersDto(List<ObservationParametersDTO> observationParametersDto) {
		this.observationParametersDto = observationParametersDto;
	}

}
