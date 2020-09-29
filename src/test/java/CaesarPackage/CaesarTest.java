package CaesarPackage;

import junit.framework.TestCase;

public class CaesarTest extends TestCase {

    Caesar nireCaesar =null;

    public void setUp() throws Exception {
        super.setUp();
        nireCaesar = new Caesar();
    }

    public void tearDown() throws Exception {
    }


    public void testZifratu() {

        nireCaesar.desordenatuGakoarekin("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", nireCaesar.zifratu("EZ GAUDE GERRAREN ALDE"));
    }

    public void testDeszifratu() {
        nireCaesar.desordenatuGakoarekin("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("EZ GAUDE GERRAREN ALDE",
                nireCaesar.deszifratu(
                        nireCaesar.zifratu("EZ GAUDE GERRAREN ALDE")));
    }
}