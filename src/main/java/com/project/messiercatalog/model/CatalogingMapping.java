package com.project.messiercatalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CatalogingMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ngc;
	private String declinacao;
	private Double raio;

	@ManyToOne
	private DeepObject deepObject;

	public CatalogingMapping() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNgc() {
		return ngc;
	}

	public void setNgc(String ngc) {
		this.ngc = ngc;
	}

	public String getDeclinacao() {
		return declinacao;
	}

	public void setDeclinacao(String declinacao) {
		this.declinacao = declinacao;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public DeepObject getDeepObject() {
		return deepObject;
	}

	public void setDeepObject(DeepObject deepObject) {
		this.deepObject = deepObject;
	}

}
