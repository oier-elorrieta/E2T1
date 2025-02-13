package JUnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Bidai;

import modelo.Ekitaldi;

public class BidaiPojoTest {

	// Testa Bidai klasearen iraupena atributuaren lortutako balioa

	// Test honetan, "Bidai" objektu bat sortzen dugu eta iraupenean 1 ezartzen
	// dugu.

	// Ondoren, egiaztatzen dugu, "getIraupena" metodoak 1 balioa itzultzen duela.

	@Test

	public void getTestsiraupena() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setIraupena(1);

		assertEquals(1, bid.getIraupena());

	}

	// Testa Ekitaldi array bat ezartzen eta lortzen

	// Test honetan, "Bidai" objektu bat sortzen dugu eta "Ekitaldi" array bat
	// ezartzen diogu.

	// Ondoren, egiaztatzen dugu, "getEkitaldiak" metodoak array horren antzeko
	// balioa itzultzen duela.

	@Test

	public void getTestsetarray() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		ArrayList<Ekitaldi> array = new ArrayList<Ekitaldi>();

		bid.setEkitaldiak(array);

		assertArrayEquals(array.toArray(), bid.getEkitaldiak().toArray());

	}

	// Testa Bidaiaren selektatutako indizea lortzeko

	// Test honetan, "Bidai" objektu batean selektatutako indize bat ezartzen da eta

	// "getSelectedindx" metodoak balio hori itzultzen duela egiaztatzen dugu.

	@Test

	public void getTestslctindx() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setSelectedindx(1);

		assertEquals(1, bid.getSelectedindx());

	}

	// Testa Bidaiaren izena lortzeko

	// "Bidai" objektu bat sortzen dugu eta bere izena lortzen dugu.

	// Ondoren, egiaztatzen dugu, "getIzena" metodoak "a" balioa itzultzen duela.

	@Test

	public void getTestBidizn() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		assertEquals("a", bid.getIzena());

	}

	// Testa Bidaiaren izena aldatzeko

	// Test honetan, "Bidai" objektu baten izena aldatzen dugu eta egiaztatzen dugu,

	// "setIzena" metodoak izena egoki aldatzen duela.

	@Test

	public void setTestBidizn() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setIzena("b");

		assertEquals("b", bid.getIzena());

	}

	// Testa Bidaiaren toString metodoaren funtzionamendua

	// Test honetan, "Bidai" objektu bat sortzen da eta "toString" metodoak
	// itzultzen duen

	// string-a egiaztatzen da, espero den balioarekin alderatuz.

	@Test

	public void toStringTestBid() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		assertEquals(

				"Bidaia [kode=" + 1 + ", izena=" + "a" + ", agkode=" + 2 + ", desk=" + "desk" + ", bidmota=" + "mota"

						+ ", hdata=" + "" + ", adata=" + "" + ", iraupena=" + 0 + ", helmugakode=" + "" + "]",

				bid.toString());

	}

	// Testa Ekitaldi bat Bidaiara sartzeko

	// Test honetan, "Ekitaldi" objektu bat sortzen da eta "Bidai" objektu batetik

	// "sartuEkitaldia" metodoarekin sartzen da. Ondoren, egiaztatzen dugu,
	// ekitaldiaren array-a

	// egokia dela, sartutako ekitaldia barne duela.

	@Test

	public void sartuekiTestBid() {

		Bidai bid = new Bidai(1, "a", 2, "desk", "zerbez", "mota", "", "", "");

		Ekitaldi eki = new Ekitaldi(0, "a", null, "", "", 0);

		bid.sartuEkitaldia(eki);

		Ekitaldi[] ekiarray = new Ekitaldi[] { eki };

		assertArrayEquals(ekiarray, bid.getEkitaldiak().toArray());

	}

	// Testa Bidaiaren kodea aldatzeko

	// "Bidai" objektu batean kodea aldatzen dugu eta egiaztatzen dugu,

	// "setKode" metodoak aldaketa egoki aplikatzen duela.

	@Test

	public void setTestBidkod() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setKode(5);

		assertEquals(5, bid.getKode());

	}

	// Testa Bidaiaren zerbez atributua aldatzeko

	// Test honetan, "Bidai" objektu batean "zerbez" atributua aldatzen da

	// eta egiaztatzen dugu "setZerbez" metodoak egoki aldatu duela.

	@Test

	public void setTestBidzerbez() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setZerbez("zerbez");

		assertEquals("zerbez", bid.getZerbez());

	}

	// Testa Bidaiaren hasiera data aldatzeko

	// "Bidai" objektu batean hasiera data aldatzen da eta egiaztatzen da

	// "setHasidata" metodoak aldaketa ondo aplikatu duela.

	@Test

	public void setTestBidhasidt() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setHasidata("1");

		assertEquals("1", bid.getHasidata());

	}

	// Testa Bidaiaren amaiera data aldatzeko

	// "Bidai" objektu batean amaiera data aldatzen da eta egiaztatzen da

	// "setAmaidata" metodoak aldaketa ondo aplikatu duela.

	@Test

	public void setTestBidhamaidt() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setAmaidata("1");

		assertEquals("1", bid.getAmaidata());

	}

	// Testa Bidaiaren helmuga herriaren kodea aldatzeko

	// "Bidai" objektu batean helmuga herriaren kodea aldatzen da eta egiaztatzen da

	// "setHerrihelmuga" metodoak aldaketa egoki aplikatzen duela.

	@Test

	public void setTestBidherri() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setHerrihelmuga("1");

		assertEquals("1", bid.getHerrihelmuga());

	}

	// Testa Bidaiaren agkode atributua aldatzeko

	// "Bidai" objektu batean agkodea aldatzen da eta egiaztatzen da

	// "setAgkode" metodoak aldaketa egoki aplikatzen duela.

	@Test

	public void setTestBidagkod() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setAgkode(33);

		assertEquals(33, bid.getAgkode());

	}

	// Testa Bidaiaren desk atributua aldatzeko

	// "Bidai" objektu batean desk atributua aldatzen da eta egiaztatzen da

	// "setDesk" metodoak aldaketa egoki aplikatzen duela.

	@Test

	public void setTestBiddesk() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setDesk("desk");

		assertEquals("desk", bid.getDesk());

	}

	// Testa Bidaiaren bidmota atributua aldatzeko

	// "Bidai" objektu batean bidmota atributua aldatzen da eta egiaztatzen da

	// "setBidmota" metodoak aldaketa egoki aplikatzen duela.

	@Test

	public void setTestBidmota() {

		Bidai bid = new Bidai("a", 2, "desk", "zerbez", "mota", "", "", "");

		bid.setBidmota("M2");

		assertEquals("M2", bid.getBidmota());

	}

}
