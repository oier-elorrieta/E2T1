package JUnitTest;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Agentzia;

import modelo.Aireportu;

import modelo.Bidai;

import modelo.DAO;

public class DaoTests {

	// parametroetatik pasatzen ditu datu basean existitzen diren ala ez metodoa

	// egiaztatuko dituen datuak. Datuak datu basean erregistratuta badaude

	// AssertFalse zuzena izango da, errorea = true edo falsea itzultzen duela eta,

	// erregistroak dauden ala ez kontuan hartuta.

	@Test

	public void saioaKonprobatuTestOndo() {

		String erabiltzailea = "admin";

		String pasahitza = "admin";

		boolean emaitza = DAO.saioaKonprobatu(erabiltzailea, pasahitza);

		assertFalse(emaitza);

	}

	// string-array bat sortzen du esperotako emaitza jasotzen duena eta beste

	// string-array bat sortzen du metodoak itzultzen dituen datu basearen

	// langile-kopuruaren taularen erregistroak jasotzen duena. Konparatzen du

	// esperotako arrayaren 0 posizioa metodoak itzultzen dituen erregistroak

	// jasotzen dituen arrayaren 1 posizioa. 1. posizioa deklaratzen da arrayak

	// jasotzen duen lehenengo emaitzak ez duelako daturik jasotzen metodoak

	// itzultzen dituen datuak txertatzen diren komboboxeko estetika dela eta.

	@Test

	public void LangileKopuruaTestOndo() {

		String[] esperotakoa = { "5 gehienez ( 1 - 5 bitartean)" };

		String[] emaitza = DAO.langileKopurua();

		assertEquals(esperotakoa[0], emaitza[1]);

	}

	// array bat sortzen du esperotako emaitza jasotzen duena eta metodoa jasotzen

	// duen datu-baseko agentzia_mota taulako erregistroak jasotzen dituen array-a.

	// Konparatzen du esperotako arrayaren 0 posizioa metodoak itzultzen dituen

	// erregistroak jasotzen dituen arrayaren 1 posizioa. 1. posizioa deklaratzen da

	// arrayak jasotzen duen lehenengo emaitzak ez duelako daturik jasotzen metodoak

	// itzultzen dituen datuak txertatzen diren komboboxeko estetika dela eta.

	@Test

	public void agentziaMotaTestOndo() {

		String[] esperotakoa = { "Mayorista" };

		String[] emaitza = DAO.agentziaMota();

		assertEquals(esperotakoa[0], emaitza[1]);

	}

	// datu-erregistro berri bat sortzen du agentzia-motako objektu batekin, eta

	// datu-baseari gehitzen dio. Datu-basean erregistro berriaren erabiltzailea eta

	// pasahitza alderatzean errorerik ez badago, assertFalse zuzen itzultzen du.

	@Test

	public void agentziaberriTestOndo() {

		String erabiltzailea = "erabiltzaile_proba1";

		String pasahitza = "passwrd";

		// Erabiltzailea aldatu testa exekutatzerakoan

		Agentzia ag = new Agentzia("Proba_ag", "logo", "#FFFFFF", "L2", "A1", erabiltzailea, pasahitza);

		DAO.agentziaberri(ag);

		assertFalse(DAO.saioaKonprobatu(erabiltzailea, pasahitza));

	}

	// metodoak eskatzen duen int zenbaki bat parametrotik pasatzen da. Metodoak

	// parametro gisa pasatu den langile kopuruaren kodea itzultzen du. Beraz, eskuz

	// sartzen dugun kodea eta metodoa itzultzen duen kodea alderatuko ditu.

	// Berdinak badira, asserequals arazorik gabe exekutatuko da.

	@Test

	public void langKopAgentziBilatuTestOndo() {

		int kopurua = 1;

		String emaitza = DAO.langKopAgentziBilatu(kopurua);

		assertEquals("L1", emaitza);

	}

	// metodoak eskatzen duen int zenbaki bat parametrotik pasatzen da. Metodoak

	// parametro gisa pasatu den agentzia motaren kodea itzultzen du. Beraz, eskuz

	// sartzen dugun kodea eta metodoa itzultzen duen kodea alderatuko ditu.

	// Berdinak badira, asserequals arazorik gabe exekutatuko da.

	@Test

	public void agentziaMotaBilatuTestOndo() {

		int kopurua = 1;

		String emaitza = DAO.agentziaMotaBilatu(kopurua);

		assertEquals("A1", emaitza);

	}

	// agentzia-erregistro berri bat sortu eta datu-baseari gehituko diogu. Espero

	// dugun balioa metodoak itzultzen duen balioa agentziaren arabera alderatzen

	// ditu.

	@Test

	public void KoloreaHartuTestOndo() {

		// Erabiltzailea aldatu testa exekutatzerakoan

		Agentzia ag = new Agentzia("Proba_ag", "logo", "#FFFFFF", "L2", "A1", "erabiltzaile_proba3", "passwrd");

		DAO.agentziaberri(ag);

		String esperotakoKolorea = "#FFFFFF";

		String emaitza = DAO.koloreaHartu(ag);

		assertEquals(esperotakoKolorea, emaitza);

	}

	// agentzia bat sortu eta datu-basean txertatzen du, gero sortu berri dugun

	// erregistroaren erabiltzailea eta pasahitza parametroetatik pasatzeko

	// metodora. metodoak parametro horiekin bilatzen du erregistroa datu-basean,

	// eta sortutako erregistroaren datuak datu-basean aurkitutako erregistroarekin

	// alderatzen ditu.

	@Test

	public void agentziaKargatuBDTestOndo() {

		String erabiltzailea = "erabiltzaile_proba4";

		String pasahitza = "passwrd";

		// Erabiltzailea aldatu testa exekutatzerakoan

		Agentzia ag = new Agentzia("Proba_ag", "logo", "#FFFFFF", "L2", "A1", erabiltzailea, pasahitza);

		DAO.agentziaberri(ag);

		Agentzia emaitza = DAO.agentziaKargatuBD(erabiltzailea, pasahitza);

		assertEquals(ag.getIzena(), emaitza.getIzena());

		assertEquals(ag.getLogo(), emaitza.getLogo());

		assertEquals(ag.getMarkakolore(), emaitza.getMarkakolore());

		assertEquals(ag.getLangkop(), emaitza.getLangkop());

		assertEquals(ag.getAgmota(), emaitza.getAgmota());

		assertEquals(ag.getErabiltzaile(), emaitza.getErabiltzaile());

		assertEquals(ag.getPasahitz(), emaitza.getPasahitz());

	}

	// bidaia-taulan dauden erregistro guztiek zenbatzen duten metodoak itzultzen

	// duen balioa jasoko dugu. bidaia berri bat sortu eta datubasean txertatzen du.

	// Berriro ere, taularen erregistro kopuruaren balioa jasotzen du. Batu dugun

	// lehen balioa gehitzen bat bigarrena bezalakoa bada, erregistro bat gehitu

	// zaio datu-baseari.

	@Test

	public void testBidaiGordeDB() {

		int zenbatlehen = DAO.bidaiakZenbatu();

		System.out.println(zenbatlehen);

		Agentzia ag = new Agentzia();

		Bidai bid = new Bidai("Bidaia_froga", 1, "deskrib", "zerbitzuak", "B1", "2025-09-12", "2026-01-09", "FR");

		DAO.bidaiGordeDB(ag, bid);

		int zenbatgero = DAO.bidaiakZenbatu();

		System.out.println(zenbatgero);

		assertEquals(zenbatlehen + 1, zenbatgero);

	}

	// sortzen du arrayList bat, metodoa bidaia_mota taulatik itzultzen dituen

	// emaitza guztiak jasoko dituena. Ziurtatu behar dugu arrayList ez dela null.

	// Beraz, datu-baseko taulako erregistroak jasotzen ari ditu.

	@Test

	public void testbidaiaMotaOndo() {

		ArrayList<String> bidaiaMota = new ArrayList<String>();

		bidaiaMota = DAO.bidaiaMota();

		assertNotNull(bidaiaMota);

	}

	// bidaia_mota taulako deskribapenaren edukiaren zati bat parametrotzat hartzen

	// dugunean metodoak itzultzen duen balioa jasoko dugu. Parametrotik pasatu

	// dugun deskribapenari dagokion kodea bilatzen du. Jasotzen dugun balioa null

	// ez dela ziurtatzen dugu.

	@Test

	public void testbidaiaMotaBilatuOndo() {

		String emaitza = DAO.bidaiaMotaBilatu("Senior");

		assertNotNull(emaitza);

	}

	// arrayList bat sortzen du, metodoa itzultzen duen herrialde taularen

	// erregistroak jasoko duena. Jasotzen ditugun balioak null ez direla

	// egiaztatzen dugu.

	@Test

	public void testherrialdeMotaOndo() {

		ArrayList<String> herrialdeMota = new ArrayList<String>();

		herrialdeMota = DAO.herrialdeMota();

		assertNotNull(herrialdeMota);

	}

	// Herrialdeak taulako erregistro bakoitza jasoko duen arrayList bat sortuko

	// dugu, eta metodoak ateratzen duen erregistro bakoitzak array batean sartuko

	// du.

	// Balioak null ez direla ziurtatuko dugu.

	@Test

	public void testherrialdeakKargatuOndo() {

		ArrayList<String[]> herrialdeak = new ArrayList<String[]>();

		herrialdeak = DAO.herrialdeakKargatu();

		assertNotNull(herrialdeak);

	}

	// ArrayList bat sortzen du. ArrayList horrek metodoa itzultzen duen

	// aireportu-taulako erregistroak jasoko ditu. ziurtatzen du jasotzen ditugun

	// balioak ez direla null.

	@Test

	public void testaireportuakKargatuDB() {

		ArrayList<Aireportu> aireportuak = new ArrayList<Aireportu>();

		aireportuak = DAO.aireportuakKargatuDB();

		assertNotNull(aireportuak);

	}

	// Airelineak taulako erregistro bakoitza jasoko duen arrayList bat sortuko

	// dugu, eta metodoak ateratzen duen erregistro bakoitzak array batean sartuko

	// du.

	// Balioak null ez direla ziurtatuko dugu.

	@Test

	public void testairelineakKargatuDB() {

		ArrayList<String[]> airelineak = new ArrayList<String[]>();

		airelineak = DAO.airelineakKargatuDB();

		assertNotNull(airelineak);

	}

	// agentzia motako objektu bat sortzen du, parametrotik igarotako datuak biltzen

	// dituen erregistroaren metodoak aurkitzen dituen datuak bilduko dituena.

	@Test

	public void testagentziaKargatuBD() {

		Agentzia agentzia = new Agentzia();

		agentzia = DAO.agentziaKargatuBD("admin", "admin");

		assertNotNull(agentzia);

	}

	// bidaia motako objektuen arrayList bat sortzea. arrayList honek metodoak

	// eragiten duen kontsultan betegarri gisa agertzen diren datuak bilduko ditu

	@Test

	public void testbidaiKargatuDB() {

		ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();

		Agentzia ag = new Agentzia();

		bidaiak = DAO.bidaiKargatuDB(ag);

		assertNotNull(bidaiak);

	}

}