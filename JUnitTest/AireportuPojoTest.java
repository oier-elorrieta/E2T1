package JUnitTest;
import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Aireportu;
public class AireportuPojoTest {
   // AIREPORTUA----------------------------------------------------------
   @Test
   public void getTestAir() {
       Aireportu air = new Aireportu("1", "Bilbao");
       assertEquals("Bilbao", air.getHiria());
   }
   @Test
   public void setTestAirkod() {
       Aireportu air = new Aireportu();
       air.setAireportu_kod("a");
       assertEquals("a", air.getAireportu_kod());
   }
   @Test
   public void setTestAirhiri() {
       Aireportu air = new Aireportu();
       air.setHiria("Bilbao");
       assertEquals("Bilbao", air.getHiria());
   }
   @Test
   public void toStringTestAir() {
       Aireportu air = new Aireportu("a", "Bilbao");
       String aireportukod = air.getAireportu_kod();
       String hiria = air.getHiria();
       assertEquals("Aireportu [aireportu_kod=" + aireportukod + ", hiria=" + hiria + "]", air.toString());
   }
}

