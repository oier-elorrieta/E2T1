package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Dao {

	package JUnitTest;

	import static org.junit.jupiter.api.Assertions.;

	import java.util.ArrayList;

	import org.junit.jupiter.api.Test;

	import controlador.metodoak;
	import modelo.Agentzia;
	import modelo.Bidai;
	import modelo.Ekitaldi;

	class DaoTests {

	    
	     
	@Test
	void saioaKonprobatuTTest() { // error true == Txarto
	assertTrue(metodoak.saioaKonprobatu("asda", "qwea")); 
	}

	 
	     
	@Test 
	void saioaKonprobatuFTest() { // error false == Ondo
	assertFalse(metodoak.saioaKonprobatu("aa", "aa")); 
	}

	
	     
	@Test 
	void agentziaBerriTTest() { Agentzia ag = new Agentzia("Javi", "foto",
	"#FFFFFF", "L1", "A1", "xx", "zz"); metodoak.agentziaberri(ag);
	assertFalse(metodoak.saioaKonprobatu("xx", "zz")); 
	}

	  
	     
	@Test 
	void agentziaBerriFTest() { Agentzia ag = new Agentzia("Javi", "foto",
	"#FFFFFF", "L1", "A1", "qweqwe", "qweqwe"); metodoak.agentziaberri(ag);
	assertTrue(metodoak.saioaKonprobatu("kk", "kk")); 
	}
	
	@Test 
	void langKopAgentziBilatuTTest() {
	assertEquals(metodoak.langKopAgentziBilatu(1), "L1"); 
	}

	
	@Test void agentziaMotaBilatuTTest() {
	assertEquals(metodoak.agentziaMotaBilatu(1), "A1"); }

	    
	     
	@Test void koloreaHartuTest() { Agentzia ag = new Agentzia("Javi", "foto",
	"#FFFFFF", "L1", "A1", "qweqwe", "qweqwe");
	assertEquals(metodoak.koloreaHartu(ag), "#FFFFFF"); 
	}

	    
	    

	    @Test
	    void bidaiKargatuBDTest() {
	        Agentzia ag = new Agentzia("TestAgKargatu", "foto", "#FFFFFF", "L1", "A1", "test", "test");
	        ag.setKodea(14);
	        Bidai b1 = new Bidai(1, "b1test", 1, "test bidaia", "zerbez", "testmota", "hasidata", "amaidata", "helmuga");
	        ArrayList<Bidai> bidaia = new ArrayList();
	        bidaia.add(b1);
	        assertEquals(metodoak.bidaiKargatuDB(ag), bidaia);
	    }

	    @Test
	    void agentziaKargatuBDTest() {
	        Agentzia ag = new Agentzia("TestAgKargatu", "foto", "#FFFFFF", "L1", "A1", "test", "test");
	        metodoak.agentziaberri(ag);
	        assertEquals(metodoak.agentziaKargatuBD("test", "test"), ag);
	    }

	}

