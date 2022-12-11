package com.project.messiercatalog.utils;

import java.util.Arrays;

import com.project.messiercatalog.dto.CatalogingMappingDTO;
import com.project.messiercatalog.dto.DeepObjectDTO;
import com.project.messiercatalog.dto.ObservationParametersDTO;
import com.project.messiercatalog.model.CatalogingMapping;
import com.project.messiercatalog.model.DeepObject;
import com.project.messiercatalog.model.ObservationParameters;
import com.project.messiercatalog.repository.CatalogingMappingRepository;
import com.project.messiercatalog.repository.DeepObjectRepository;
import com.project.messiercatalog.repository.ObservationParametersRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargaBaseSobre {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CatalogingMappingRepository catalRepository;
	
	@Autowired
	private ObservationParametersRepository obserRepository;
	
	@Autowired
	private DeepObjectRepository deepObjectRepository;

	public void cargaService() {
		
		CatalogingMappingDTO c1 = new CatalogingMappingDTO();
		c1.setId(1l);
		c1.setDeclinacao("+22˚ 0' 57''");
		c1.setNgc("1952");
		c1.setRaio(11.0);
		ObservationParametersDTO o1 = new ObservationParametersDTO();
		o1.setId(1l);
		o1.setAssecaoReta("05h 34m 31,97s");
		o1.setDistanciaTerra(6.300);
		o1.setIdade(1.001);
		o1.setTipo("Resto de supernova");
		DeepObjectDTO d1 = new DeepObjectDTO();
		d1.setId(1l);
		d1.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/crab-nebula-mosaic.jpg?itok=DNaRmPtc");
		d1.setConstelacao("Touro");
		d1.setMagnitude(8.5);
		d1.setNome("M1");
		
		
		CatalogingMappingDTO c2 = new CatalogingMappingDTO();
		c2.setId(2l);
		c2.setDeclinacao("-00° 49′ 24″");
		c2.setNgc("7089");
		c2.setRaio(87.5);
		ObservationParametersDTO o2 = new ObservationParametersDTO();
		o2.setId(2l);
		o2.setAssecaoReta("05h 34m 31,97s");
		o2.setDistanciaTerra(37.500);
		o2.setIdade(13.0);
		o2.setTipo("Resto de supernova");
		DeepObjectDTO d2 = new DeepObjectDTO();
		d2.setId(2l);
		d2.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Messier_2_Hubble_WikiSky.jpg/600px-Messier_2_Hubble_WikiSky.jpg");
		d2.setConstelacao("Aquarius");
		d2.setMagnitude(6.3);
		d2.setNome("M2");
		
		CatalogingMappingDTO c3 = new CatalogingMappingDTO();
		c3.setId(3l);
		c3.setDeclinacao("28° 22′ 31,6″");
		c3.setNgc("5272");
		c3.setRaio(90.0);
		ObservationParametersDTO o3 = new ObservationParametersDTO();
		o3.setId(3l);
		o3.setAssecaoReta("13h 42m 11,23s");
		o3.setDistanciaTerra(33.900);
		o3.setIdade(10.109);
		o3.setTipo("VI");
		DeepObjectDTO d3 = new DeepObjectDTO();
		d3.setId(3l);
		d3.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m3.jpg?itok=zmf4sMmJ");
		d3.setConstelacao("Canes Venatici");
		d3.setMagnitude(+6.2);
		d3.setNome("M3");
		
		CatalogingMappingDTO c4 = new CatalogingMappingDTO();
		c4.setId(4l);
		c4.setDeclinacao("-26˚ 32' 2''");
		c4.setNgc("6121");
		c4.setRaio(35.0);
		ObservationParametersDTO o4 = new ObservationParametersDTO();
		o4.setId(4l);
		o4.setAssecaoReta("16h 23 min 38 s");
		o4.setDistanciaTerra(7.2);
		o4.setIdade(12.2);
		o4.setTipo("Aglomerado globular");
		DeepObjectDTO d4 = new DeepObjectDTO();
		d4.setId(4l);
		d4.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1236a.jpg?itok=izawA3vA");
		d4.setConstelacao("Sagitário");
		d4.setMagnitude(5.9);
		d4.setNome("M4");
		
		CatalogingMappingDTO c5 = new CatalogingMappingDTO();
		c5.setId(5l);
		c5.setDeclinacao("+2˚ 4' 55''");
		c5.setNgc("5904");
		c5.setRaio(80.0);
		ObservationParametersDTO o5 = new ObservationParametersDTO();
		o5.setId(5l);
		o5.setAssecaoReta("15h 18 min 37 s");
		o5.setDistanciaTerra(24.5);
		o5.setIdade(10.62);
		o5.setTipo("Aglomerado globular");
		DeepObjectDTO d5 = new DeepObjectDTO();
		d5.setId(5l);
		d5.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1118a.jpg?itok=ry9Kd6gB");
		d5.setConstelacao("Serpente");
		d5.setMagnitude(5.6);
		d5.setNome("M5");
		
		CatalogingMappingDTO c6 = new CatalogingMappingDTO();
		c6.setId(6l);
		c6.setDeclinacao("-32˚ 12' 58''");
		c6.setNgc("6405");
		c6.setRaio(6.0);
		ObservationParametersDTO o6 = new ObservationParametersDTO();
		o6.setId(6l);
		o6.setAssecaoReta("17h 40min 8s");
		o6.setDistanciaTerra(1.59);
		o6.setIdade(94.2);
		o6.setTipo("Aglomerado aberto");
		DeepObjectDTO d6 = new DeepObjectDTO();
		d6.setId(6l);
		d6.setImage("https://www.messier-objects.com/wp-content/uploads/2015/02/Messier-7-739x620.jpg");
		d6.setConstelacao("Escorpião");
		d6.setMagnitude(4.2);
		d6.setNome("M6");
		
		CatalogingMappingDTO c7 = new CatalogingMappingDTO();
		c7.setId(7l);
		c7.setDeclinacao("-34˚ 48' 57''");
		c7.setNgc("6475");
		c7.setRaio(25.0);
		ObservationParametersDTO o7 = new ObservationParametersDTO();
		o7.setId(7l);
		o7.setAssecaoReta("17h 53min 56s");
		o7.setDistanciaTerra(980.330);
		o7.setIdade(0.0);
		o7.setTipo("Aglomerado aberto");
		DeepObjectDTO d7 = new DeepObjectDTO();
		d7.setId(7l);
		d7.setImage("https://cdn.eso.org/images/thumb700x/eso1406a.jpg");
		d7.setConstelacao("Escorpião");
		d7.setMagnitude(3.3);
		d7.setNome("M7");
		
		CatalogingMappingDTO c8 = new CatalogingMappingDTO();
		c8.setId(8l);
		c8.setDeclinacao(" -24˚ 22' 56''");
		c8.setNgc("6523");
		c8.setRaio(0.0);
		ObservationParametersDTO o8 = new ObservationParametersDTO();
		o8.setId(8l);
		o8.setAssecaoReta(" 18h 3 min 50 s");
		o8.setDistanciaTerra(4850.0);
		o8.setIdade(2.0);
		o8.setTipo("Nebulosa");
		DeepObjectDTO d8 = new DeepObjectDTO();
		d8.setId(8l);
		d8.setImage("https://images5.alphacoders.com/609/609711.jpg");
		d8.setConstelacao("Sagitário");
		d8.setMagnitude(6.0);
		d8.setNome("M8");
		
		
		CatalogingMappingDTO c9 = new CatalogingMappingDTO();
		c9.setId(9l);
		c9.setDeclinacao("-18˚ 30' 58''");
		c9.setNgc("6333");
		c9.setRaio(45.0);
		ObservationParametersDTO o9 = new ObservationParametersDTO();
		o9.setId(9l);
		o9.setAssecaoReta("17h 19 min 14 s");
		o9.setDistanciaTerra(0.0);
		o9.setIdade(90.0);
		o9.setTipo("Aglomerado globular");
		DeepObjectDTO d9 = new DeepObjectDTO();
		d9.setId(9l);
		d9.setImage("");
		d9.setConstelacao("Ofiúco");
		d9.setMagnitude(8.42);
		d9.setNome("M9");
		
		
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c1, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o1, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d1, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c2, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o2, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d2, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c3, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o3, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d3, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c4, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o4, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d4, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c5, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o5, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d5, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c6, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o6, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d6, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c7, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o6, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d7, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c8, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o8, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d8, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c9, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o9, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d9, DeepObject.class)));
	}
}














