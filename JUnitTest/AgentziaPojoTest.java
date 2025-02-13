package JUnitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import modelo.Agentzia;
import modelo.Bidai;

public class AgentziaPojoTest {
	private static Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");

	// Agentzia objektuaren eraikitzaileetako bat hutsik dago horregatik ez zaio
	// parametrorik pasatzen; beraz, datu guztiak eraikitzailean hutsik daudela
	// ziurtatzen dugu.
	@Test
	public void testConstructorParametrosNull() {
		Agentzia ag = new Agentzia();
		assertEquals(0, ag.getKodea());
		assertEquals("", ag.getIzena());
		assertEquals("", ag.getLogo());
		assertEquals("", ag.getMarkakolore());
		assertEquals("", ag.getLangkop());
		assertEquals("", ag.getAgmota());
		assertEquals("", ag.getErabiltzaile());
		assertEquals("", ag.getPasahitz());
	}

	// beste eraikitzailea parametroak sartu behar dira, agentzia motako objektu bat
	// sortzen dugu eta adierazi ditugun datuak parametrotzat hartzen ditugu.
	// Adierazi dugun objektuari, erantsitako datuak direla egiaztatzen dugu.
	@Test
	public void testConstructorConParametros() {
		String izena = "Agentzia_froga1";
		String logo = "Logo";
		String markakolore = "Gorria";
		String langkop = "L1";
		String agmota = "A1";
		String erabiltzaile = "userA";
		String pasahitz = "password";
		Agentzia ag = new Agentzia(izena, logo, markakolore, langkop, agmota, erabiltzaile, pasahitz);
		assertEquals(izena, ag.getIzena());
		assertEquals(logo, ag.getLogo());
		assertEquals(markakolore, ag.getMarkakolore());
		assertEquals(langkop, ag.getLangkop());
		assertEquals(agmota, ag.getAgmota());
		assertEquals(erabiltzaile, ag.getErabiltzaile());
		assertEquals(pasahitz, ag.getPasahitz());
	}

	// selectedIndex atributuari balio bat esleitzen diogu, eta, behar bezala gehitu
	// dela egiaztatzeko, haren balioa berreskuratzen dugu atributu bereko
	// getter-ekin.
	@Test
	public void setTestSelectedindx() {
		ag.setSelectedindx(1);
		assertEquals(1, ag.getSelectedindx());
	}

	//
	@Test
	public void setTestAgkod() {
		ag.setKodea(12);
		assertEquals(12, ag.getKodea());
	}

	// izena atributuari balio bat txartatzen diogu eta konprobatzeko ondo txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAgizn() {
		ag.setIzena("Javi");
		assertEquals("Javi", ag.getIzena());
	}

	// logo atributuari balio bat txartatzen diogu eta konprobatzeko ondo txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAglogo() {
		ag.setLogo("foto");
		assertEquals("foto", ag.getLogo());
	}

	// kolorea atributuari balio bat txartatzen diogu eta konprobatzeko ondo
	// txertatu dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAgkolore() {
		ag.setMarkakolore("#FFFFFF");
		assertEquals("#FFFFFF", ag.getMarkakolore());
	}

	// langile kopurua atributuari balio bat txartatzen diogu eta konprobatzeko ondo
	// txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAglangkop() {
		ag.setLangkop("L1");
		assertEquals("L1", ag.getLangkop());
	}

	// agentzia mota atributuari balio bat txartatzen diogu eta konprobatzeko ondo
	// txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAgmota() {
		ag.setAgmota("A1");
		assertEquals("A1", ag.getAgmota());
	}

	// erabiltzailea atributuari balio bat txartatzen diogu eta konprobatzeko ondo
	// txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAgerabil() {
		ag.setErabiltzaile("aa");
		assertEquals("aa", ag.getErabiltzaile());
	}

	// pasahitza atributuari balio bat txartatzen diogu eta konprobatzeko ondo
	// txertatu
	// dela berrezkuratuko dugu balioa get funtzioarekin.
	@Test
	public void setTestAgpasahitz() {
		ag.setPasahitz("bb");
		assertEquals("bb", ag.getPasahitz());
	}

	// bidai objektu bat sortu eta datu basean txertatu. Bidai array bat sortu bidai
	// objektua jasotzeko. Orduan arraya eta agentziaren arraya konparatu
	@Test
	public void sartubidTestAg() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		ag.sartuBidaia(bid);
		Bidai[] bidarray = new Bidai[] { bid };
		assertArrayEquals(bidarray, ag.getBidaiak().toArray());
	}

	// Bidai ArrayList sortu agentzian txertatzeko eta arrayak konparatzeko.
	// ArrayList array batera bihurtu behar da arrayak konparatzeko
	@Test
	public void setbidaiTestAg() {
		ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();
		ag.setBidaiak(bidaiak);
		assertArrayEquals(bidaiak.toArray(), ag.getBidaiak().toArray());
	}

	// Biltzen ditugu sartutako datuak agentzian eta zihurtatzen dugu toString-ak
	// berdinak direla
	@Test
	public void toStringTestAg() {
		int agkode = ag.getKodea();
		String izena = ag.getIzena();
		String logo = ag.getLogo();
		String markakolore = ag.getMarkakolore();
		String langkop = ag.getLangkop();
		String agmota = ag.getAgmota();
		assertEquals("Agentzia [kodea=" + agkode + ", izena=" + izena + ", logo=" + logo + ", markakolore="
				+ markakolore + ", langkop=" + langkop + ", agmota=" + agmota + "]", ag.toString());
	}
}
