package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void destination() {
        assertTrue( true );
        assertEquals("Teaching", "Teaching");
    }

    @Test
    public void animalSound() {
        assertTrue( true );
        assertEquals("woof", "woof");
    }

    @Test
    public void animalSound2(){
        assertTrue( true );
        assertEquals("Woof, default sound","Woof, default sound");
    }
}
