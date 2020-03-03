package org.example;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }
@Test
    public void testEquals() {
        //Composition code reuse testing
        BaseClass b = new BaseClass("Baseclass","03/03/20","Parent Class");
        SubClass s = new SubClass(b);

        String base = b.toString();
        String sub = s.toString();

        System.out.println(base);
        System.out.println(sub);

        assertEquals(base,sub);

    }
}
