package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatFunctionsTest {

    @Test
    public void Fibonacci() {
        Assert.assertEquals(1, MatFunctions.Fibonacci(1));
        Assert.assertEquals(1, MatFunctions.Fibonacci(2));
        Assert.assertEquals(2, MatFunctions.Fibonacci(3));
        Assert.assertEquals(3, MatFunctions.Fibonacci(4));
        Assert.assertEquals(5, MatFunctions.Fibonacci(5));
    }

    @Test
    public void pow() {
        Assert.assertEquals(1, MatFunctions.pow(10, 0));
        Assert.assertEquals(100,MatFunctions.pow(10,2));
        Assert.assertEquals(25,MatFunctions.pow(5,2));
        Assert.assertEquals(4,MatFunctions.pow(-2,2));
    }

    @Test
    public void factorial() {
        Assert.assertEquals(1,MatFunctions.factorial(1));
        Assert.assertEquals(2,MatFunctions.factorial(2));
        Assert.assertEquals(6,MatFunctions.factorial(3));
        Assert.assertEquals(24,MatFunctions.factorial(4));
        Assert.assertEquals(1,MatFunctions.factorial(0));
    }
}