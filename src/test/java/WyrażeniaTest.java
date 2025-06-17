import wyrażeniaZUpraszczaniem.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WyrażeniaTest {
    @Test
    void testMnożeniaPrzezZero(){
        Wyrażenie jeden, zero, x;
        x = Zmienna.twórz();
        zero = Zero.twórz();
        jeden = Jeden.twórz();
        assertEquals (jeden.pomnóż(zero), zero);
        assertEquals (jeden.pomnóż(zero).toString(), ("0.0"));
        assertEquals (x.pomnóż(zero), zero);
        assertEquals (x.pomnóż(zero).toString(), ("0.0"));
    }
    @Test
    void testDodawaniaZera(){
        Wyrażenie jeden, zero, x;
        x = Zmienna.twórz();
        zero = Zero.twórz();
        jeden = Jeden.twórz();
        assertEquals (jeden.dodaj(zero),  jeden);
        assertEquals (jeden.dodaj(zero).toString(), "1.0");
        assertEquals (x.dodaj(zero), x);
        assertEquals (x.dodaj(zero).toString(), "x");
    }
    @Test
    void testMnożeniaPrzezJeden(){
        Wyrażenie jeden, trzy, x;
        x = Zmienna.twórz();
        jeden = Jeden.twórz();
        trzy = Stała.twórz(3);
        assertEquals (jeden.pomnóż(trzy), trzy);
        assertEquals (jeden.pomnóż(jeden), jeden);
        assertEquals (jeden.pomnóż(x), x);
        assertEquals (x.pomnóż(jeden), x);
        assertEquals (trzy.pomnóż(jeden).toString(), trzy.toString()); // To jest już inna stała
    }

}
