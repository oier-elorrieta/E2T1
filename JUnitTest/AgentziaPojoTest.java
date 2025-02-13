package JUnitTest;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import modelo.Agentzia;
import modelo.Bidai;
public class AgentziaPojoTest {
	private static Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
	@Test
	public void testConstructorParametrosNull() {
		Agentzia ag = new Agentzia();
		assertEquals(0, ag.getKodea(), "El valor de agkode debería ser 0");
		assertEquals("", ag.getIzena(), "El valor de izena debería ser una cadena vacía");
		assertEquals("", ag.getLogo(), "El valor de logo debería ser una cadena vacía");
		assertEquals("", ag.getMarkakolore(), "El valor de markakolore debería ser una cadena vacía");
		assertEquals("", ag.getLangkop(), "El valor de langkop debería ser una cadena vacía");
		assertEquals("", ag.getAgmota(), "El valor de agmota debería ser una cadena vacía");
		assertEquals("", ag.getErabiltzaile(), "El valor de erabiltzaile debería ser una cadena vacía");
		assertEquals("", ag.getPasahitz(), "El valor de pasahitz debería ser una cadena vacía");
	}
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
		assertEquals(izena, ag.getIzena(), "El valor de izena debería ser 'Agencia A'");
		assertEquals(logo, ag.getLogo(), "El valor de logo debería ser 'Logo A'");
		assertEquals(markakolore, ag.getMarkakolore(), "El valor de markakolore debería ser 'Rojo'");
		assertEquals(langkop, ag.getLangkop(), "El valor de langkop debería ser 'ES'");
		assertEquals(agmota, ag.getAgmota(), "El valor de agmota debería ser 'Tipo A'");
		assertEquals(erabiltzaile, ag.getErabiltzaile(), "El valor de erabiltzaile debería ser 'userA'");
		assertEquals(pasahitz, ag.getPasahitz(), "El valor de pasahitz debería ser 'passwordA'");
	}
	
	@Test
	public void setTestSelectedindx() {
		ag.setSelectedindx(1);
		assertEquals(1, ag.getSelectedindx());
	}
	
	@Test
	public void setTestAgkod() {
		ag.setKodea(12);
		assertEquals(12, ag.getKodea());
	}
	@Test
	public void setTestAgizn() {
		ag.setIzena("Javi");
		assertEquals("Javi", ag.getIzena());
	}
	@Test
	public void setTestAglogo() {
		ag.setLogo("foto");
		assertEquals("foto", ag.getLogo());
	}
	@Test
	public void setTestAgkolore() {
		ag.setMarkakolore("#FFFFFF");
		assertEquals("#FFFFFF", ag.getMarkakolore());
	}
	@Test
	public void setTestAglangkop() {
		ag.setLangkop("L1");
		assertEquals("L1", ag.getLangkop());
	}
	@Test
	public void setTestAgmota() {
		ag.setAgmota("A1");
		assertEquals("A1", ag.getAgmota());
	}
	@Test
	public void setTestAgerabil() {
		ag.setErabiltzaile("aa");
		assertEquals("aa", ag.getErabiltzaile());
	}
	@Test
	public void setTestAgpasahitz() {
		ag.setPasahitz("bb");
		assertEquals("bb", ag.getPasahitz());
	}
	@Test
	public void sartubidTestAg() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		ag.sartuBidaia(bid);
		Bidai[] bidarray = new Bidai[] { bid };
		assertArrayEquals(bidarray, ag.getBidaiak().toArray());
	}
	@Test
	public void setbidaiTestAg() {
		ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();
		ag.setBidaiak(bidaiak);
		assertArrayEquals(bidaiak.toArray(), ag.getBidaiak().toArray());
	}
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
