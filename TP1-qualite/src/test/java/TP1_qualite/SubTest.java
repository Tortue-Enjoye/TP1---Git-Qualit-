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

}
