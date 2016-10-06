package svc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    private C32 c32;

    @Before
    public void before() {
        c32 = new C32();
    }

    @Test
    public void testMA() {
        assertEquals("mA", this.c32.mA());
    }
}
