package org.gyan;


import org.junit.Test;
import static org.junit.Assert.*;
public class JavaHelloWorldTest {


    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
    }

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
       assertEquals("Hello World",javaHelloWorld.getHello());
    }
}