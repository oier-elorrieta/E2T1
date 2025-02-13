package JUnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Aireportu;

public class AireportuPojoTest {

	// Objektu Aireportua sortu parametroekin eta konprobatzen du kontstruktorea
	// funtzionatzen badu.
	@Test
	public void getTestAir() {
		Aireportu air = new Aireportu("1", "Bilbao");
		assertEquals("Bilbao", air.getHiria());
	}

	// Objektu Aireportua sortu parametrorik gabe, konprobatzen du kontstruktorea
	// funtzionatzen badu, eta setterrarekin kode bat sartzen du, getter erabiltzean
	// konprobatzen du setterra funtzionatzen duela.
	@Test
	public void setTestAirkod() {
		Aireportu air = new Aireportu();
		air.setAireportu_kod("a");
		assertEquals("a", air.getAireportu_kod());
	}
	// Objektu Aireportua sortu parametrorik gabe, konprobatzen du kontstruktorea
	// funtzionatzen badu, eta setterrarekin hiri bat sartzen du, getter erabiltzean
	// konprobatzen du setterra funtzionatzen duela.

	@Test
	public void setTestAirhiri() {
		Aireportu air = new Aireportu();
		air.setHiria("Bilbao");
		assertEquals("Bilbao", air.getHiria());
	}

	// Objektu Aireportua sortu parametroekin eta konprobatzen du toString
	// funtzionatzen badu.

	@Test
	public void toStringTestAir() {
		Aireportu air = new Aireportu("a", "Bilbao");
		String aireportukod = air.getAireportu_kod();
		String hiria = air.getHiria();
		assertEquals("Aireportu [aireportu_kod=" + aireportukod + ", hiria=" + hiria + "]", air.toString());
	}
}
