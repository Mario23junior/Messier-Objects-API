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
		d64.setMagnitude(0.0);
		d64.setNome("M64");

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

	}
}
