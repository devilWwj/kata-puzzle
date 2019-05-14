package com.devilwwj.kata.test;

import com.devilwwj.kata.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for 00.FizzBuzz.
 */
public class FizzBuzzTest {

    @Test
    public void testSayFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3, 3, 5));
    }

    @Test
    public void testSayBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5, 3, 5));
    }

    @Test
    public void testSayFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15, 3, 5));
    }

    @Test
    public void testOnlySayNum() {
        assertEquals("1", FizzBuzz.fizzBuzz(1, 3, 5));
    }

}
