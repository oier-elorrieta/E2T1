package JUnitTest;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Agentzia;
import modelo.Aireportu;
import modelo.Bidai;
import modelo.Ekitaldi;
import modelo.Hiria;

public class pojotest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	
	
	//AGENTZIA------------------------------------------------------------
	@Test
	public void getTestAgizn() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("Javi", ag.getIzena());
	}
	
	@Test
	public void getTestAglogo() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("foto", ag.getLogo());
	}
	

	
	@Test
	public void getTestAgkolor() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("#FFFFFF", ag.getMarkakolore());
	}
	

	
	@Test
	public void getTestAglangkop() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("L1", ag.getLangkop());
	}
	

	
	@Test
	public void getTestAgmota() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("A1", ag.getAgmota());
	}
	

	
	@Test
	public void getTestAgerabil() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("aa", ag.getErabiltzaile());
	}

	
	@Test
	public void getTestAgpasahitz() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		assertEquals("bb", ag.getPasahitz());
	}

	@Test
	public void setTestAgkod() {
		Agentzia ag = new Agentzia();
		ag.setKodea(12);
		assertEquals(12, ag.getKodea());
	}

	@Test
	public void setTestAgizn() {
		Agentzia ag = new Agentzia();
		ag.setIzena("Javi");
		assertEquals("Javi", ag.getIzena());
	}
	
	@Test
	public void setTestAglogo() {
		Agentzia ag = new Agentzia();
		ag.setLogo("foto");
		assertEquals("foto", ag.getLogo());
	}
	
	@Test
	public void setTestAgkolore() {
		Agentzia ag = new Agentzia();
		ag.setMarkakolore("#FFFFFF");
		assertEquals("#FFFFFF", ag.getMarkakolore());
	}
	
	@Test
	public void setTestAglangkop() {
		Agentzia ag = new Agentzia();
		ag.setLangkop("L1");
		assertEquals("L1", ag.getLangkop());
	}
	
	@Test
	public void setTestAgmota() {
		Agentzia ag = new Agentzia();
		ag.setAgmota("A1");
		assertEquals("A1", ag.getAgmota());
	}
	
	@Test
	public void setTestAgerabil() {
		Agentzia ag = new Agentzia();
		ag.setErabiltzaile("aa");
		assertEquals("aa", ag.getErabiltzaile());
	}
	
	@Test
	public void setTestAgpasahitz() {
		Agentzia ag = new Agentzia();
		ag.setPasahitz("bb");
		assertEquals("bb", ag.getPasahitz());
	}
	
	@Test
	public void sartubidTestAg() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		Agentzia ag = new Agentzia();
		ag.sartuBidaia(bid);
		Bidai[] bidarray = new Bidai[] {bid};
		assertArrayEquals(bidarray, ag.getBidaiak().toArray());
	}
	
	@Test
	public void setbidaiTestAg() {
		Agentzia ag = new Agentzia();
		ArrayList<Bidai> bidaiak = new ArrayList();
		ag.setBidaiak(bidaiak);
		assertArrayEquals(bidaiak.toArray() , ag.getBidaiak().toArray());
	}
	
	
	
	@Test
	public void toStringTestAg() {
		Agentzia ag = new Agentzia("Javi", "foto", "#FFFFFF", "L1", "A1", "aa", "bb");
		int agkode = ag.getKodea();
		String izena = ag.getIzena();
		String logo = ag.getLogo();
		String markakolore = ag.getMarkakolore();
		String langkop= ag.getLangkop();
		String agmota = ag.getAgmota();
		
		assertEquals("Agentzia [kodea=" + agkode + ", izena=" + izena + ", logo=" + logo + ", markakolore=" + markakolore
				+ ", langkop=" + langkop + ", agmota=" + agmota + "]", ag.toString());
	}
	
	
	//AIREPORTUA----------------------------------------------------------
	
	@Test
	public void getTestAir() {
		Aireportu air = new Aireportu(1, "Bilbao");
		assertEquals("Bilbao", air.getHiria());
	}

	@Test
	public void setTestAirkod() {
		Aireportu air = new Aireportu();
		air.setAireportu_kod(21);
		assertEquals(21, air.getAireportu_kod());
	}
	
	@Test
	public void setTestAirhiri() {
		Aireportu air = new Aireportu();
		air.setHiria("Bilbao");
		assertEquals("Bilbao", air.getHiria());
	}
	
	@Test
	public void toStringTestAir() {
		Aireportu air = new Aireportu(0, "Bilbao");	
		int aireportukod = air.getAireportu_kod();
		String hiria = air.getHiria();
		
		
		assertEquals("Aireportu [aireportu_kod=" + aireportukod + ", hiria=" + hiria + "]", air.toString());
	}
	
	//BIDAI-------------------------------------------------------------------
	
	@Test
	public void getTestBidizn() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		assertEquals("a", bid.getIzena());
	}

	@Test
	public void setTestBidizn() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setIzena("b");
		assertEquals("b", bid.getIzena());
	}
	
	@Test
	public void toStringTestBid() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		assertEquals("Bidaia [kode=" + 1 + ", izena=" + "a" + ", agkode=" + 2 + ", desk=" + "desk" + ", bidmota="
				+ "mota" + ", hdata=" + "" + ", adata=" + "" + ", iraupena=" + 0 + ", helmugakode="
				+ "" + "]", bid.toString());
	}
	
	@Test
	public void sartuekiTestBid() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		Ekitaldi eki = new Ekitaldi(0, "a", 0, "", "", "", 0, "", "", 0);
		bid.sartuEkitaldia(eki);
		Ekitaldi[] ekiarray = new Ekitaldi[] {eki};
		assertArrayEquals(ekiarray, bid.getEkitaldiak().toArray());
	}
	
	
	@Test
	public void setTestBidkod() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setKode(5);
		assertEquals(5, bid.getKode());
	}
	
	@Test
	public void setTestBidzerbez() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setZerbez("zerbez");
		assertEquals("zerbez", bid.getZerbez());
	}
	
	@Test
	public void setTestBidhasidt() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setHasidata("1");
		assertEquals("1", bid.getHasidata());
	}
	
	@Test
	public void setTestBidhamaidt() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setAmaidata("1");
		assertEquals("1", bid.getAmaidata());
	}
	
	
	@Test
	public void setTestBidherri() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setHerrihelmuga("1");
		assertEquals("1", bid.getHerrihelmuga());
	}
	
	@Test
	public void setTestBidagkod() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setAgkode(33);
		assertEquals(33, bid.getAgkode());
	}
	
	@Test
	public void setTestBiddesk() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setDesk("desk");
		assertEquals("desk", bid.getDesk());
	}
	
	@Test
	public void setTestBidmota() {
		Bidai bid = new Bidai( "a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setBidmota("M2");
		assertEquals("M2", bid.getBidmota());
	}
	
	//borrar set get de helmugaKODE  iraupena  adata hdata
	
	
	
	
	
	
	
	
	
	//EKITALDI---------------------------------------------------------------------------
	
	
	
	@Test
	public void setTestEkikod() {
		Ekitaldi eki = new Ekitaldi(0, "", "", 0, "", "", "", 0, "", "", 0, 0, "", "", "", 0, 0, 0, "", "");
		eki.setEkikode(2);
		assertEquals(2, eki.getEkikode());
	}
	
	@Test
	public void setTestEkiizn() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setIzena("a");
		assertEquals("a", eki.getIzena());
	}
	
	@Test
	public void setTestEkibidkod() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBidaikode("a");
		assertEquals("a", eki.getBidaikode());
	}
	
	@Test
	public void setTestEkihotizn() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setHotizena("a");
		assertEquals("a", eki.getHotizena());
	}
	
	@Test
	public void setTestEkihiri() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setHiria("a");
		assertEquals("a", eki.getHiria());
	}
	
	@Test
	public void setTestEkiosprezio() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setOsprezio(1.1);
		assertEquals(1.1, eki.getOsprezio(), 2);
	}
	
	@Test
	public void setTestEkiossardt() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setOssardata("a");
		assertEquals("a", eki.getOssardata());
	}
	
	@Test
	public void setTestEkiosirtdt() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setOsirtdata("a");
		assertEquals("a", eki.getOsirtdata());
	}
	
	@Test
	public void setTestEkilogela() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setLogelamotakod("a");
		assertEquals("a", eki.getLogelamotakod());
	}
	
	@Test
	public void setTestEkijardesk() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
		eki.setJardesk("a");
		assertEquals("a", eki.getJardesk());
	}
	
	
	@Test
	public void setTestEkijardata() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
		eki.setJardata("a");
		assertEquals("a", eki.getJardata());
	}
	@Test
	public void setTestEkijarprezio() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setJarprezio(1.1);
		assertEquals(1.1, eki.getJarprezio(), 2);
	}
	
	@Test
	public void setTestEkihkod() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setHkode(1);
		assertEquals(1, eki.getHkode());
	}
	
	@Test
	public void setTestEkiaire() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setAirelinea("a");
		assertEquals("a", eki.getAirelinea());
	}
	
	@Test
	public void setTestEkijatair() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setJatairportkod("a");
		assertEquals("a", eki.getJatairportkod());
	}
	
	@Test
	public void setTestEkihelair() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setHelairportkod("a");
		assertEquals("a", eki.getHelairportkod());
	}
	@Test
	public void setTestEkiiraupena() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setIraupena(1.1);
		assertEquals(1.1, eki.getIraupena(), 2);
	}
	
	
	@Test
	public void setTestEkiirtordu() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setIrtordu("a");
		assertEquals("a", eki.getIrtordu());
	}
	
	@Test
	public void setTestEkiirtdata() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setIrtdata("a");
		assertEquals("a", eki.getIrtdata());
	}
	
	@Test
	public void setTestEkihprezio() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setHprezio(1.1);
		assertEquals(1.1, eki.getHprezio(), 2);
	}
	@Test
	public void setTestEkibkod() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBkode(1);
		assertEquals(1, eki.getBkode());
	}
	
	
	@Test
	public void setTestEkibaire() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBairelinea("a");
		assertEquals("a", eki.getBairelinea());
	}
	
	@Test
	public void setTestEkibhasiair() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBhasiairportkod("a");
		assertEquals("a", eki.getBhasiairportkod());
	}
	
	@Test
	public void setTestEkibamaiair() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBamaiairportkod("a");
		assertEquals("a", eki.getBamaiairportkod());
	}
	
	@Test
	public void setTestEkibprezio() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBprezio(1.1);
		assertEquals(1.1, eki.getBprezio(), 2);
	}
	
	@Test
	public void setTestEkibiraupena() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBiraupena(1.1);
		assertEquals(1.1, eki.getBiraupena(), 2);
	}
	
	@Test
	public void setTestEkibirtordu() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBirtordu("a");
		assertEquals("a", eki.getBirtordu());
	}
	
	@Test
	public void setTestEkibirtdata() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		eki.setBirtdata("a");
		assertEquals("a", eki.getBirtdata());
		
	}
	
	@Test
	public void toStringTestEkiOst() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
		
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", hotizena="
				+ "" + ", hiria=" + "" + ", osprezio=" + 0.0 + ", ossardata=" + "" + ", osirtdata="
				+ "" + "]", eki.toStringOstatua());
	}
	
	
	
	@Test
	public void toStringTestEkiJar() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", jardesk=" + ""
				+ ", jardata=" + "" + ", jarprezio=" + 0.0 + "]", eki.toStringJarduera());
	}
	@Test
	public void toStringTestEkiJoan() {
		Ekitaldi eki = new Ekitaldi(0, "", 0, "", "", "", 0, "", "", 0);
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + null + ", hkode=" + 0
				+ ", airelinea=" + "" + ", jatairportkod=" + "" + ", helairportkod=" + ""
				+ ", iraupena=" + 0.0 + ", irtordu=" + "" + ", irtdata=" + "" + ", hprezio=" + 0.0
				+ "]", eki.toStringJoan());
	}
	
	@Test
	public void toStringTestEkiJoanEtorri() {
		Ekitaldi eki = new Ekitaldi(0, "", "", 0, "", "", "", 0, "", "", 0, 0, "", "", "", 0, 0, 0, "", "");
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", hkode=" + 0
				+ ", airelinea=" + "" + ", jatairportkod=" + "" + ", helairportkod=" + ""
				+ ", iraupena=" + 0.0 + ", irtordu=" + "" + ", irtdata=" + "" + ", hprezio=" + 0.0
				+ ", bkode=" + 0 + ", bairelinea=" + "" + ", bhasiairportkod=" + ""
				+ ", bamaiairportkod=" + "" + ", bprezio=" + 0.0 + ", preziototala=" + 0.0
				+ ", biraupena=" + 0.0 + ", birtordu=" + "" + ", birtdata=" + "" + "]", eki.toStringJoanEtorri());
	}


	
	
	//HERRIALDE--------------------------------------------------------------------------
	
	//ALDATU OBJEKTUA
	
	
	//HIRIA-------------------------------------------------------------------------------
	
	@Test
	public void setTestHiriizn() {
		Hiria hi = new Hiria(1, "a");
		hi.setIzena("b");
		assertEquals("b", hi.getIzena());
	}
	
	@Test
	public void setTestHirikod() {
		Hiria hi = new Hiria(1, "a");
		hi.setKode(2);
		assertEquals(2, hi.getKode());
	}	
		@Test
		public void toStringTestHiri() {
			Hiria hi = new Hiria(1, "a");
			assertEquals("Hiria [kode=" + 1 + ", izena=" + "a" + "]", hi.toString());
		
	}
	
}
