package JUnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import modelo.Agentzia;
import modelo.Bidai;




public class AgentziaPojoTest {

	private static Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
	
	

	

	
	//AGENTZIA------------------------------------------------------------
	@Test
	public void getTestAg() {
		assertEquals("Javi", ag.getIzena());
	}
	
	
	
	@Test
	public void getTestAgizn() {
	
		assertEquals("Javi", ag.getIzena());
	}
	
	@Test
	public void getTestAglogo() {
		assertEquals("foto", ag.getLogo());
	}
	

	
	@Test
	public void getTestAgkolor() {

		assertEquals("#FFFFFF", ag.getMarkakolore());
	}
	

	
	@Test
	public void getTestAglangkop() {

		assertEquals("L1", ag.getLangkop());
	}
	

	
	@Test
	public void getTestAgmota() {

		assertEquals("A1", ag.getAgmota());
	}
	

	
	@Test
	public void getTestAgerabil() {

		assertEquals("aa", ag.getErabiltzaile());
	}

	
	@Test
	public void getTestAgpasahitz() {
		assertEquals("bb", ag.getPasahitz());
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
		Bidai[] bidarray = new Bidai[] {bid};
		assertArrayEquals(bidarray, ag.getBidaiak().toArray());
	}
	
	@Test
	public void setbidaiTestAg() {
		ArrayList<Bidai> bidaiak = new ArrayList();
		ag.setBidaiak(bidaiak);
		assertArrayEquals(bidaiak.toArray() , ag.getBidaiak().toArray());
	}
	
	
	
	@Test
	public void toStringTestAg() {
		int agkode = ag.getKodea();
		String izena = ag.getIzena();
		String logo = ag.getLogo();
		String markakolore = ag.getMarkakolore();
		String langkop= ag.getLangkop();
		String agmota = ag.getAgmota();
		
		assertEquals("Agentzia [kodea=" + agkode + ", izena=" + izena + ", logo=" + logo + ", markakolore=" + markakolore
				+ ", langkop=" + langkop + ", agmota=" + agmota + "]", ag.toString());
	}
	
	
	

}
