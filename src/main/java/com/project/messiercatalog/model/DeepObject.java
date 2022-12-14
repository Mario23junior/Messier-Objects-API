package com.project.messiercatalog.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeepObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String image;
	private String constelacao;
	private String nome;
	private Double magnitude;

	@OneToMany(mappedBy = "deepObject", cascade = CascadeType.ALL)
	private List<ObservationParameters> observationPaDeepObjects;

	@OneToMany(mappedBy = "deepObject", cascade = CascadeType.ALL)
	private List<CatalogingMapping> catalogingMapping;

	public DeepObject() {
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
 
	public List<ObservationParameters> getObservationPaDeepObjects() {
		return observationPaDeepObjects;
	}

	public void setObservationPaDeepObjects(List<ObservationParameters> observationPaDeepObjects) {
		this.observationPaDeepObjects = observationPaDeepObjects;
	}

	public List<CatalogingMapping> getCatalogingMapping() {
		return catalogingMapping;
	}

	public void setCatalogingMapping(List<CatalogingMapping> catalogingMapping) {
		this.catalogingMapping = catalogingMapping;
	}

	@Override
	public String toString() {
		return "DeepObject [id=" + id + ", image=" + image + ", constelacao=" + constelacao + ", nome=" + nome
				+ ", magnitude=" + magnitude + "]";
	}

}
