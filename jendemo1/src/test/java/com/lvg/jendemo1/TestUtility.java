package com.lvg.jendemo1;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lvg.jendemo1.utility.Utility;
public class TestUtility 
{
	Utility u;
    @Before
    public void setUp() throws Exception
    {
    	u = new Utility();
    }
    
    @After
    public void tearDown() throws Exception
    {
    	u = null;
    }
	
    @Test
    public void testSum()
    {
    	assertEquals(30,u.sum(10,20));
    }
    
    @Test
    public void testSqr()
    {
    	assertEquals(25,u.sqr(5));
    }
    
    @Test
    public void testPower()
    {
        assertEquals(125,u.power(5, 3));	
    }

}
