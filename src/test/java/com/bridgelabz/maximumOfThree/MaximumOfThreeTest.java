package com.bridgelabz.maximumOfThree;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

   MaximumOfThree maximumOfThreeObject;

    // Test for finding max integer

    @Test
    public void givenInpute_whenFirstNumberIsMaximum_shouldReturnMaximiu() {
        Integer firstMaximum = (Integer) maximumOfThreeObject.findMaximum(5,2,2,7,4);
        Assert.assertEquals((Integer)7,firstMaximum);
    }

    // Test for if first float is max
    @Test
    public void givenInpute_whenFirstFloatIsMaximum_shouldReturnMaximiu() {
        Float firstMaximum = (Float) maximumOfThreeObject.findMaximum(1.1f,3.3f,1.2f,2.3f,2.7f);
        Assert.assertEquals((Float)3.3f,firstMaximum);
    }

    // Test for if first string is max
    @Test
    public void givenInpute_whenFirstStringIsMaximum_shouldReturnMaximiu() {
        String firstMaximum = (String) maximumOfThreeObject.findMaximum("asdf","asdfghjkl","a","asd");
        Assert.assertEquals((String)"asdfghjkl",firstMaximum);
    }

}
