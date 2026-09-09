package TP1_qualite;

import org.junit.Assert;
import org.junit.Test;


public class SubTest 
{
    @Test
    public void testSub1(){
        int a,b,r;

        a = 1;
        b = 1;

        r = 0;

        Assert.assertEquals("Echec test 1",r,Sub.sub(a, b));

    }

    @Test
    public void testSub2(){
        int a,b,r;

        a = 0;
        b = 1;

        r = -1;

        Assert.assertEquals("Echec test 2",r,Sub.sub(a, b));

    }

    @Test
    public void testSub3(){
        int a,b,r;

        a = 15;
        b = 5;

        r = 10;

        Assert.assertEquals("Echec test 3",r,Sub.sub(a, b));

    }
}
