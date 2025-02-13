package JUnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Ekitaldi;

public class EkitaldiPojoTest {
    
    @Test
    // Test hau Ekitaldi klaseko ekikodea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta ekikodea 2 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu ekikodea zuzena dela.
    public void setTestEkikod() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setEkikode(2);
        assertEquals(2, eki.getEkikode());
    }

    @Test
    // Test hau Ekitaldi klaseko izena ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta izena "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu izena zuzena dela.
    public void setTestEkiizn() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setIzena("a");
        assertEquals("a", eki.getIzena());
    }

    @Test
    // Test hau Ekitaldi klaseko bidaikodea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta bidaikodea "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu bidaikodea zuzena dela.
    public void setTestEkibidkod() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setBidaikode("a");
        assertEquals("a", eki.getBidaikode());
    }

    @Test
    // Test hau Ekitaldi klaseko hotizena ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta hotizena "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu hotizena zuzena dela.
    public void setTestEkihotizn() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setHotizena("a");
        assertEquals("a", eki.getHotizena());
    }

    @Test
    // Test hau Ekitaldi klaseko hiria ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta hiria "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu hiria zuzena dela.
    public void setTestEkihiri() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setHiria("a");
        assertEquals("a", eki.getHiria());
    }

    @Test
    // Test hau Ekitaldi klaseko osprezioa ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta osprezioa 1.1 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu osprezioa zuzena dela, tolerantziarekin.
    public void setTestEkiosprezio() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setOsprezio(1.1);
        assertEquals(1.1, eki.getOsprezio(), 2);
    }

    @Test
    // Test hau Ekitaldi klaseko ossardata ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta ossardata "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu ossardata zuzena dela.
    public void setTestEkiossardt() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setOssardata("a");
        assertEquals("a", eki.getOssardata());
    }

    @Test
    // Test hau Ekitaldi klaseko osirtdata ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta osirtdata "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu osirtdata zuzena dela.
    public void setTestEkiosirtdt() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setOsirtdata("a");
        assertEquals("a", eki.getOsirtdata());
    }

    @Test
    // Test hau Ekitaldi klaseko logelamotakod ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta logelamotakod "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu logelamotakod zuzena dela.
    public void setTestEkilogela() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setLogelamotakod("a");
        assertEquals("a", eki.getLogelamotakod());
    }

    @Test
    // Test hau Ekitaldi klaseko jardesk ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta jardesk "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu jardesk zuzena dela.
    public void setTestEkijardesk() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
        eki.setJardesk("a");
        assertEquals("a", eki.getJardesk());
    }

    @Test
    // Test hau Ekitaldi klaseko jardata ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta jardata "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu jardata zuzena dela.
    public void setTestEkijardata() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", "", 0);
        eki.setJardata("a");
        assertEquals("a", eki.getJardata());
    }

    @Test
    // Test hau Ekitaldi klaseko jarprezioa ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta jarprezioa 1.1 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu jarprezioa zuzena dela, tolerantziarekin.
    public void setTestEkijarprezio() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setJarprezio(1.1);
        assertEquals(1.1, eki.getJarprezio(), 2);
    }

    @Test
    // Test hau Ekitaldi klaseko hkodea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta hkodea "1" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu hkodea zuzena dela.
    public void setTestEkihkod() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setHkode("1");
        assertEquals("1", eki.getHkode());
    }

    @Test
    // Test hau Ekitaldi klaseko airelinea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta airelinea "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu airelinea zuzena dela.
    public void setTestEkiaire() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setAirelinea("a");
        assertEquals("a", eki.getAirelinea());
    }

    @Test
    // Test hau Ekitaldi klaseko jatairportkod ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta jatairportkod "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu jatairportkod zuzena dela.
    public void setTestEkijatair() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setJatairportkod("a");
        assertEquals("a", eki.getJatairportkod());
    }

    @Test
    // Test hau Ekitaldi klaseko helairportkod ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta helairportkod "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu helairportkod zuzena dela.
    public void setTestEkihelair() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setHelairportkod("a");
        assertEquals("a", eki.getHelairportkod());
    }

    @Test
    // Test hau Ekitaldi klaseko iraupena ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta iraupena 1.1 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu iraupena zuzena dela.
    public void setTestEkiiraupena() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setIraupena("1.1");
        assertEquals("1.1", eki.getIraupena());
    }

    @Test
    // Test hau Ekitaldi klaseko irtordu ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta irtordu "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu irtordu zuzena dela.
    public void setTestEkiirtordu() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setIrtordu("a");
        assertEquals("a", eki.getIrtordu());
    }

    @Test
    // Test hau Ekitaldi klaseko irtdata ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta irtdata "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu irtdata zuzena dela.
    public void setTestEkiirtdata() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setIrtdata("a");
        assertEquals("a", eki.getIrtdata());
    }

    @Test
    // Test hau Ekitaldi klaseko hprezioa ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta hprezioa 1.1 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu hprezioa zuzena dela, tolerantziarekin.
    public void setTestEkihprezio() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setHprezio(1.1);
        assertEquals(1.1, eki.getHprezio(), 2);
    }

    @Test
    // Test hau Ekitaldi klaseko bkodea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta bkodea 1 gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu bkodea zuzena dela.
    public void setTestEkibkod() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setBkode(1);
        assertEquals(1, eki.getBkode());
    }

    @Test
    // Test hau Ekitaldi klaseko bairelinea ezartzeko metodoa probatzeko da.
    // Hasierako ekitaldi bat sortzen dugu, eta bairelinea "a" gisa ezartzen dugu.
    // Azkenik, egiaztatzen dugu bairelinea zuzena dela.
    public void setTestEkibaire() {
        Ekitaldi eki = new Ekitaldi(0, "", "", "", 0, "", "", "", "");
        eki.setBairelinea("a");
        assertEquals("a", eki.getBairelinea());
    }
}
