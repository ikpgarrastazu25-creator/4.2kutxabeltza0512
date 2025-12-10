
import org.junit.Test;
import static org.junit.Assert.*;

public class SoldataKalkulatuTest {
    
    @Test
    public void testAnalista() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("105", "03", "1");
        assertEquals("Soldata esleitua: 2500 (analista)", emaitza);
    }
    
    @Test
    public void testDiseinatzailea() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("210", "", "2");
        assertEquals("Soldata esleitua: 1500 (diseinatzailea)", emaitza);
    }
    
    @Test
    public void testProgramatzailea() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("311", "05", "3");
        assertEquals("Soldata esleitua: 2000 (programatzailea)", emaitza);
    }
    
    @Test
    public void testOfizioaBaliogabea() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("012", "01", "4");
        assertEquals("Errorea: Datuak ez dira zuzenak", emaitza);
    }
    
    @Test
    public void testOfizioaTestua() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("456", "02", "abc");
        assertEquals("Errorea: Datuak ez dira zuzenak", emaitza);
    }
    
    @Test
    public void testSailaHutsa() {
        String emaitza = SoldataKalkulatu.kalkulatuSoldata("789", "", "1");
        assertEquals("Soldata esleitua: 2500 (analista)", emaitza);
    }
}