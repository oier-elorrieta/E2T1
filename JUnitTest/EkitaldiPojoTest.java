package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Ekitaldi;

public class EkitaldiPojoTest {

	// EKITALDI---------------------------------------------------------------------------

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

		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", hotizena=" + "" + ", hiria="
				+ "" + ", osprezio=" + 0.0 + ", ossardata=" + "" + ", osirtdata=" + "" + "]", eki.toStringOstatua());
	}

	@Test
	public void toStringTestEkiJar() {
		Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", jardesk=" + "" + ", jardata="
				+ "" + ", jarprezio=" + 0.0 + "]", eki.toStringJarduera());
	}

	@Test
	public void toStringTestEkiJoan() {
		Ekitaldi eki = new Ekitaldi(0, "", null, 0, "", "", "", 0, "", "", 0);
		assertEquals("Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + null + ", hkode=" + 0
				+ ", airelinea=" + "" + ", jatairportkod=" + "" + ", helairportkod=" + "" + ", iraupena=" + 0.0
				+ ", irtordu=" + "" + ", irtdata=" + "" + ", hprezio=" + 0.0 + "]", eki.toStringJoan());
	}

	@Test
	public void toStringTestEkiJoanEtorri() {
		Ekitaldi eki = new Ekitaldi(0, "", "", 0, "", "", "", 0, "", "", 0, 0, "", "", "", 0, 0, 0, "", "");
		
		assertEquals(
				"Ekitaldi [ekikode=" + 0 + ", izena=" + "" + ", bidaikode=" + "" + ", hkode=" + 0 + ", airelinea=" + ""
						+ ", jatairportkod=" + "" + ", helairportkod=" + "" + ", iraupena=" + 0.0 + ", irtordu=" + ""
						+ ", irtdata=" + "" + ", hprezio=" + 0.0 + ", bkode=" + 0 + ", bairelinea=" + ""
						+ ", bhasiairportkod=" + "" + ", bamaiairportkod=" + "" + ", bprezio=" + 0.0 + ", preziototala="
						+ 0.0 + ", biraupena=" + 0.0 + ", birtordu=" + "" + ", birtdata=" + "" + "]",
				eki.toStringJoanEtorri());
	}

}
