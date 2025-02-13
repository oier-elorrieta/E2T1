package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Hiria;

public class HiriaPojoTest {

	// HIRIA-------------------------------------------------------------------------------

	// Testa Hiria objektuaren izena aldatzeko

	// "Hiria" objektu bat sortzen da eta bere izena "b" izenera aldatzen da.

	// Ondoren, egiaztatzen da "setIzena" metodoak egoki aldatu duela izena.

	@Test

	public void setTestHiriizn() {

		Hiria hi = new Hiria(1, "a"); // Hiria objektu bat sortzen da "a" izenarekin

		hi.setIzena("b"); // Izen berri bat ezartzen da ("b")

		assertEquals("b", hi.getIzena()); // Egiaztatzen da izena "b" den

	}

	// Testa Hiria objektuaren kodea aldatzeko

	// "Hiria" objektu bat sortzen da eta bere kodea 2 ezartzen da.

	// Ondoren, egiaztatzen da "setKode" metodoak egoki aldatu duela kodea.

	@Test

	public void setTestHirikod() {

		Hiria hi = new Hiria(1, "a"); // Hiria objektu bat sortzen da "a" izenarekin

		hi.setKode(2); // Kodea 2 ezartzen da

		assertEquals(2, hi.getKode()); // Egiaztatzen da kodea 2 den

	}

	// Testa Hiria objektuaren toString metodoaren funtzionamendua

	// "Hiria" objektu bat sortzen da eta "toString" metodoak itzultzen duen
	// string-a

	// egiaztatzen da, espero den balioarekin alderatuz.

	@Test

	public void toStringTestHiri() {

		Hiria hi = new Hiria(1, "a"); // Hiria objektu bat sortzen da "a" izenarekin

		assertEquals("Hiria [kode=" + 1 + ", izena=" + "a" + "]", hi.toString()); // Egiaztatzen da "toString" metodoak

		// espero den string-a itzultzen duela

	}

}