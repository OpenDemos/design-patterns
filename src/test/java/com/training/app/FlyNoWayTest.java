package com.training.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNoWayTest {

    FlyNoWay fnw;
    ByteArrayOutputStream baos;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        fnw = new FlyNoWay();
    }

    @Test
    public void testFly() throws Exception {
        fnw.fly();
        assertEquals("I can't fly", baos.toString());
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
}