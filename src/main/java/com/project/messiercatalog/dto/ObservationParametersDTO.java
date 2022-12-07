package com.project.messiercatalog.dto;

public class ObservationParametersDTO {

	private Long id;
	private String tipo;
	private String assecaoReta;
	private Double idade;
	private Double DistanciaTerra;

	public ObservationParametersDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAssecaoReta() {
		return assecaoReta;
	}

	public void setAssecaoReta(String assecaoReta) {
		this.assecaoReta = assecaoReta;
	}

	public Double getIdade() {
		return idade;
	}

	public void setIdade(Double idade) {
		this.idade = idade;
	}

	public Double getDistanciaTerra() {
		return DistanciaTerra;
	}

	public void setDistanciaTerra(Double distanciaTerra) {
		DistanciaTerra = distanciaTerra;
	}

}
