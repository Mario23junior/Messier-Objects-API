package com.project.messiercatalog.dto;

public class CatalogingMappingDTO {

	private Long id;
	private String ngc;
	private String declinacao;
	private Double raio;

	public CatalogingMappingDTO() {
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
}
