package com.bridgelabz.maximumOfThree;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfThreeTest {

   MaximumOfThree maximumOfThreeObject;

    // Test for if first integer is max
    @Test
    public void givenInput_whenFirstNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(3,2,1);
        int firstMaximum = (int) maximumOfThreeObject.checkMaximum( );
        Assert.assertEquals(3,firstMaximum);
    }
    // Test for if second integer is max
    @Test
    public void givenInput_whenSecondNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1,3,2);
        int secondMaximum = (Integer) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals(3,secondMaximum);
    }
    // Test for if third integer is max
    @Test
    public void givenInput_whenThirdNumberIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1,2,3);
        int thirdMaximum = (Integer) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals(3,thirdMaximum);
    }
    // Test for if first float is max
    @Test
    public void givenInput_whenFirstFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(3.3f,2.2f,1.1f);
        Float firstMaximum = (Float) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((Float)3.3f,firstMaximum);
    }
    // Test for if second float is max
    @Test
    public void givenInput_whenSecondFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1.1f,3.3f,2.2f);
        Float secondMaximum = (Float) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((Float) 3.3f,secondMaximum);
    }
    // Test for if third float is max
    @Test
    public void givenInput_whenThirdFloatIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree(1.1f,2.2f,3.3f);
        Float thirdMaximum = (Float) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((Float)3.3f,thirdMaximum);
    }

    // Test for if first string is max
    @Test
    public void givenInput_whenFirstStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("GuavaShake","Apples","Banana");
        String checkString = (String) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((String) "GuavaShake",checkString);
    }
    // Test for if second string is max
    @Test
    public void givenInput_whenSecondStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("Apples","GuavaShake","Banana");
        String checkString = (String) maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((String) "GuavaShake",checkString);
    }
    // Test for if third string is max
    @Test
    public void givenInput_whenThirdStringIsMaximum_shouldReturnMaximum() {
        maximumOfThreeObject = new MaximumOfThree("Apples","Banana","GuavaShake");
        String checkString = (String)maximumOfThreeObject.checkMaximum();
        Assert.assertEquals((String) "GuavaShake",checkString);
    }

}
