package CaesarPackage;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    App nireApp=null;

    public void setUp() throws Exception {
        super.setUp();
        nireApp = new App();
    }

    public void tearDown() throws Exception {
    }


    public void testZifratu() {

        nireApp.desordenatuGakoarekin("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", nireApp.zifratu("EZ GAUDE GERRAREN ALDE"));
    }

    public void testDeszifratu() {
        nireApp.desordenatuGakoarekin("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("EZ GAUDE GERRAREN ALDE",
                nireApp.deszifratu(
                        nireApp.zifratu("EZ GAUDE GERRAREN ALDE")));
    }
}