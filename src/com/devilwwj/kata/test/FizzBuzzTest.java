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
        assertFalse(FizzBuzz.isMultipleNum(2, 3));
        assertTrue(FizzBuzz.isMultipleNum(3, 3));
    }

    @Test
    public void testSayBuzz() {
        assertFalse(FizzBuzz.isMultipleNum(4, 5));
        assertTrue(FizzBuzz.isMultipleNum(5, 5));
    }

    @Test
    public void testSayFizzBuzz() {
        assertTrue(FizzBuzz.isMultipleNum(3, 15));
        assertTrue(FizzBuzz.isMultipleNum(5, 15));
    }

    @Test
    public void testOnlySayNum() {
        assertFalse(FizzBuzz.isMultipleNum(2, 3));
        assertFalse(FizzBuzz.isMultipleNum(2, 5));
    }

}
