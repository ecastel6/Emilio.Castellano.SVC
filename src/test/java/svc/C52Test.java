package svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    private C52 c52;

    @Before
    public void before() {
        c52 = new C52();
    }

    @Test
    public void testMA() {
        assertEquals("mA", this.c52.mA());
    }

}
