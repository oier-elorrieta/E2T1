package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import modelo.Bidai;
import modelo.Ekitaldi;

public class BidaiPojoTest {

	// BIDAI-------------------------------------------------------------------

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
		assertEquals(
				"Bidaia [kode=" + 1 + ", izena=" + "a" + ", agkode=" + 2 + ", desk=" + "desk" + ", bidmota=" + "mota"
						+ ", hdata=" + "" + ", adata=" + "" + ", iraupena=" + 0 + ", helmugakode=" + "" + "]",
				bid.toString());
	}

	@Test
	public void sartuekiTestBid() {
		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");
		Ekitaldi eki = new Ekitaldi(0, "a", null, 0, "", "", "", 0, "", "", 0);
		bid.sartuEkitaldia(eki);
		Ekitaldi[] ekiarray = new Ekitaldi[] { eki };
		assertArrayEquals(ekiarray, bid.getEkitaldiak().toArray());
	}

	@Test
	public void setTestBidkod() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setKode(5);
		assertEquals(5, bid.getKode());
	}

	@Test
	public void setTestBidzerbez() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setZerbez("zerbez");
		assertEquals("zerbez", bid.getZerbez());
	}

	@Test
	public void setTestBidhasidt() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setHasidata("1");
		assertEquals("1", bid.getHasidata());
	}

	@Test
	public void setTestBidhamaidt() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setAmaidata("1");
		assertEquals("1", bid.getAmaidata());
	}

	@Test
	public void setTestBidherri() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setHerrihelmuga("1");
		assertEquals("1", bid.getHerrihelmuga());
	}

	@Test
	public void setTestBidagkod() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setAgkode(33);
		assertEquals(33, bid.getAgkode());
	}

	@Test
	public void setTestBiddesk() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setDesk("desk");
		assertEquals("desk", bid.getDesk());
	}

	@Test
	public void setTestBidmota() {
		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");
		bid.setBidmota("M2");
		assertEquals("M2", bid.getBidmota());
	}
}