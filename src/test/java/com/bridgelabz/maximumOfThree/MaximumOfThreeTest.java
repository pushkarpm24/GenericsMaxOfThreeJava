package com.bridgelabz.maximumOfThree;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

   MaximumOfThree maximumOfThreeObject;

    // Test for if first integer is max
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        int firstMaximum = (int) maximumOfThreeObject.checkMaximum(3,2,1);
        Assert.assertEquals(3,firstMaximum);
    }
    // Test for if second integer is max
    @Test
    public void givenInput_whenSecondNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        int secondMaximum = (Integer) maximumOfThreeObject.checkMaximum(1,3,2);
        Assert.assertEquals(3,secondMaximum);
    }
    // Test for if third integer is max
    @Test
    public void givenInput_whenThirdNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        int thirdMaximum = (Integer) maximumOfThreeObject.checkMaximum(1,2,3);
        Assert.assertEquals(3,thirdMaximum);
    }
    // Test for if first float is max
    @Test
    public void givenInput_whenFirstFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        Float firstMaximum = (Float) maximumOfThreeObject.checkMaximum(3.3f,2.2f,1.1f);
        Assert.assertEquals((Float)3.3f,firstMaximum);
    }
    // Test for if second float is max
    @Test
    public void givenInput_whenSecondFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        Float secondMaximum = (Float) maximumOfThreeObject.checkMaximum(1.1f,3.3f,2.2f);
        Assert.assertEquals((Float) 3.3f,secondMaximum);
    }
    // Test for if third float is max
    @Test
    public void givenInput_whenThirdFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        Float thirdMaximum = (Float) maximumOfThreeObject.checkMaximum(1.1f,2.2f,3.3f);
        Assert.assertEquals((Float)3.3f,thirdMaximum);
    }

    // Test for if first string is max
    @Test
    public void givenInput_whenFirstStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        String checkString = (String) maximumOfThreeObject.checkMaximum("GuavaShake","Apples","Banana");
        Assert.assertEquals((String) "GuavaShake",checkString);
    }
    // Test for if second string is max
    @Test
    public void givenInput_whenSecondStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        String checkString = (String) maximumOfThreeObject.checkMaximum("Apples","GuavaShake","Banana");
        Assert.assertEquals((String) "GuavaShake",checkString);
    }
    // Test for if third string is max
    @Test
    public void givenInput_whenThirdStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree();
        String checkString = (String)maximumOfThreeObject.checkMaximum("Apples","Banana","GuavaShake");
        Assert.assertEquals((String) "GuavaShake",checkString);
    }

}
