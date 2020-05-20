package com.wildcodeschool.simpleCalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd() {

        Assert.assertEquals(0, App.add(""));
        Assert.assertEquals(1, App.add("1"));
        Assert.assertEquals(3, App.add("2,1"));
        Assert.assertEquals(0, App.add("1,-1"));
        Assert.assertEquals(6, App.add("3,2,1"));
        Assert.assertEquals(6, App.add("3,2\n1"));
        Assert.assertEquals(3, App.add("//;\n1;2"));
    }
}
