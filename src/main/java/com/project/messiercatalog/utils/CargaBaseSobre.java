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
		d1.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/crab-nebula-mosaic.jpg?itok=DNaRmPtc");
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
		d2.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Messier_2_Hubble_WikiSky.jpg/600px-Messier_2_Hubble_WikiSky.jpg");
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
		d3.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m3.jpg?itok=zmf4sMmJ");
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
		d4.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1236a.jpg?itok=izawA3vA");
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
		d5.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1118a.jpg?itok=ry9Kd6gB");
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
		d9.setImage("https://i.pinimg.com/originals/9f/54/fd/9f54fd321e310ed88a8a016f81982c55.jpg");
		d9.setConstelacao("Ofiúco");
		d9.setMagnitude(8.42);
		d9.setNome("M9");

		CatalogingMappingDTO c10 = new CatalogingMappingDTO();
		c10.setId(10l);
		c10.setDeclinacao("-04° 05′ 57,6″");
		c10.setNgc("6254");
		c10.setRaio(41.6);
		ObservationParametersDTO o10 = new ObservationParametersDTO();
		o10.setId(10l);
		o10.setAssecaoReta("16h 57min 8s");
		o10.setDistanciaTerra(14.300);
		o10.setIdade(35.0);
		o10.setTipo("Aglomerado globular");
		DeepObjectDTO d10 = new DeepObjectDTO();
		d10.setId(10l);
		d10.setImage("https://upload.wikimedia.org/wikipedia/commons/3/39/M10_H%C3%B6cherl.jpg");
		d10.setConstelacao("Ofiúco");
		d10.setMagnitude(6.6);
		d10.setNome("M10");

		CatalogingMappingDTO c11 = new CatalogingMappingDTO();
		c11.setId(11l);
		c11.setDeclinacao("-06° 16′ 00,0″");
		c11.setNgc("6705");
		c11.setRaio(0.0);
		ObservationParametersDTO o11 = new ObservationParametersDTO();
		o11.setId(11l);
		o11.setAssecaoReta("18h 51m 06,00s");
		o11.setDistanciaTerra(6.200);
		o11.setIdade(0.0);
		o11.setTipo("Aglomerado aberto");
		DeepObjectDTO d11 = new DeepObjectDTO();
		d11.setId(11l);
		d11.setImage("http://cdn.eso.org/images/screen/eso1430a.jpg");
		d11.setConstelacao("Escudo");
		d11.setMagnitude(6.3);
		d11.setNome("M11");

		CatalogingMappingDTO c12 = new CatalogingMappingDTO();
		c12.setId(12l);
		c12.setDeclinacao("-1˚ 57' 0''");
		c12.setNgc("6218");
		c12.setRaio(0.0);
		ObservationParametersDTO o12 = new ObservationParametersDTO();
		o12.setId(12l);
		o12.setAssecaoReta("16h  47m 14,52s");
		o12.setDistanciaTerra(16.000);
		o12.setIdade(0.0);
		o12.setTipo("Aglomerado globular");
		DeepObjectDTO d12 = new DeepObjectDTO();
		d12.setId(12l);
		d12.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/potw1113a.jpg");
		d12.setConstelacao("Ofiúco");
		d12.setMagnitude(7.68);
		d12.setNome("M12");

		CatalogingMappingDTO c13 = new CatalogingMappingDTO();
		c13.setId(13l);
		c13.setDeclinacao("+36˚ 27' 59''");
		c13.setNgc("6205");
		c13.setRaio(84.0);
		ObservationParametersDTO o13 = new ObservationParametersDTO();
		o13.setId(13l);
		o13.setAssecaoReta("16h 41 min 43 s");
		o13.setDistanciaTerra(22.2);
		o13.setIdade(0.0);
		o13.setTipo(" Aglomerado Globular");
		DeepObjectDTO d13 = new DeepObjectDTO();
		d13.setId(13l);
		d13.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m13-xlarge_web.jpg?itok=JLaiobe3");
		d13.setConstelacao("Hercules");
		d13.setMagnitude(5.8);
		d13.setNome("M13");

		CatalogingMappingDTO c14 = new CatalogingMappingDTO();
		c14.setId(14l);
		c14.setDeclinacao("-3˚ 14' 58''");
		c14.setNgc("6402");
		c14.setRaio(0.0);
		ObservationParametersDTO o14 = new ObservationParametersDTO();
		o14.setId(14l);
		o14.setAssecaoReta(" 17h 37 min 37 s");
		o14.setDistanciaTerra(0.0);
		o14.setIdade(29.0);
		o14.setTipo("Aglomerado globular");
		DeepObjectDTO d14 = new DeepObjectDTO();
		d14.setId(14l);
		d14.setImage(
				"https://skyandtelescope.org/wp-content/uploads/M14_S1_WhiteCal_CBS_Levels_Noise_USM80_3_5_SS2083_s.jpg");
		d14.setConstelacao("Ofiúco");
		d14.setMagnitude(9.0);
		d14.setNome("M14");

		CatalogingMappingDTO c15 = new CatalogingMappingDTO();
		c15.setId(15l);
		c15.setDeclinacao(" +12˚ 10' 11''");
		c15.setNgc("7078");
		c15.setRaio(50.0);
		ObservationParametersDTO o15 = new ObservationParametersDTO();
		o15.setId(15l);
		o15.setAssecaoReta("21h 30min 2s");
		o15.setDistanciaTerra(0.0);
		o15.setIdade(13.2);
		o15.setTipo("Aglomerado globular");
		DeepObjectDTO d15 = new DeepObjectDTO();
		d15.setId(15l);
		d15.setImage(
				"https://images.squarespace-cdn.com/content/v1/5f80d695d292300cf957114a/1631793718420-TINWA73FBVDMEY89AC7Q/M15_2000px.jpg");
		d15.setConstelacao("Pegasus");
		d15.setMagnitude(7.5);
		d15.setNome("M15");

		CatalogingMappingDTO c16 = new CatalogingMappingDTO();
		c16.setId(16l);
		c16.setDeclinacao("-13˚ 46' 55''");
		c16.setNgc("6611");
		c16.setRaio(0.0);
		ObservationParametersDTO o16 = new ObservationParametersDTO();
		o16.setId(16l);
		o16.setAssecaoReta("18h 18min 50s");
		o16.setDistanciaTerra(7.000);
		o16.setIdade(0.0);
		o16.setTipo("Nebulosa da Águia");
		DeepObjectDTO d16 = new DeepObjectDTO();
		d16.setId(16l);
		d16.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/hubble_birthofstars_0.jpg");
		d16.setConstelacao("Serpente");
		d16.setMagnitude(6.5);
		d16.setNome("M16");

		CatalogingMappingDTO c17 = new CatalogingMappingDTO();
		c17.setId(17l);
		c17.setDeclinacao("−13° 47′");
		c17.setNgc("6618");
		c17.setRaio(11.0);
		ObservationParametersDTO o17 = new ObservationParametersDTO();
		o17.setId(17l);
		o17.setAssecaoReta("18h 18,8m");
		o17.setDistanciaTerra(7.000);
		o17.setIdade(1001.000);
		o17.setTipo("Nebulosa Ômega\n");
		DeepObjectDTO d17 = new DeepObjectDTO();
		d17.setId(17l);
		d17.setImage("https://cdn.eso.org/images/screen/eso0925a.jpg");
		d17.setConstelacao("Sagitário");
		d17.setMagnitude(6.0);
		d17.setNome("M17");

		CatalogingMappingDTO c18 = new CatalogingMappingDTO();
		c18.setId(18l);
		c18.setDeclinacao("-17˚ 7' 55'");
		c18.setNgc("6613");
		c18.setRaio(9.0);
		ObservationParametersDTO o18 = new ObservationParametersDTO();
		o18.setId(18l);
		o18.setAssecaoReta("18h 19min 56s");
		o18.setDistanciaTerra(4.900);
		o18.setIdade(0.0);
		o18.setTipo("Aglomerado aberto");
		DeepObjectDTO d18 = new DeepObjectDTO();
		d18.setId(18l);
		d18.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Eso1628a-crop.png/800px-Eso1628a-crop.png");
		d18.setConstelacao("Sagitário");
		d18.setMagnitude(7.9);
		d18.setNome("M18");

		CatalogingMappingDTO c19 = new CatalogingMappingDTO();
		c19.setId(19l);
		c19.setDeclinacao(" -26˚ 16' 0''");
		c19.setNgc("6273");
		c19.setRaio(70.0);
		ObservationParametersDTO o19 = new ObservationParametersDTO();
		o19.setId(19l);
		o19.setAssecaoReta("17h 2min 38s");
		o19.setDistanciaTerra(28.000);
		o19.setIdade(1.191e+13);
		o19.setTipo("Aglomerado globular");
		DeepObjectDTO d19 = new DeepObjectDTO();
		d19.setId(19l);
		d19.setImage("https://cdn.eso.org/images/wallpaper3/eso1220a.jpg");
		d19.setConstelacao("Ofiúco");
		d19.setMagnitude(7.47);
		d19.setNome("M19");

		CatalogingMappingDTO c20 = new CatalogingMappingDTO();
		c20.setId(20l);
		c20.setDeclinacao("-23˚ 1' 57''");
		c20.setNgc("6514");
		c20.setRaio(21.0);
		ObservationParametersDTO o20 = new ObservationParametersDTO();
		o20.setId(20l);
		o20.setAssecaoReta("18h 2min 20s");
		o20.setDistanciaTerra(5.200);
		o20.setIdade(300.200);
		o20.setTipo("Nebulosa");
		DeepObjectDTO d20 = new DeepObjectDTO();
		d20.setId(20l);
		d20.setImage("https://c1.wallpaperflare.com/preview/54/310/387/trifid-nebula-messier-20-m20-ngc-6514.jpg");
		d20.setConstelacao("Sagitário");
		d20.setMagnitude(6.3);
		d20.setNome("M20");

		CatalogingMappingDTO c21 = new CatalogingMappingDTO();
		c21.setId(21l);
		c21.setDeclinacao("18h 4min 38s");
		c21.setNgc("6531");
		c21.setRaio(0.0);
		ObservationParametersDTO o21 = new ObservationParametersDTO();
		o21.setId(21l);
		o21.setAssecaoReta("");
		o21.setDistanciaTerra(3.930);
		o21.setIdade(4.250);
		o21.setTipo("Aglomerado aberto");
		DeepObjectDTO d21 = new DeepObjectDTO();
		d21.setId(21l);
		d21.setImage(
				"https://1.bp.blogspot.com/-AbLJMzDMzfg/W47kEpTgb5I/AAAAAAAACys/sP-a7PsfFJcN1sAxgOTOR0D-Er_tyXIiQCLcBGAs/s640/M21.jpg");
		d21.setConstelacao("Sagitário");
		d21.setMagnitude(6.0);
		d21.setNome("M21");

		CatalogingMappingDTO c22 = new CatalogingMappingDTO();
		c22.setId(22l);
		c22.setDeclinacao("-23˚ 53' 54''");
		c22.setNgc("6656");
		c22.setRaio(50.0);
		ObservationParametersDTO o22 = new ObservationParametersDTO();
		o22.setId(22l);
		o22.setAssecaoReta("18h 36min 26s");
		o22.setDistanciaTerra(10.600 + 10000);
		o22.setIdade(12.0);
		o22.setTipo("Aglomerado globular");
		DeepObjectDTO d22 = new DeepObjectDTO();
		d22.setId(22l);
		d22.setImage("http://www.skyledge.net/Messier22.jpg");
		d22.setConstelacao("Sagitário");
		d22.setMagnitude(5.1);
		d22.setNome("M22");

		CatalogingMappingDTO c23 = new CatalogingMappingDTO();
		c23.setId(23l);
		c23.setDeclinacao("-19˚ 0' 56''");
		c23.setNgc("6494");
		c23.setRaio(0.0);
		ObservationParametersDTO o23 = new ObservationParametersDTO();
		o23.setId(23l);
		o23.setAssecaoReta("17h 56min 50s");
		o23.setDistanciaTerra(2.050);
		o23.setIdade(220.0);
		o23.setTipo("Aglomerado aberto");
		DeepObjectDTO d23 = new DeepObjectDTO();
		d23.setId(23l);
		d23.setImage("https://upload.wikimedia.org/wikipedia/commons/7/7c/M23_Eguivar.jpg");
		d23.setConstelacao("Sagitário");
		d23.setMagnitude(5.5);
		d23.setNome("M23");

		CatalogingMappingDTO c24 = new CatalogingMappingDTO();
		c24.setId(24l);
		c24.setDeclinacao("-18˚ 29' 0''");
		c24.setNgc("6603");
		c24.setRaio(300.0);
		ObservationParametersDTO o24 = new ObservationParametersDTO();
		o24.setId(24l);
		o24.setAssecaoReta("18h 16min 54s");
		o24.setDistanciaTerra(4.900);
		o24.setIdade(32.0);
		o24.setTipo("Nuvem estelar");
		DeepObjectDTO d24 = new DeepObjectDTO();
		d24.setId(24l);
		d24.setImage(
				"https://www.astrofotoblog.eu/wp-content/uploads/2020/08/M24-Open-Cluster-2020-07-21-6in-MaxF-ZWO071-0C-75x120s-G95-scaled.jpg");
		d24.setConstelacao("Sagitário");
		d24.setMagnitude(11.0);
		d24.setNome("M24");

		CatalogingMappingDTO c25 = new CatalogingMappingDTO();
		c25.setId(25l);
		c25.setDeclinacao("-19˚ 15' 0''");
		c25.setNgc("4725");
		c25.setRaio(10.0);
		ObservationParametersDTO o25 = new ObservationParametersDTO();
		o25.setId(25l);
		o25.setAssecaoReta("18h 31min 36s");
		o25.setDistanciaTerra(2.000);
		o25.setIdade(90.0);
		o25.setTipo("Aglomerado aberto");
		DeepObjectDTO d25 = new DeepObjectDTO();
		d25.setId(25l);
		d25.setImage("https://cosmospnw.com/wp-content/uploads/2020/06/Messier-25-777x437.jpg");
		d25.setConstelacao("Sagitário");
		d25.setMagnitude(4.6);
		d25.setNome("M25");

		CatalogingMappingDTO c26 = new CatalogingMappingDTO();
		c26.setId(26l);
		c26.setDeclinacao("-9˚ 23' 54''");
		c26.setNgc("6694");
		c26.setRaio(22.0);
		ObservationParametersDTO o26 = new ObservationParametersDTO();
		o26.setId(26l);
		o26.setAssecaoReta("18h 45 min 14 s");
		o26.setDistanciaTerra(5.000);
		o26.setIdade(89.0);
		o26.setTipo("Aglomerado aberto");
		DeepObjectDTO d26 = new DeepObjectDTO();
		d26.setId(26l);
		d26.setImage("https://upload.wikimedia.org/wikipedia/commons/f/ff/Messier_26.jpg");
		d26.setConstelacao("Escudo");
		d26.setMagnitude(8.5);
		d26.setNome("M26");

		CatalogingMappingDTO c27 = new CatalogingMappingDTO();
		c27.setId(27l);
		c27.setDeclinacao(" +22° 43′ 16″");
		c27.setNgc("6853");
		c27.setRaio(1.44);
		ObservationParametersDTO o27 = new ObservationParametersDTO();
		o27.setId(27l);
		o27.setAssecaoReta("19h 59min 37s");
		o27.setDistanciaTerra(2.200);
		o27.setIdade(10.0);
		o27.setTipo("Nebulosa");
		DeepObjectDTO d27 = new DeepObjectDTO();
		d27.setId(27l);
		d27.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/M27_-_Dumbbell_Nebula.jpg/640px-M27_-_Dumbbell_Nebula.jpg");
		d27.setConstelacao("Raposa");
		d27.setMagnitude(8.0);
		d27.setNome("M27");

		CatalogingMappingDTO c28 = new CatalogingMappingDTO();
		c28.setId(28l);
		c28.setDeclinacao("-24˚ 51' 55''");
		c28.setNgc("6626");
		c28.setRaio(30.0);
		ObservationParametersDTO o28 = new ObservationParametersDTO();
		o28.setId(28l);
		o28.setAssecaoReta("18h 24min 32s");
		o28.setDistanciaTerra(3.500);
		o28.setIdade(12.0);
		o28.setTipo("Aglomerado globular");
		DeepObjectDTO d28 = new DeepObjectDTO();
		d28.setId(28l);
		d28.setImage(
				"https://img5.goodfon.com/wallpaper/nbig/3/96/messier-28-ngc-6626-globular-starcluster-constellation-sagit.jpg");
		d28.setConstelacao("Sagitário");
		d28.setMagnitude(8.5);
		d28.setNome("M28");

		CatalogingMappingDTO c29 = new CatalogingMappingDTO();
		c29.setId(29l);
		c29.setDeclinacao("+38˚ 32' 9''");
		c29.setNgc("6913");
		c29.setRaio(0.0);
		ObservationParametersDTO o29 = new ObservationParametersDTO();
		o29.setId(29l);
		o29.setAssecaoReta("20h 23min 55s");
		o29.setDistanciaTerra(0.0);
		o29.setIdade(7.0);
		o29.setTipo("Aglomerado aberto");
		DeepObjectDTO d29 = new DeepObjectDTO();
		d29.setId(29l);
		d29.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/M29_%28Messier_29%29_star_cluster_and_nebulosity_in_32_inch_Schulman_telescope.jpg/621px-M29_%28Messier_29%29_star_cluster_and_nebulosity_in_32_inch_Schulman_telescope.jpg?20140914162708");
		d29.setConstelacao("Cisne");
		d29.setMagnitude(7.1);
		d29.setNome("M29");

		CatalogingMappingDTO c30 = new CatalogingMappingDTO();
		c30.setId(30l);
		c30.setDeclinacao("-23° 10′ 47,5″");
		c30.setNgc("7099");
		c30.setRaio(0.9);
		ObservationParametersDTO o30 = new ObservationParametersDTO();
		o30.setId(30l);
		o30.setAssecaoReta("21h 40min 25s");
		o30.setDistanciaTerra(2941.6);
		o30.setIdade(12.93);
		o30.setTipo("sAglomerado globular");
		DeepObjectDTO d30 = new DeepObjectDTO();
		d30.setId(30l);
		d30.setImage("http://cdn.spacetelescope.org/archives/images/screen/heic0918a.jpg");
		d30.setConstelacao("Capricórnio");
		d30.setMagnitude(8.5);
		d30.setNome("M30");

		CatalogingMappingDTO c31 = new CatalogingMappingDTO();
		c31.setId(31l);
		c31.setDeclinacao("+41˚ 16' 10''");
		c31.setNgc("224");
		c31.setRaio(0.0);
		ObservationParametersDTO o31 = new ObservationParametersDTO();
		o31.setId(31l);
		o31.setAssecaoReta("0h 42min 44s");
		o31.setDistanciaTerra(765.0);
		o31.setIdade(1.001e+13);
		o31.setTipo("Galáxia espiral");
		DeepObjectDTO d31 = new DeepObjectDTO();
		d31.setId(31l);
		d31.setImage(
				"https://i0.wp.com/alfacrucis.org/wp-content/uploads/2020/03/M31_RGB_final2-scaled.jpg?resize=800%2C445&ssl=1");
		d31.setConstelacao("Andrômeda");
		d31.setMagnitude(3.5);
		d31.setNome("M31");

		CatalogingMappingDTO c32 = new CatalogingMappingDTO();
		c32.setId(32l);
		c32.setDeclinacao("+40˚ 52' 11''");
		c32.setNgc("221");
		c32.setRaio(0.0);
		ObservationParametersDTO o32 = new ObservationParametersDTO();
		o32.setId(32l);
		o32.setAssecaoReta("0h 42min 44s");
		o32.setDistanciaTerra(0.0);
		o32.setIdade(0.0);
		o32.setTipo("Galáxia anã elíptica");
		DeepObjectDTO d32 = new DeepObjectDTO();
		d32.setId(32l);
		d32.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/sculptor.jpg");
		d32.setConstelacao("Andrômeda");
		d32.setMagnitude(0.0);
		d32.setNome("M32");

		CatalogingMappingDTO c33 = new CatalogingMappingDTO();
		c33.setId(33l);
		c33.setDeclinacao("");
		c33.setNgc("598");
		c33.setRaio(30.000);
		ObservationParametersDTO o33 = new ObservationParametersDTO();
		o33.setId(33l);
		o33.setAssecaoReta("1h 33 min 56 s");
		o33.setDistanciaTerra(0.0);
		o33.setIdade(0.0);
		o33.setTipo("Galáxia espiral");
		DeepObjectDTO d33 = new DeepObjectDTO();
		d33.setId(33l);
		d33.setImage("https://apod.nasa.gov/apod/image/1609/M33RIFAstiBenintende.jpg");
		d33.setConstelacao("Triângulo");
		d33.setMagnitude(5.7);
		d33.setNome("M33");

		CatalogingMappingDTO c34 = new CatalogingMappingDTO();
		c34.setId(34l);
		c34.setDeclinacao("+42˚ 47' 6''");
		c34.setNgc("1039");
		c34.setRaio(7.0);
		ObservationParametersDTO o34 = new ObservationParametersDTO();
		o34.setId(34l);
		o34.setAssecaoReta("2h 42 min 2");
		o34.setDistanciaTerra(0.0);
		o34.setIdade(14.000);
		o34.setTipo("Aglomerado aberto");
		DeepObjectDTO d34 = new DeepObjectDTO();
		d34.setId(34l);
		d34.setImage("https://freestarcharts.com/images/Articles/Messier/M34_ESO.jpg");
		d34.setConstelacao("Perseu");
		d34.setMagnitude(6.0);
		d34.setNome("M34");

		CatalogingMappingDTO c35 = new CatalogingMappingDTO();
		c35.setId(35l);
		c35.setDeclinacao("+24˚ 19' 55''");
		c35.setNgc("2168");
		c35.setRaio(0.0);
		ObservationParametersDTO o35 = new ObservationParametersDTO();
		o35.setId(35l);
		o35.setAssecaoReta("06h 09.1m");
		o35.setDistanciaTerra(2.800);
		o35.setIdade(0.0);
		o35.setTipo(" Aglomerado aberto");
		DeepObjectDTO d35 = new DeepObjectDTO();
		d35.setId(35l);
		d35.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/M35atlas.jpg/1200px-M35atlas.jpg");
		d35.setConstelacao("Gêmeos");
		d35.setMagnitude(5.5);
		d35.setNome("M35");

		CatalogingMappingDTO c36 = new CatalogingMappingDTO();
		c36.setId(36l);
		c36.setDeclinacao("+34˚ 7' 57''");
		c36.setNgc("1960");
		c36.setRaio(14.0);
		ObservationParametersDTO o36 = new ObservationParametersDTO();
		o36.setId(36l);
		o36.setAssecaoReta("5h 36m 12s");
		o36.setDistanciaTerra(0.0);
		o36.setIdade(0.0);
		o36.setTipo("Aglomerado aberto");
		DeepObjectDTO d36 = new DeepObjectDTO();
		d36.setId(36l);
		d36.setImage("https://upload.wikimedia.org/wikipedia/commons/d/dc/M36_2mass.jpg");
		d36.setConstelacao("Auriga");
		d36.setMagnitude(6.5);
		d36.setNome("M36");

		CatalogingMappingDTO c37 = new CatalogingMappingDTO();
		c37.setId(37l);
		c37.setDeclinacao(" +32˚ 32' 56''");
		c37.setNgc("2099");
		c37.setRaio(13.0);
		ObservationParametersDTO o37 = new ObservationParametersDTO();
		o37.setId(37l);
		o37.setAssecaoReta("5h 52min 26s");
		o37.setDistanciaTerra(4.5110);
		o37.setIdade(0.0);
		o37.setTipo("Aglomerado aberto");
		DeepObjectDTO d37 = new DeepObjectDTO();
		d37.setId(37l);
		d37.setImage("https://images.immediate.co.uk/production/volatile/sites/25/2019/02/Unknown_7-63da04b.jpeg");
		d37.setConstelacao("Auriga");
		d37.setMagnitude(6.0);
		d37.setNome("M37");

		CatalogingMappingDTO c38 = new CatalogingMappingDTO();
		c38.setId(38l);
		c38.setDeclinacao("+35° 51′ 18,0″");
		c38.setNgc("2099");
		c38.setRaio(25.0);
		ObservationParametersDTO o38 = new ObservationParametersDTO();
		o38.setId(38l);
		o38.setAssecaoReta("5h 28m 42,00s");
		o38.setDistanciaTerra(4.200);
		o38.setIdade(220.0);
		o38.setTipo("Aglomerado estelar aberto");
		DeepObjectDTO d38 = new DeepObjectDTO();
		d38.setId(38l);
		d38.setImage("https://www.messier-objects.com/wp-content/uploads/2015/04/Messier-38.jpg");
		d38.setConstelacao("Auriga");
		d38.setMagnitude(7.4);
		d38.setNome("M38");

		CatalogingMappingDTO c39 = new CatalogingMappingDTO();
		c39.setId(39l);
		c39.setDeclinacao("");
		c39.setNgc("7092");
		c39.setRaio(0.0);
		ObservationParametersDTO o39 = new ObservationParametersDTO();
		o39.setId(39l);
		o39.setAssecaoReta("21h 32 min 13s");
		o39.setDistanciaTerra(0.0);
		o39.setIdade(0.0);
		o39.setTipo("Aglomerado estelar aberto");
		DeepObjectDTO d39 = new DeepObjectDTO();
		d39.setId(39l);
		d39.setImage("http://www.waloszek.de/vespera_fotos/vespera_20220930/img-0014-output_M39_900.jpg");
		d39.setConstelacao("Cisne");
		d39.setMagnitude(4.6);
		d39.setNome("M39");

		CatalogingMappingDTO c40 = new CatalogingMappingDTO();
		c40.setId(40l);
		c40.setDeclinacao("+58˚5' 0''");
		c40.setNgc("---");
		c40.setRaio(0.0);
		ObservationParametersDTO o40 = new ObservationParametersDTO();
		o40.setId(40l);
		o40.setAssecaoReta("12h 22 min 24 s");
		o40.setDistanciaTerra(0.0);
		o40.setIdade(0.0);
		o40.setTipo("Estrela dupla");
		DeepObjectDTO d40 = new DeepObjectDTO();
		d40.setId(40l);
		d40.setImage("http://www.ccvalg.pt/astronomia/enxames/sistemas_estelares/albireo.jpg");
		d40.setConstelacao("Ursa Maior");
		d40.setMagnitude(9.0);
		d40.setNome("M40");

		CatalogingMappingDTO c41 = new CatalogingMappingDTO();
		c41.setId(41l);
		c41.setDeclinacao("-20˚ 44' 6''");
		c41.setNgc("2287");
		c41.setRaio(0.0);
		ObservationParametersDTO o41 = new ObservationParametersDTO();
		o41.setId(41l);
		o41.setAssecaoReta("6h 46min 1s");
		o41.setDistanciaTerra(0.0);
		o41.setIdade(0.0);
		o41.setTipo("Aglomerado aberto");
		DeepObjectDTO d41 = new DeepObjectDTO();
		d41.setId(41l);
		d41.setImage("https://upload.wikimedia.org/wikipedia/commons/1/1b/M41-noao.jpg");
		d41.setConstelacao("Cão Maior");
		d41.setMagnitude(4.5);
		d41.setNome("M41");

		CatalogingMappingDTO c42 = new CatalogingMappingDTO();
		c42.setId(42l);
		c42.setDeclinacao("-5˚ 27' 2''");
		c42.setNgc("1976");
		c42.setRaio(0.0);
		ObservationParametersDTO o42 = new ObservationParametersDTO();
		o42.setId(42l);
		o42.setAssecaoReta("5h 35 min 25 s");
		o42.setDistanciaTerra(1.600);
		o42.setIdade(0.0);
		o42.setTipo("Nebulosa");
		DeepObjectDTO d42 = new DeepObjectDTO();
		d42.setId(42l);
		d42.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/orion-nebula-xlarge_web.jpg");
		d42.setConstelacao("Orion");
		d42.setMagnitude(4.0);
		d42.setNome("M42");

		CatalogingMappingDTO c43 = new CatalogingMappingDTO();
		c43.setId(43l);
		c43.setDeclinacao("-5˚ 16' 1''");
		c43.setNgc("1982");
		c43.setRaio(0.0);
		ObservationParametersDTO o43 = new ObservationParametersDTO();
		o43.setId(43l);
		o43.setAssecaoReta("5h 35 min 37 s");
		o43.setDistanciaTerra(1.600);
		o43.setIdade(60.000);
		o43.setTipo("Nebulosa");
		DeepObjectDTO d43 = new DeepObjectDTO();
		d43.setId(43l);
		d43.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/M43_HST.jpg/1200px-M43_HST.jpg");
		d43.setConstelacao("Orion");
		d43.setMagnitude(9.0);
		d43.setNome("M43");

		CatalogingMappingDTO c44 = new CatalogingMappingDTO();
		c44.setId(44l);
		c44.setDeclinacao("+19° 59′ 0″");
		c44.setNgc("+19˚ 58' 50''");
		c44.setRaio(3.5);
		ObservationParametersDTO o44 = new ObservationParametersDTO();
		o44.setId(44l);
		o44.setAssecaoReta("8h 40min 8s");
		o44.setDistanciaTerra(577.0);
		o44.setIdade(0.0);
		o44.setTipo("Aglomerado aberto");
		DeepObjectDTO d44 = new DeepObjectDTO();
		d44.setId(44l);
		d44.setImage("https://cdn.astrobin.com/thumbs/jn0IdV0i7qr2_1824x0_TfTfHBAM.jpg");
		d44.setConstelacao("Caranguejo");
		d44.setMagnitude(3.7);
		d44.setNome("M44");

		CatalogingMappingDTO c45 = new CatalogingMappingDTO();
		c45.setId(45l);
		c45.setDeclinacao("+24˚ 7' 0''");
		c45.setNgc("---");
		c45.setRaio(0.0);
		ObservationParametersDTO o45 = new ObservationParametersDTO();
		o45.setId(45l);
		o45.setAssecaoReta("08h 40,4m");
		o45.setDistanciaTerra(0.0);
		o45.setIdade(100.0);
		o45.setTipo("Aglomerado aberto");
		DeepObjectDTO d45 = new DeepObjectDTO();
		d45.setId(45l);
		d45.setImage("https://www.espacotempo.com.br/wp-content/uploads/2022/07/m45-pleiades-1280x837.jpg");
		d45.setConstelacao("Touro");
		d45.setMagnitude(1.6);
		d45.setNome("M45");

		CatalogingMappingDTO c46 = new CatalogingMappingDTO();
		c46.setId(46l);
		c46.setDeclinacao("-14˚ 49' 7''");
		c46.setNgc("2437");
		c46.setRaio(15.0);
		ObservationParametersDTO o46 = new ObservationParametersDTO();
		o46.setId(46l);
		o46.setAssecaoReta("7h 41min 49s");
		o46.setDistanciaTerra(0.0);
		o46.setIdade(0.0);
		o46.setTipo("Aglomerado aberto");
		DeepObjectDTO d46 = new DeepObjectDTO();
		d46.setId(46l);
		d46.setImage("http://www.astrophotographybyjoemorris.net/Full%20size/Star%20Clusters/M-46-copy.jpg");
		d46.setConstelacao("Popa");
		d46.setMagnitude(6.5);
		d46.setNome("M46");

		CatalogingMappingDTO c47 = new CatalogingMappingDTO();
		c47.setId(47l);
		c47.setDeclinacao("-5˚ 48' 8''");
		c47.setNgc("2548");
		c47.setRaio(0.0);
		ObservationParametersDTO o47 = new ObservationParametersDTO();
		o47.setId(47l);
		o47.setAssecaoReta("8h 13min 49s");
		o47.setDistanciaTerra(498.0);
		o47.setIdade(0.0);
		o47.setTipo("Aglomerado aberto");
		DeepObjectDTO d47 = new DeepObjectDTO();
		d47.setId(47l);
		d47.setImage("https://cdn.eso.org/images/thumb700x/eso1441c.jpg");
		d47.setConstelacao("Popa");
		d47.setMagnitude(4.5);
		d47.setNome("M47");

		CatalogingMappingDTO c48 = new CatalogingMappingDTO();
		c48.setId(48l);
		c48.setDeclinacao("	−14° 30′");
		c48.setNgc("2548");
		c48.setRaio(23.0);
		ObservationParametersDTO o48 = new ObservationParametersDTO();
		o48.setId(48l);
		o48.setAssecaoReta("8h 13 min 49 s");
		o48.setDistanciaTerra(0.0);
		o48.setIdade(300.0);
		o48.setTipo(" Aglomerado aberto");
		DeepObjectDTO d48 = new DeepObjectDTO();
		d48.setId(48l);
		d48.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/M48_Mazur.jpg/640px-M48_Mazur.jpg");
		d48.setConstelacao("Hydra");
		d48.setMagnitude(5.8);
		d48.setNome("M48");

		CatalogingMappingDTO c49 = new CatalogingMappingDTO();
		c49.setId(49l);
		c49.setDeclinacao("+8˚ 0' 0''");
		c49.setNgc("4472");
		c49.setRaio(0.0);
		ObservationParametersDTO o49 = new ObservationParametersDTO();
		o49.setId(49l);
		o49.setAssecaoReta("12h 29 min 49 s");
		o49.setDistanciaTerra(0.0);
		o49.setIdade(0.0);
		o49.setTipo("4472");
		DeepObjectDTO d49 = new DeepObjectDTO();
		d49.setId(49l);
		d49.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m49.png?itok=ab2b9jy4");
		d49.setConstelacao("Virgo");
		d49.setMagnitude(9.4);
		d49.setNome("M49");

		CatalogingMappingDTO c50 = new CatalogingMappingDTO();
		c50.setId(50l);
		c50.setDeclinacao("-8˚ 20' 6''");
		c50.setNgc("2323");
		c50.setRaio(0.0);
		ObservationParametersDTO o50 = new ObservationParametersDTO();
		o50.setId(50l);
		o50.setAssecaoReta("7h 3min 13s");
		o50.setDistanciaTerra(0.0);
		o50.setIdade(78.0);
		o50.setTipo("Aglomerado aberto");
		DeepObjectDTO d50 = new DeepObjectDTO();
		d50.setId(50l);
		d50.setImage("https://www.messier-objects.com/wp-content/uploads/2015/05/Messier-50.jpg");
		d50.setConstelacao("Unicórnio");
		d50.setMagnitude(7.0);
		d50.setNome("M50");

		CatalogingMappingDTO c51 = new CatalogingMappingDTO();
		c51.setId(51l);
		c51.setDeclinacao("+47˚ 11' 50''");
		c51.setNgc("5194");
		c51.setRaio(0.0);
		ObservationParametersDTO o51 = new ObservationParametersDTO();
		o51.setId(51l);
		o51.setAssecaoReta(" 13h 29 min 55 s");
		o51.setDistanciaTerra(234.0);
		o51.setIdade(400.300000);
		o51.setTipo("Aglomerado aberto");
		DeepObjectDTO d51 = new DeepObjectDTO();
		d51.setId(51l);
		d51.setImage(
				"https://c4.wallpaperflare.com/wallpaper/81/386/335/hubble-spiral-galaxy-whirlpool-galaxy-messier-51-hd-wallpaper-preview.jpg");
		d51.setConstelacao("Cães de Caça");
		d51.setMagnitude(8.4);
		d51.setNome("M51");

		CatalogingMappingDTO c52 = new CatalogingMappingDTO();
		c52.setId(52l);
		c52.setDeclinacao("");
		c52.setNgc("7654");
		c52.setRaio(9.5);
		ObservationParametersDTO o52 = new ObservationParametersDTO();
		o52.setId(52l);
		o52.setAssecaoReta("13h 29min 55s");
		o52.setDistanciaTerra(5.000);
		o52.setIdade(35.0);
		o52.setTipo("Galáxia espiral");
		DeepObjectDTO d52 = new DeepObjectDTO();
		d52.setId(52l);
		d52.setImage("https://live.staticflickr.com/5654/23496602172_48a816b1b1_b.jpg");
		d52.setConstelacao("Cassiopeia");
		d52.setMagnitude(0.0);
		d52.setNome("M52");

		CatalogingMappingDTO c53 = new CatalogingMappingDTO();
		c53.setId(53l);
		c53.setDeclinacao("+18˚ 9' 49''");
		c53.setNgc("5024");
		c53.setRaio(0.0);
		ObservationParametersDTO o53 = new ObservationParametersDTO();
		o53.setId(53l);
		o53.setAssecaoReta("13h 12 min 55s");
		o53.setDistanciaTerra(0.0);
		o53.setIdade(50.000);
		o53.setTipo("Aglomerado globular");
		DeepObjectDTO d53 = new DeepObjectDTO();
		d53.setId(53l);
		d53.setImage("https://upload.wikimedia.org/wikipedia/commons/5/56/Messier_53_Hubble_WikiSky.jpg");
		d53.setConstelacao("Coma Berenices");
		d53.setMagnitude(8.33);
		d53.setNome("M53");

		CatalogingMappingDTO c54 = new CatalogingMappingDTO();
		c54.setId(54l);
		c54.setDeclinacao("-30° 28′ 42.6″");
		c54.setNgc("6715");
		c54.setRaio(0.0);
		ObservationParametersDTO o54 = new ObservationParametersDTO();
		o54.setId(54l);
		o54.setAssecaoReta("18h 55m 03.28s");
		o54.setDistanciaTerra(0.0);
		o54.setIdade(87.000);
		o54.setTipo("");
		DeepObjectDTO d54 = new DeepObjectDTO();
		d54.setId(54l);
		d54.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Messier_54_HST.jpg/1200px-Messier_54_HST.jpg");
		d54.setConstelacao("Sagitário");
		d54.setMagnitude(8.37);
		d54.setNome("M54");

		CatalogingMappingDTO c55 = new CatalogingMappingDTO();
		c55.setId(55l);
		c55.setDeclinacao(" -30˚ 57 51''");
		c55.setNgc("6809");
		c55.setRaio(0.0);
		ObservationParametersDTO o55 = new ObservationParametersDTO();
		o55.setId(55l);
		o55.setAssecaoReta("19h 40 min 2 s");
		o55.setDistanciaTerra(17.300);
		o55.setIdade(50.0);
		o55.setTipo("Aglomerado globular");
		DeepObjectDTO d55 = new DeepObjectDTO();
		d55.setId(55l);
		d55.setImage("https://upload.wikimedia.org/wikipedia/commons/d/d2/Messier_55_VISTA.jpg");
		d55.setConstelacao("Sagitário");
		d55.setMagnitude(7.42);
		d55.setNome("M55");

		CatalogingMappingDTO c56 = new CatalogingMappingDTO();
		c56.setId(56l);
		c56.setDeclinacao(" +30˚ 11' 7''");
		c56.setNgc("6779");
		c56.setRaio(42.5);
		ObservationParametersDTO o56 = new ObservationParametersDTO();
		o56.setId(56l);
		o56.setAssecaoReta("19h 16 min 37 s");
		o56.setDistanciaTerra(0.0);
		o56.setIdade(0.0);
		o56.setTipo("glomerado globular");
		DeepObjectDTO d56 = new DeepObjectDTO();
		d56.setId(56l);
		d56.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1234a.jpg?itok=ABzbW8Nz");
		d56.setConstelacao("Lira");
		d56.setMagnitude(8.3);
		d56.setNome("M56");

		CatalogingMappingDTO c57 = new CatalogingMappingDTO();
		c57.setId(57l);
		c57.setDeclinacao(" +33˚ 2' 5''");
		c57.setNgc("6720");
		c57.setRaio(1.3);
		ObservationParametersDTO o57 = new ObservationParametersDTO();
		o57.setId(57l);
		o57.setAssecaoReta("18h 53 min 37 s");
		o57.setDistanciaTerra(0.0);
		o57.setIdade(0.0);
		o57.setTipo("Nebulosa planetária");
		DeepObjectDTO d57 = new DeepObjectDTO();
		d57.setId(57l);
		d57.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/ring-nebula-full_jpg.jpg");
		d57.setConstelacao("Lira");
		d57.setMagnitude(0.0);
		d57.setNome("M57");

		CatalogingMappingDTO c58 = new CatalogingMappingDTO();
		c58.setId(58l);
		c58.setDeclinacao("+11˚ 48' 48''");
		c58.setNgc("4579");
		c58.setRaio(0.0);
		ObservationParametersDTO o58 = new ObservationParametersDTO();
		o58.setId(58l);
		o58.setAssecaoReta("12h 37 min 43 s");
		o58.setDistanciaTerra(0.0);
		o58.setIdade(0.0);
		o58.setTipo("Galáxia espiral");
		DeepObjectDTO d58 = new DeepObjectDTO();
		d58.setId(58l);
		d58.setImage("https://upload.wikimedia.org/wikipedia/commons/b/b0/M58s_%28visible%29.jpg");
		d58.setConstelacao("Virgem");
		d58.setMagnitude(+10.5);
		d58.setNome("M58");

		CatalogingMappingDTO c59 = new CatalogingMappingDTO();
		c59.setId(59l);
		c59.setDeclinacao("	+11° 38′ 49″");
		c59.setNgc("4621");
		c59.setRaio(0.0);
		ObservationParametersDTO o59 = new ObservationParametersDTO();
		o59.setId(59l);
		o59.setAssecaoReta("12h 42m 02.3s[");
		o59.setDistanciaTerra(32.900);
		o59.setIdade(0.0);
		o59.setTipo("Galáxia espiral");
		DeepObjectDTO d59 = new DeepObjectDTO();
		d59.setId(59l);
		d59.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m59_0.jpg?itok=f9VlGjZm");
		d59.setConstelacao("Virgo");
		d59.setMagnitude(+10.6);
		d59.setNome("M59");

		CatalogingMappingDTO c60 = new CatalogingMappingDTO();
		c60.setId(60l);
		c60.setDeclinacao("+11˚ 32' 49''");
		c60.setNgc("4649");
		c60.setRaio(42.5);
		ObservationParametersDTO o60 = new ObservationParametersDTO();
		o60.setId(60l);
		o60.setAssecaoReta("12h 43 min 43 s");
		o60.setDistanciaTerra(55.4);
		o60.setIdade(0.0);
		o60.setTipo("Galáxia espiral");
		DeepObjectDTO d60 = new DeepObjectDTO();
		d60.setId(60l);
		d60.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Messier_56_Hubble_WikiSky.jpg/600px-Messier_56_Hubble_WikiSky.jpg");
		d60.setConstelacao("Virgo");
		d60.setMagnitude(+9.8);
		d60.setNome("M60");

		CatalogingMappingDTO c61 = new CatalogingMappingDTO();
		c61.setId(61l);
		c61.setDeclinacao("+4˚ 27' 48''");
		c61.setNgc("4303");
		c61.setRaio(100.0);
		ObservationParametersDTO o61 = new ObservationParametersDTO();
		o61.setId(61l);
		o61.setAssecaoReta(" 12h 21 min 55 s");
		o61.setDistanciaTerra(0.0);
		o61.setIdade(0.0);
		o61.setTipo("Galáxia espiral");
		DeepObjectDTO d61 = new DeepObjectDTO();
		d61.setId(61l);
		d61.setImage("https://upload.wikimedia.org/wikipedia/commons/e/e9/A_hungry_starburst_galaxy.jpg");
		d61.setConstelacao("Virgem");
		d61.setMagnitude(9.7);
		d61.setNome("M61");

		CatalogingMappingDTO c62 = new CatalogingMappingDTO();
		c62.setId(62l);
		c62.setDeclinacao("-30° 06′ 44,5″");
		c62.setNgc("6266");
		c62.setRaio(0.0);
		ObservationParametersDTO o62 = new ObservationParametersDTO();
		o62.setId(62l);
		o62.setAssecaoReta("17h 01m 12,6");
		o62.setDistanciaTerra(21.513);
		o62.setIdade(22.500);
		o62.setTipo("Aglomerado globular");
		DeepObjectDTO d62 = new DeepObjectDTO();
		d62.setId(62l);
		d62.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/m62_0.jpg");
		d62.setConstelacao("Ofiúco");
		d62.setMagnitude(6.6);
		d62.setNome("M62");

		CatalogingMappingDTO c63 = new CatalogingMappingDTO();
		c63.setId(63l);
		c63.setDeclinacao("	+42° 01′ 45.7261″");
		c63.setNgc("5055");
		c63.setRaio(0.0);
		ObservationParametersDTO o63 = new ObservationParametersDTO();
		o63.setId(63l);
		o63.setAssecaoReta("13h 15m 49.27385s[");
		o63.setDistanciaTerra(29.3);
		o63.setIdade(0.0);
		o63.setTipo("Galáxia espiral");
		DeepObjectDTO d63 = new DeepObjectDTO();
		d63.setId(63l);
		d63.setImage("https://upload.wikimedia.org/wikipedia/commons/b/b4/M63_%28NGC_5055%29.jpg");
		d63.setConstelacao("Cães de caça");
		d63.setMagnitude(9.3);
		d63.setNome("M63");

		CatalogingMappingDTO c64 = new CatalogingMappingDTO();
		c64.setId(64l);
		c64.setDeclinacao("+21° 40′ 57.57″");
		c64.setNgc("4826");
		c64.setRaio(0.0);
		ObservationParametersDTO o64 = new ObservationParametersDTO();
		o64.setId(64l);
		o64.setAssecaoReta("12h 56m 43.696");
		o64.setDistanciaTerra(17.3);
		o64.setIdade(0.0);
		o64.setTipo("Galáxia espiral");
		DeepObjectDTO d64 = new DeepObjectDTO();
		d64.setId(64l);
		d64.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/black-eye-galaxy-print.jpg");
		d64.setConstelacao("C. Berenice");
		d64.setMagnitude(8.5);
		d64.setNome("M64");

		CatalogingMappingDTO c65 = new CatalogingMappingDTO();
		c65.setId(65l);
		c65.setDeclinacao("+13˚ 4' 47''");
		c65.setNgc("3623");
		c65.setRaio(9.46);
		ObservationParametersDTO o65 = new ObservationParametersDTO();
		o65.setId(65l);
		o65.setAssecaoReta("11h 18min 55s");
		o65.setDistanciaTerra(22.0);
		o65.setIdade(1.326e+13);
		o65.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d65 = new DeepObjectDTO();
		d65.setId(65l);
		d65.setImage("https://upload.wikimedia.org/wikipedia/commons/2/2a/Messier_65_Hubble_WikiSky.jpg");
		d65.setConstelacao("Leão");
		d65.setMagnitude(9.3);
		d65.setNome("M65");

		CatalogingMappingDTO c66 = new CatalogingMappingDTO();
		c66.setId(66l);
		c66.setDeclinacao("+12˚ 58' 46''");
		c66.setNgc("3627");
		c66.setRaio(47.500);
		ObservationParametersDTO o66 = new ObservationParametersDTO();
		o66.setId(66l);
		o66.setAssecaoReta(" 11h 20 min 13s");
		o66.setDistanciaTerra(0.0);
		o66.setIdade(0.0);
		o66.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d66 = new DeepObjectDTO();
		d66.setId(66l);
		d66.setImage("https://www.messier-objects.com/wp-content/uploads/2015/07/NGC-3627.jpg");
		d66.setConstelacao("Leão");
		d66.setMagnitude(8.9);
		d66.setNome("M66");

		CatalogingMappingDTO c67 = new CatalogingMappingDTO();
		c67.setId(67l);
		c67.setDeclinacao("+11˚ 48' 48''");
		c67.setNgc("2682");
		c67.setRaio(0.0);
		ObservationParametersDTO o67 = new ObservationParametersDTO();
		o67.setId(67l);
		o67.setAssecaoReta("8h 50 min 25 s");
		o67.setDistanciaTerra(0.0);
		o67.setIdade(4.0);
		o67.setTipo("Aglomerado aberto");
		DeepObjectDTO d67 = new DeepObjectDTO();
		d67.setId(67l);
		d67.setImage("https://cdn.astrobin.com/thumbs/oftxafoyUj-P_1824x0_av28t1GD.jpg");
		d67.setConstelacao("Caranguejo");
		d67.setMagnitude(6.9);
		d67.setNome("M67");

		CatalogingMappingDTO c68 = new CatalogingMappingDTO();
		c68.setId(68l);
		c68.setDeclinacao("+26˚ 45' 11''");
		c68.setNgc("4590");
		c68.setRaio(53.0);
		ObservationParametersDTO o68 = new ObservationParametersDTO();
		o68.setId(68l);
		o68.setAssecaoReta("12h 39 min 32 s");
		o68.setDistanciaTerra(0.0);
		o68.setIdade(0.0);
		o68.setTipo("Aglomerado globular");
		DeepObjectDTO d68 = new DeepObjectDTO();
		d68.setId(68l);
		d68.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1231a.jpg?itok=oXSd11fi");
		d68.setConstelacao("Hidra");
		d68.setMagnitude(9.67);
		d68.setNome("M68");

		CatalogingMappingDTO c69 = new CatalogingMappingDTO();
		c69.setId(69l);
		c69.setDeclinacao("-32˚ 20' 55''");
		c69.setNgc("6637");
		c69.setRaio(42.0);
		ObservationParametersDTO o69 = new ObservationParametersDTO();
		o69.setId(69l);
		o69.setAssecaoReta(" 18h 31 min 26 s");
		o69.setDistanciaTerra(29.7);
		o69.setIdade(29.0);
		o69.setTipo("Aglomerado globular");
		DeepObjectDTO d69 = new DeepObjectDTO();
		d69.setId(69l);
		d69.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Messier_69_Hubble_WikiSky.jpg/600px-Messier_69_Hubble_WikiSky.jpg");
		d69.setConstelacao("Sagitário");
		d69.setMagnitude(7.7);
		d69.setNome("M69");

		CatalogingMappingDTO c70 = new CatalogingMappingDTO();
		c70.setId(70l);
		c70.setDeclinacao("-32˚ 17' 54''");
		c70.setNgc("6681");
		c70.setRaio(0.0);
		ObservationParametersDTO o70 = new ObservationParametersDTO();
		o70.setId(70l);
		o70.setAssecaoReta(" 18h 43 min 14 s");
		o70.setDistanciaTerra(29.3);
		o70.setIdade(0.0);
		o70.setTipo("Aglomerado globular");
		DeepObjectDTO d70 = new DeepObjectDTO();
		d70.setId(70l);
		d70.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1215a.jpg?itok=n3NEFe49");
		d70.setConstelacao("Sagitário");
		d70.setMagnitude(8.1);
		d70.setNome("M70");

		CatalogingMappingDTO c71 = new CatalogingMappingDTO();
		c71.setId(71l);
		c71.setDeclinacao("+18˚ 47' 9''");
		c71.setNgc("6838");
		c71.setRaio(13.5);
		ObservationParametersDTO o71 = new ObservationParametersDTO();
		o71.setId(71l);
		o71.setAssecaoReta(" 19h 53 min 50 s");
		o71.setDistanciaTerra(0.0);
		o71.setIdade(0.0);
		o71.setTipo("Aglomerado globular");
		DeepObjectDTO d71 = new DeepObjectDTO();
		d71.setId(71l);
		d71.setImage("https://www.universetoday.com/wp-content/uploads/2009/09/m71Franke1800.jpg");
		d71.setConstelacao("Flecha");
		d71.setMagnitude(6.1);
		d71.setNome("M71");

		CatalogingMappingDTO c72 = new CatalogingMappingDTO();
		c72.setId(72l);
		c72.setDeclinacao("-12˚ 31' 48''");
		c72.setNgc("6981");
		c72.setRaio(53.0);
		ObservationParametersDTO o72 = new ObservationParametersDTO();
		o72.setId(72l);
		o72.setAssecaoReta("20h 53min 32s");
		o72.setDistanciaTerra(0.0);
		o72.setIdade(0.0);
		o72.setTipo("Aglomerado globular");
		DeepObjectDTO d72 = new DeepObjectDTO();
		d72.setId(72l);
		d72.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1001a.jpg?itok=-GuE5207");
		d72.setConstelacao("Aquário");
		d72.setMagnitude(9.4);
		d72.setNome("M72");

		CatalogingMappingDTO c73 = new CatalogingMappingDTO();
		c73.setId(73l);
		c73.setDeclinacao("-12˚ 37' 48''");
		c73.setNgc("6994");
		c73.setRaio(0.0);
		ObservationParametersDTO o73 = new ObservationParametersDTO();
		o73.setId(73l);
		o73.setAssecaoReta("20h 59 min 2 s");
		o73.setDistanciaTerra(2.500);
		o73.setIdade(0.0);
		o73.setTipo("Asterismo");
		DeepObjectDTO d73 = new DeepObjectDTO();
		d73.setId(73l);
		d73.setImage("https://www.syfy.com/sites/syfy/files/aladin_m73.jpg");
		d73.setConstelacao("Aquário");
		d73.setMagnitude(8.9);
		d73.setNome("M73");

		CatalogingMappingDTO c74 = new CatalogingMappingDTO();
		c74.setId(74l);
		c74.setDeclinacao("+15˚ 47' 9''");
		c74.setNgc("628");
		c74.setRaio(0.0);
		ObservationParametersDTO o74 = new ObservationParametersDTO();
		o74.setId(74l);
		o74.setAssecaoReta("1h 36 min 44 s");
		o74.setDistanciaTerra(306.0);
		o74.setIdade(0.0);
		o74.setTipo("Galáxia espiral");
		DeepObjectDTO d74 = new DeepObjectDTO();
		d74.setId(74l);
		d74.setImage("https://hypescience.com/wp-content/uploads/2011/04/m74.jpg");
		d74.setConstelacao("Peixes");
		d74.setMagnitude(10.0);
		d74.setNome("M74");

		CatalogingMappingDTO c75 = new CatalogingMappingDTO();
		c75.setId(75l);
		c75.setDeclinacao("-21° 55′ 20,1″");
		c75.setNgc("6864");
		c75.setRaio(65.0);
		ObservationParametersDTO o75 = new ObservationParametersDTO();
		o75.setId(75l);
		o75.setAssecaoReta("20h 06m 04,8s");
		o75.setDistanciaTerra(6.8);
		o75.setIdade(0.0);
		o75.setTipo("Aglomerado globular");
		DeepObjectDTO d75 = new DeepObjectDTO();
		d75.setId(75l);
		d75.setImage(
				"https://www.universetoday.com/wp-content/uploads/2009/09/Messier_75_-hst11628_10_08723_43-Lasinh_ABR555B438log.png");
		d75.setConstelacao("Sagitário");
		d75.setMagnitude(9.5);
		d75.setNome("M75");

		CatalogingMappingDTO c76 = new CatalogingMappingDTO();
		c76.setId(76l);
		c76.setDeclinacao("+51˚ 34' 10''");
		c76.setNgc("650");
		c76.setRaio(0.617);
		ObservationParametersDTO o76 = new ObservationParametersDTO();
		o76.setId(76l);
		o76.setAssecaoReta(": 1h 42 min 20s");
		o76.setDistanciaTerra(2.500);
		o76.setIdade(0.0);
		o76.setTipo("Nebulosa planetária");
		DeepObjectDTO d76 = new DeepObjectDTO();
		d76.setId(76l);
		d76.setImage("https://www.messier-objects.com/wp-content/uploads/2015/07/Messier-76.jpg");
		d76.setConstelacao("Perseu");
		d76.setMagnitude(10.5);
		d76.setNome("M76");

		CatalogingMappingDTO c77 = new CatalogingMappingDTO();
		c77.setId(76l);
		c77.setDeclinacao("-0˚ 0' 52''");
		c77.setNgc("-0˚ 0' 52''");
		c77.setRaio(0.0);
		ObservationParametersDTO o77 = new ObservationParametersDTO();
		o77.setId(76l);
		o77.setAssecaoReta("2h 42 min 44 s");
		o77.setDistanciaTerra(0.0);
		o77.setIdade(0.0);
		o77.setTipo("Galáxia espiral");
		DeepObjectDTO d77 = new DeepObjectDTO();
		d77.setId(76l);
		d77.setImage("");
		d77.setConstelacao("Baleia");
		d77.setMagnitude(9.5);
		d77.setNome("M77");

		CatalogingMappingDTO c78 = new CatalogingMappingDTO();
		c78.setId(78l);
		c78.setDeclinacao("+0˚ 2' 57''");
		c78.setNgc("2068");
		c78.setRaio(0.0);
		ObservationParametersDTO o78 = new ObservationParametersDTO();
		o78.setId(78l);
		o78.setAssecaoReta("5h 46min 43s");
		o78.setDistanciaTerra(1.600);
		o78.setIdade(0.0);
		o78.setTipo("Nebulosa difusa");
		DeepObjectDTO d78 = new DeepObjectDTO();
		d78.setId(78l);
		d78.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Messier_78.jpg/1200px-Messier_78.jpg");
		d78.setConstelacao("Orion");
		d78.setMagnitude(8.3);
		d78.setNome("M78");

		CatalogingMappingDTO c79 = new CatalogingMappingDTO();
		c79.setId(79l);
		c79.setDeclinacao("5h 24 min 31 s");
		c79.setNgc("1904");
		c79.setRaio(0.0);
		ObservationParametersDTO o79 = new ObservationParametersDTO();
		o79.setId(79l);
		o79.setAssecaoReta("5h 24 min 31 s");
		o79.setDistanciaTerra(0.0);
		o79.setIdade(11.7);
		o79.setTipo("Aglomerado globular");
		DeepObjectDTO d79 = new DeepObjectDTO();
		d79.setId(79l);
		d79.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/m791343x1343.png");
		d79.setConstelacao("Lebre");
		d79.setMagnitude(8.5);
		d79.setNome("M79");

		CatalogingMappingDTO c80 = new CatalogingMappingDTO();
		c80.setId(80l);
		c80.setDeclinacao("-22˚ 59' 2''");
		c80.setNgc("6093");
		c80.setRaio(47.5);
		ObservationParametersDTO o80 = new ObservationParametersDTO();
		o80.setId(80l);
		o80.setAssecaoReta("16h 17min 2s");
		o80.setDistanciaTerra(32.600);
		o80.setIdade(0.0);
		o80.setTipo("Aglomerado globular");
		DeepObjectDTO d80 = new DeepObjectDTO();
		d80.setId(80l);
		d80.setImage("https://skyandtelescope.org/wp-content/uploads/M107PHOTOmtoMENOR-664x600.jpg");
		d80.setConstelacao("Sagitário");
		d80.setMagnitude(7.87);
		d80.setNome("M80");

		CatalogingMappingDTO c81 = new CatalogingMappingDTO();
		c81.setId(81l);
		c81.setDeclinacao("+69˚ 3' 47''");
		c81.setNgc("3031");
		c81.setRaio(84.46);
		ObservationParametersDTO o81 = new ObservationParametersDTO();
		o81.setId(81l);
		o81.setAssecaoReta("9h 55 min 38 s");
		o81.setDistanciaTerra(12.0);
		o81.setIdade(0.0);
		o81.setTipo("Galáxia espiral");
		DeepObjectDTO d81 = new DeepObjectDTO();
		d81.setId(81l);
		d81.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Messier_81_HST.jpg/1200px-Messier_81_HST.jpg");
		d81.setConstelacao("Ursa Maior");
		d81.setMagnitude(6.9);
		d81.setNome("M81");

		CatalogingMappingDTO c82 = new CatalogingMappingDTO();
		c82.setId(82l);
		c82.setDeclinacao("+69˚ 40' 48''");
		c82.setNgc("3034");
		c82.setRaio(0.0);
		ObservationParametersDTO o82 = new ObservationParametersDTO();
		o82.setId(82l);
		o82.setAssecaoReta("9h 55 min 50s");
		o82.setDistanciaTerra(0.0);
		o82.setIdade(0.0);
		o82.setTipo("Galáxia irregular");
		DeepObjectDTO d82 = new DeepObjectDTO();
		d82.setId(82l);
		d82.setImage("");
		d82.setConstelacao(" Ursa Maior");
		d82.setMagnitude(8.41);
		d82.setNome("M82");

		CatalogingMappingDTO c83 = new CatalogingMappingDTO();
		c83.setId(83l);
		c83.setDeclinacao("−29° 51′ 56.74″");
		c83.setNgc("5236");
		c83.setRaio(0.0);
		ObservationParametersDTO o83 = new ObservationParametersDTO();
		o83.setId(83l);
		o83.setAssecaoReta("13h 37 min 2 s");
		o83.setDistanciaTerra(14.7);
		o83.setIdade(0.0);
		o83.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d83 = new DeepObjectDTO();
		d83.setId(83l);
		d83.setImage("");
		d83.setConstelacao("Hidra");
		d83.setMagnitude(8.5);
		d83.setNome("M83");

		CatalogingMappingDTO c84 = new CatalogingMappingDTO();
		c84.setId(84l);
		c84.setDeclinacao(" +12˚ 52' 47''");
		c84.setNgc("4374");
		c84.setRaio(0.0);
		ObservationParametersDTO o84 = new ObservationParametersDTO();
		o84.setId(84l);
		o84.setAssecaoReta("12h 25 min 8 s");
		o84.setDistanciaTerra(0.0);
		o84.setIdade(0.0);
		o84.setTipo("Galáxia lenticular");
		DeepObjectDTO d84 = new DeepObjectDTO();
		d84.setId(84l);
		d84.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1522a.jpg?itok=xyq7AGlv");
		d84.setConstelacao("Virgem");
		d84.setMagnitude(10.1);
		d84.setNome("M84");

		CatalogingMappingDTO c85 = new CatalogingMappingDTO();
		c85.setId(85l);
		c85.setDeclinacao("+18˚ 10' 48''");
		c85.setNgc("4382");
		c85.setRaio(62.5);
		ObservationParametersDTO o85 = new ObservationParametersDTO();
		o85.setId(85l);
		o85.setAssecaoReta("12h 25 min 25 s");
		o85.setDistanciaTerra(0.0);
		o85.setIdade(0.0);
		o85.setTipo("");
		DeepObjectDTO d85 = new DeepObjectDTO();
		d85.setId(85l);
		d85.setImage("https://www.messier-objects.com/wp-content/uploads/2015/08/NGC-4394-and-M85.jpg");
		d85.setConstelacao("C. Berenice");
		d85.setMagnitude(10.5);
		d85.setNome("M85");

		CatalogingMappingDTO c86 = new CatalogingMappingDTO();
		c86.setId(85l);
		c86.setDeclinacao(" +12˚ 56' 47''");
		c86.setNgc("4406");
		c86.setRaio(0.0);
		ObservationParametersDTO o86 = new ObservationParametersDTO();
		o86.setId(85l);
		o86.setAssecaoReta("12h 26 min 13 s");
		o86.setDistanciaTerra(0.0);
		o86.setIdade(0.0);
		o86.setTipo("Galáxia lenticular");
		DeepObjectDTO d86 = new DeepObjectDTO();
		d86.setId(85l);
		d86.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m86.png?itok=crFZLfcg");
		d86.setConstelacao("Virgem");
		d86.setMagnitude(9.8);
		d86.setNome("M86");

		CatalogingMappingDTO c87 = new CatalogingMappingDTO();
		c87.setId(87l);
		c87.setDeclinacao("+12˚ 23' 48''");
		c87.setNgc("4486");
		c87.setRaio(62.5);
		ObservationParametersDTO o87 = new ObservationParametersDTO();
		o87.setId(87l);
		o87.setAssecaoReta("12h 25m 24,0");
		o87.setDistanciaTerra(0.0);
		o87.setIdade(0.0);
		o87.setTipo("Galáxia elíptica");
		DeepObjectDTO d87 = new DeepObjectDTO();
		d87.setId(87l);
		d87.setImage("https://cdn.astrobin.com/thumbs/HfqI4FdhCu9z_1824x0_jaUALzhf.jpg");
		d87.setConstelacao("Virgem");
		d87.setMagnitude(11.0);
		d87.setNome("M87");

		CatalogingMappingDTO c88 = new CatalogingMappingDTO();
		c88.setId(88l);
		c88.setDeclinacao("+14˚ 24' 47''");
		c88.setNgc("4501");
		c88.setRaio(0.0);
		ObservationParametersDTO o88 = new ObservationParametersDTO();
		o88.setId(88l);
		o88.setAssecaoReta(" 12h 32 min 2 s");
		o88.setDistanciaTerra(0.0);
		o88.setIdade(0.0);
		o88.setTipo("Galáxia espiral");
		DeepObjectDTO d88 = new DeepObjectDTO();
		d88.setId(88l);
		d88.setImage("https://upload.wikimedia.org/wikipedia/commons/a/a6/Messier_88_galaxy.jpg");
		d88.setConstelacao("Coma Berenices");
		d88.setMagnitude(10.4);
		d88.setNome("M88");

		CatalogingMappingDTO c89 = new CatalogingMappingDTO();
		c89.setId(89l);
		c89.setDeclinacao("+12° 33′ 23″");
		c89.setNgc("4552");
		c89.setRaio(0.0);
		ObservationParametersDTO o89 = new ObservationParametersDTO();
		o89.setId(89l);
		o89.setAssecaoReta("12h 35 min 43 s");
		o89.setDistanciaTerra(0.0);
		o89.setIdade(0.0);
		o89.setTipo("Galáxia eliptica");
		DeepObjectDTO d89 = new DeepObjectDTO();
		d89.setId(89l);
		d89.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Messier_089_Hubble_WikiSky.jpg/800px-Messier_089_Hubble_WikiSky.jpg");
		d89.setConstelacao("Virgem");
		d89.setMagnitude(10.73);
		d89.setNome("M89");

		CatalogingMappingDTO c90 = new CatalogingMappingDTO();
		c90.setId(90l);
		c90.setDeclinacao(" +13˚ 9' 48''");
		c90.setNgc("4569");
		c90.setRaio(0.0);
		ObservationParametersDTO o90 = new ObservationParametersDTO();
		o90.setId(90l);
		o90.setAssecaoReta("12h 36 min 50 s");
		o90.setDistanciaTerra(58.7);
		o90.setIdade(133.00000000);
		o90.setTipo("Galáxia espiral");
		DeepObjectDTO d90 = new DeepObjectDTO();
		d90.setId(90l);
		d90.setImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Messier_90_-_HST.png/1200px-Messier_90_-_HST.png");
		d90.setConstelacao("Virgem");
		d90.setMagnitude(10.26);
		d90.setNome("M90");

		CatalogingMappingDTO c91 = new CatalogingMappingDTO();
		c91.setId(91l);
		c91.setDeclinacao("+14˚ 29' 49''");
		c91.setNgc("4548");
		c91.setRaio(0.0);
		ObservationParametersDTO o91 = new ObservationParametersDTO();
		o91.setId(91l);
		o91.setAssecaoReta("12h 35 min 25 s");
		o91.setDistanciaTerra(63.0);
		o91.setIdade(0.0);
		o91.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d91 = new DeepObjectDTO();
		d91.setId(91l);
		d91.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m91_wfc3_4_crop_v2_final-with-tag.jpg?itok=7WPZMHms");
		d91.setConstelacao("C. Berenice");
		d91.setMagnitude(11.0);
		d91.setNome("M91");

		CatalogingMappingDTO c92 = new CatalogingMappingDTO();
		c92.setId(92l);
		c92.setDeclinacao("+43˚ 8' 0''");
		c92.setNgc("6341");
		c92.setRaio(54.5);
		ObservationParametersDTO o92 = new ObservationParametersDTO();
		o92.setId(92l);
		o92.setAssecaoReta(" 17h 17 min 7 s");
		o92.setDistanciaTerra(26.700);
		o92.setIdade(2714.0);
		o92.setTipo("Aglomerado globular");
		DeepObjectDTO d92 = new DeepObjectDTO();
		d92.setId(92l);
		d92.setImage("https://upload.wikimedia.org/wikipedia/commons/4/43/Messier_92_Hubble_WikiSky.jpg");
		d92.setConstelacao("Hercules");
		d92.setMagnitude(7.5);
		d92.setNome("M92");

		CatalogingMappingDTO c93 = new CatalogingMappingDTO();
		c93.setId(93l);
		c93.setDeclinacao("-23˚ 52' 8''");
		c93.setNgc("2447");
		c93.setRaio(0.0);
		ObservationParametersDTO o93 = new ObservationParametersDTO();
		o93.setId(93l);
		o93.setAssecaoReta("7h 44 min 37 s");
		o93.setDistanciaTerra(3.38);
		o93.setIdade(0.0);
		o93.setTipo("Aglomerado aberto");
		DeepObjectDTO d93 = new DeepObjectDTO();
		d93.setId(93l);
		d93.setImage("https://www.messier-objects.com/wp-content/uploads/2015/08/Messier-93.jpg");
		d93.setConstelacao("Popa");
		d93.setMagnitude(6.5);
		d93.setNome("M93");

		CatalogingMappingDTO c94 = new CatalogingMappingDTO();
		c94.setId(94l);
		c94.setDeclinacao("+41˚ 6' 49''");
		c94.setNgc("4736");
		c94.setRaio(0.0);
		ObservationParametersDTO o94 = new ObservationParametersDTO();
		o94.setId(94l);
		o94.setAssecaoReta("12h 50 min 55 s");
		o94.setDistanciaTerra(32.614);
		o94.setIdade(0.0);
		o94.setTipo("Galáxia espiral");
		DeepObjectDTO d94 = new DeepObjectDTO();
		d94.setId(94l);
		d94.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/potw1542a_0.jpg");
		d94.setConstelacao("Cães de Caça");
		d94.setMagnitude(8.99);
		d94.setNome("M94");

		CatalogingMappingDTO c95 = new CatalogingMappingDTO();
		c95.setId(95l);
		c95.setDeclinacao("+11˚ 41' 46''");
		c95.setNgc("3351");
		c95.setRaio(0.0);
		ObservationParametersDTO o95 = new ObservationParametersDTO();
		o95.setId(95l);
		o95.setAssecaoReta("10h 44 min 2s");
		o95.setDistanciaTerra(0.0);
		o95.setIdade(0.0);
		o95.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d95 = new DeepObjectDTO();
		d95.setId(95l);
		d95.setImage(
				"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/potw1535a.jpg?itok=SCptJsa4");
		d95.setConstelacao("Leão");
		d95.setMagnitude(11.0);
		d95.setNome("M95");

		CatalogingMappingDTO c96 = new CatalogingMappingDTO();
		c96.setId(96l);
		c96.setDeclinacao(" +11˚ 48' 46''");
		c96.setNgc("3368");
		c96.setRaio(0.0);
		ObservationParametersDTO o96 = new ObservationParametersDTO();
		o96.setId(96l);
		o96.setAssecaoReta("10h 46 min 50 s");
		o96.setDistanciaTerra(0.0);
		o96.setIdade(0.0);
		o96.setTipo(" Galáxia espiral");
		DeepObjectDTO d96 = new DeepObjectDTO();
		d96.setId(96l);
		d96.setImage("https://upload.wikimedia.org/wikipedia/commons/f/fd/The_VLT_goes_lion_hunting.jpg");
		d96.setConstelacao("Leão");
		d96.setMagnitude(+10.1);
		d96.setNome("M96");

		CatalogingMappingDTO c97 = new CatalogingMappingDTO();
		c97.setId(97l);
		c97.setDeclinacao("+55˚ 0' 46''");
		c97.setNgc("3587");
		c97.setRaio(0.91378);
		ObservationParametersDTO o97 = new ObservationParametersDTO();
		o97.setId(97l);
		o97.setAssecaoReta("");
		o97.setDistanciaTerra(2.600);
		o97.setIdade(0.0);
		o97.setTipo("Nebulosa planetária");
		DeepObjectDTO d97 = new DeepObjectDTO();
		d97.setId(97l);
		d97.setImage("https://cdn.eso.org/images/thumb700x/eso1532a.jpg");
		d97.setConstelacao("Ursa Maior");
		d97.setMagnitude(9.9);
		d97.setNome("M97");

		CatalogingMappingDTO c98 = new CatalogingMappingDTO();
		c98.setId(98l);
		c98.setDeclinacao("");
		c98.setNgc("3587");
		c98.setRaio(0.0);
		ObservationParametersDTO o98 = new ObservationParametersDTO();
		o98.setId(98l);
		o98.setAssecaoReta("12h 13 min 50s");
		o98.setDistanciaTerra(60.0);
		o98.setIdade(98.0);
		o98.setTipo("");
		DeepObjectDTO d98 = new DeepObjectDTO();
		d98.setId(98l);
		d98.setImage("https://upload.wikimedia.org/wikipedia/commons/9/92/Messier_98.jpg");
		d98.setConstelacao("Coma Berenices");
		d98.setMagnitude(10.1);
		d98.setNome("M98");

		CatalogingMappingDTO c99 = new CatalogingMappingDTO();
		c99.setId(99l);
		c99.setDeclinacao(" +14˚ 24' 47''");
		c99.setNgc("4254");
		c99.setRaio(0.0);
		ObservationParametersDTO o99 = new ObservationParametersDTO();
		o99.setId(99l);
		o99.setAssecaoReta("12h 18 min 50 s");
		o99.setDistanciaTerra(60.0);
		o99.setIdade(0.0);
		o99.setTipo("Galáxia espiral não barrada");
		DeepObjectDTO d99 = new DeepObjectDTO();
		d99.setId(99l);
		d99.setImage("https://upload.wikimedia.org/wikipedia/commons/8/83/M99s_crop.jpg");
		d99.setConstelacao("Coma Berenices");
		d99.setMagnitude(10.4);
		d99.setNome("M99");

		CatalogingMappingDTO c100 = new CatalogingMappingDTO();
		c100.setId(100l);
		c100.setDeclinacao("+15° 49′ 21″");
		c100.setNgc("4321");
		c100.setRaio(0.0);
		ObservationParametersDTO o100 = new ObservationParametersDTO();
		o100.setId(100l);
		o100.setAssecaoReta("12h 22m 54.9s");
		o100.setDistanciaTerra(0.0);
		o100.setIdade(52.5);
		o100.setTipo("Galáxia espiral");
		DeepObjectDTO d100 = new DeepObjectDTO();
		d100.setId(100l);
		d100.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/M100.png/1200px-M100.png");
		d100.setConstelacao("Coma Berenices");
		d100.setMagnitude(10.0);
		d100.setNome("M100");

		CatalogingMappingDTO c101 = new CatalogingMappingDTO();
		c101.setId(101l);
		c101.setDeclinacao("+54˚ 20' 51''");
		c101.setNgc("5457");
		c101.setRaio(0.0);
		ObservationParametersDTO o101 = new ObservationParametersDTO();
		o101.setId(101l);
		o101.setAssecaoReta("14h 3 min 13 s");
		o101.setDistanciaTerra(0.0);
		o101.setIdade(20000.0);
		o101.setTipo("Galáxia espiral");
		DeepObjectDTO d101 = new DeepObjectDTO();
		d101.setId(101l);
		d101.setImage("Ursa Major");
		d101.setConstelacao("Ursa Maior");
		d101.setMagnitude(7.86);
		d101.setNome("M101");

		CatalogingMappingDTO c102 = new CatalogingMappingDTO();
		c102.setId(102l);
		c102.setDeclinacao(" +55˚ 45' 0''");
		c102.setNgc("5866/");
		c102.setRaio(0.0);
		ObservationParametersDTO o102 = new ObservationParametersDTO();
		o102.setId(102l);
		o102.setAssecaoReta("15h 6 min 58 s");
		o102.setDistanciaTerra(0.0);
		o102.setIdade(0.0);
		o102.setTipo("Galáxia lenticular");
		DeepObjectDTO d102 = new DeepObjectDTO();
		d102.setId(102l);
		d102.setImage("");
		d102.setConstelacao("Dragão");
		d102.setMagnitude(10.7);
		d102.setNome("M102");
		
		CatalogingMappingDTO c103 = new CatalogingMappingDTO();
		c103.setId(103l);
		c103.setDeclinacao("+60˚ 42' 10''");
		c103.setNgc("581");
		c103.setRaio(0.0);
		ObservationParametersDTO o103 = new ObservationParametersDTO();
		o103.setId(103l);
		o103.setAssecaoReta(" 1h 33 min 14 s");
		o103.setDistanciaTerra(50.000000);
		o103.setIdade(25.000000);
		o103.setTipo("Aglomerado aberto");
		DeepObjectDTO d103 = new DeepObjectDTO();
		d103.setId(103l);
		d103.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/M103_Mazur.jpg/1200px-M103_Mazur.jpg");
		d103.setConstelacao("Cassiopeia");
		d103.setMagnitude(7.4);
		d103.setNome("M103");
		
		CatalogingMappingDTO c104 = new CatalogingMappingDTO();
		c104.setId(104l);
		c104.setDeclinacao("-11˚ 37' 11''");
		c104.setNgc("4594");
		c104.setRaio(0.0);
		ObservationParametersDTO o104 = new ObservationParametersDTO();
		o104.setId(104l);
		o104.setAssecaoReta("12h 40 min 2 s");
		o104.setDistanciaTerra(0.0);
		o104.setIdade(0.0);
		o104.setTipo("Galáxia espiral");
		DeepObjectDTO d104 = new DeepObjectDTO();
		d104.setId(104l);
		d104.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/sombrero-galaxy.jpg?itok=0bph5fym");
		d104.setConstelacao("Virgem");
		d104.setMagnitude(9.5);
		d104.setNome("M104");
		
		CatalogingMappingDTO c105 = new CatalogingMappingDTO();
		c105.setId(105l);
		c105.setDeclinacao(": +12˚ 34' 47''");
		c105.setNgc("3379");
		c105.setRaio(32.0);
		ObservationParametersDTO o105 = new ObservationParametersDTO();
		o105.setId(105l);
		o105.setAssecaoReta("10h 47 min 50 s");
		o105.setDistanciaTerra(0.0);
		o105.setIdade(1.325e+13);
		o105.setTipo("Galáxia elíptica");
		DeepObjectDTO d105 = new DeepObjectDTO();
		d105.setId(105l);
		d105.setImage("https://www.nasa.gov/sites/default/files/thumbnails/image/m105.jpg");
		d105.setConstelacao("Leão");
		d105.setMagnitude(11.0);
		d105.setNome("M105");
		
		CatalogingMappingDTO c106 = new CatalogingMappingDTO();
		c106.setId(106l);
		c106.setDeclinacao("+47˚ 17' 47''");
		c106.setNgc("4258");
		c106.setRaio(67.500);
		ObservationParametersDTO o106 = new ObservationParametersDTO();
		o106.setId(106l);
		o106.setAssecaoReta(" 12h 19 min 2 s");
		o106.setDistanciaTerra(23.680000);
		o106.setIdade(1.328e+13);
		o106.setTipo("Galáxia espiral");
		DeepObjectDTO d106 = new DeepObjectDTO();
		d106.setId(106l);
		d106.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Messier_106_by_Spitzer.jpg/800px-Messier_106_by_Spitzer.jpg");
		d106.setConstelacao("Cães de Caça");
		d106.setMagnitude(9.5);
		d106.setNome("M106");
		
		CatalogingMappingDTO c107 = new CatalogingMappingDTO();
		c107.setId(107l);
		c107.setDeclinacao("-13˚ 3' 2''");
		c107.setNgc("6171");
		c107.setRaio(39.5);
		ObservationParametersDTO o107 = new ObservationParametersDTO();
		o107.setId(107l);
		o107.setAssecaoReta("16h 32 min 32 s");
		o107.setDistanciaTerra(20.000);
		o107.setIdade(0.0);
		o107.setTipo("Aglomerado globular");
		DeepObjectDTO d107 = new DeepObjectDTO();
		d107.setId(107l);
		d107.setImage("https://cdn.eso.org/images/thumb700x/eso1048a.jpg");
		d107.setConstelacao("Ofiúco");
		d107.setMagnitude(+8.85);
		d107.setNome("M107");
		
		
		CatalogingMappingDTO c108 = new CatalogingMappingDTO();
		c108.setId(108l);
		c108.setDeclinacao("+55˚ 39' 46''");
		c108.setNgc("3556");
		c108.setRaio(0.0);
		ObservationParametersDTO o108 = new ObservationParametersDTO();
		o108.setId(108l);
		o108.setAssecaoReta("11h 11 min 32 s");
		o108.setDistanciaTerra(0.0);
		o108.setIdade(1.327e+13);
		o108.setTipo("Galáxia espiral");
		DeepObjectDTO d108 = new DeepObjectDTO();
		d108.setId(108l);
		d108.setImage("http://annesastronomynews.com/wp-content/uploads/2012/02/Messier-108-by-Ken-Crawford.jpg");
		d108.setConstelacao(" Ursa Maior");
		d108.setMagnitude(11.0);
		d108.setNome("M108");
		
		CatalogingMappingDTO c109 = new CatalogingMappingDTO();
		c109.setId(109l);
		c109.setDeclinacao("+53˚ 22' 47''");
		c109.setNgc("3992");
		c109.setRaio(0.0);
		ObservationParametersDTO o109 = new ObservationParametersDTO();
		o109.setId(109l);
		o109.setAssecaoReta("11h 57 min 37 s");
		o109.setDistanciaTerra(0.0);
		o109.setIdade(1.325e+13);
		o109.setTipo("Galáxia espiral barrada");
		DeepObjectDTO d109 = new DeepObjectDTO();
		d109.setId(109l);
		d109.setImage("https://upload.wikimedia.org/wikipedia/commons/5/57/Messier-109-NGC-3992.jpg");
		d109.setConstelacao("Ursa Maior");
		d109.setMagnitude(11.0);
		d109.setNome("M109");
		
		CatalogingMappingDTO c110 = new CatalogingMappingDTO();
		c110.setId(110l);
		c110.setDeclinacao(" +41˚ 41' 10''");
		c110.setNgc("205");
		c110.setRaio(8.500);
		ObservationParametersDTO o110 = new ObservationParametersDTO();
		o110.setId(110l);
		o110.setAssecaoReta(" 0h 40 min 26 s");
		o110.setDistanciaTerra(0.0);
		o110.setIdade(2.9);
		o110.setTipo("Galáxia elíptica anã");
		DeepObjectDTO d110 = new DeepObjectDTO();
		d110.setId(110l);
		d110.setImage("https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m110.png?itok=6wjqn0a-");
		d110.setConstelacao("Andrômeda");
		d110.setMagnitude(10.0);
		d110.setNome("M110");

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
		obserRepository.saveAll(Arrays.asList(mapper.map(o7, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d7, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c8, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o8, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d8, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c9, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o9, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d9, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c10, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o10, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d10, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c11, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o11, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d11, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c12, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o12, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d12, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c13, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o13, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d13, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c14, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o14, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d14, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c15, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o15, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d15, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c16, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o16, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d16, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c17, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o17, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d17, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c18, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o18, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d18, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c19, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o19, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d19, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c20, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o20, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d20, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c21, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o21, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d21, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c22, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o22, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d22, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c23, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o23, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d23, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c24, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o24, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d24, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c25, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o25, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d25, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c26, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o26, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d26, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c27, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o27, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d27, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c28, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o28, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d28, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c29, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o29, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d29, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c30, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o30, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d30, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c31, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o31, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d31, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c32, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o32, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d32, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c33, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o33, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d33, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c34, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o34, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d34, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c35, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o35, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d35, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c36, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o36, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d36, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c37, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o37, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d37, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c38, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o38, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d38, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c39, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o39, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d39, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c40, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o40, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d40, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c41, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o41, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d41, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c42, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o42, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d42, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c43, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o43, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d43, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c44, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o44, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d44, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c45, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o45, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d45, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c46, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o46, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d46, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c47, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o47, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d47, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c48, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o48, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d48, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c49, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o49, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d49, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c50, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o50, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d50, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c51, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o51, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d51, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c52, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o52, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d52, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c53, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o53, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d53, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c54, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o54, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d54, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c55, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o55, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d55, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c56, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o56, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d56, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c57, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o57, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d57, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c58, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o58, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d58, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c59, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o59, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d59, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c60, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o60, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d60, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c61, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o61, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d61, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c62, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o62, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d62, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c63, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o63, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d63, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c64, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o64, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d64, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c65, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o65, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d65, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c66, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o66, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d66, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c67, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o67, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d67, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c68, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o68, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d68, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c69, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o69, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d69, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c70, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o70, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d70, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c71, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o71, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d71, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c72, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o72, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d72, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c73, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o73, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d73, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c74, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o74, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d74, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c75, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o75, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d75, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c76, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o76, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d76, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c77, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o77, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d77, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c78, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o78, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d78, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c79, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o79, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d79, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c80, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o80, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d80, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c81, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o81, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d81, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c82, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o82, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d82, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c83, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o83, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d83, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c84, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o84, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d84, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c85, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o85, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d85, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c86, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o86, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d86, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c87, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o87, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d87, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c88, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o88, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d88, DeepObject.class)));

		catalRepository.saveAll(Arrays.asList(mapper.map(c89, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o89, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d89, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c90, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o90, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d90, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c91, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o91, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d91, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c92, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o92, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d92, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c93, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o93, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d93, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c94, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o94, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d94, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c95, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o95, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d95, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c96, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o96, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d96, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c97, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o97, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d97, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c98, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o98, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d98, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c99, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o99, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d99, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c100, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o100, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d100, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c101, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o101, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d101, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c102, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o102, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d102, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c103, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o103, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d103, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c104, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o104, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d104, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c105, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o105, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d105, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c106, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o106, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d106, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c107, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o107, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d107, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c108, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o108, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d108, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c109, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o109, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d109, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c110, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o110, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d110, DeepObject.class)));
		
		catalRepository.saveAll(Arrays.asList(mapper.map(c110, CatalogingMapping.class)));
		obserRepository.saveAll(Arrays.asList(mapper.map(o110, ObservationParameters.class)));
		deepObjectRepository.saveAll(Arrays.asList(mapper.map(d110, DeepObject.class)));

	}
}
