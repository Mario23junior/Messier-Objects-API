package com.project.messiercatalog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class CargaConfig {

	@Autowired
	private CargaBaseSobre carga;

	@Bean
	public void cargaService() {
		this.carga.cargaService();
	}

}
