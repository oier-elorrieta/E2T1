package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Hiria;

public class HiriaPojoTest {

	// HIRIA-------------------------------------------------------------------------------

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
