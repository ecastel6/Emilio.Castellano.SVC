package svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 c51;

    @Before
    public void before() {
        c51 = new C51();
    }

    @Test
    public void testM1() {
        assertEquals("m1", this.c51.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", this.c51.m2());
    }

}
