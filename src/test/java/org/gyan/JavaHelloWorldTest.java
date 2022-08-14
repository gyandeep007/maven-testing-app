package org.gyan;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaHelloWorldTest {




    @Test
    void testGetHello1() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World",javaHelloWorld.getHello());
    }
}