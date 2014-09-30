package com.training.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.text.resources.FormatData_ar_LY;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {

    FlyWithWings fww;
    ByteArrayOutputStream baos;
    PrintStream ps;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        System.setOut(ps);

        fww = new FlyWithWings();
    }

    @Test
    public void testFly() throws Exception {
        fww.fly();
        assertEquals("I'm flying!", baos.toString());
    }

    @After
    public void tearDown() throws Exception{
        // Restore normal operation
        System.setOut(null);
    }
}