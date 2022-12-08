package com.project.messiercatalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeepObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String image;
	private String constelacao;
	private String nome;
	private Double magnitude;

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

	@Override
	public String toString() {
		return "DeepObject [id=" + id + ", image=" + image + ", constelacao=" + constelacao + ", nome=" + nome
				+ ", magnitude=" + magnitude + "]";
	}
	
	

}
