package TP1_qualite;

import org.junit.Assert;
import org.junit.Test;


public class AddTest 
{
    @Test
    public void testAdd1(){
        int a,b,r;

        a = 1;
        b = 1;

        r = 2;

        Assert.assertEquals("Echec test 1",r,Add.add(a, b));

    }

    @Test
    public void testAdd2(){
        int a,b,r;

        a = -1;
        b = -1;

        r = -2;

        Assert.assertEquals("Echec test 2",r,Add.add(a, b));
    }

    @Test
    public void testAdd3(){
        int a,b,r;

        a = -1;
        b = 1;

        r = 0;

        Assert.assertEquals("Echec test 3",r,Add.add(a, b));
    }
}
