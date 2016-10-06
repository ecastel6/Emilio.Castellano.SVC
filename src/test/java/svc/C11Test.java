package svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {
    
    private C11 c11;
    
    @Before
    public void before()  {
        c11=new C11();
    }

    @Test
    public void testM1() {
        assertEquals ("error en m1", this.c11.m1());
    }
   
    @Test
    public void testM2() {
        assertEquals ("m2", this.c11.m2());
    }

}