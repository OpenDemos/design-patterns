package com.training.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuackTest {
    Quack qua;
    ByteArrayOutputStream baos;
    PrintStream ps;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        System.setOut(ps);

        qua = new Quack();
    }

    @Test
    public void testQuack() throws Exception {
        qua.quack();
        assertEquals("I quack!", baos.toString());
    }

    @After
    public void tearDown() throws Exception{
        // Restore normal operation
        System.setOut(null);
    }
}