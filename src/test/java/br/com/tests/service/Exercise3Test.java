package br.com.tests.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Exercise3Test {
    @Mock
    private Exercise3 exercise3;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void returnWordValueTest() {
        Assert.assertEquals(15, exercise3.returnWordValue("abcde"));
        Assert.assertEquals(84, exercise3.returnWordValue("ABC"));
    }

    @Test
    public void isPrimeWordTest() {
        Assert.assertFalse(exercise3.isPrimeWord(84));
        Assert.assertTrue(exercise3.isPrimeWord(7));
    }

    @Test
    public void isMultipleBy3or5WordTest() {
        Assert.assertTrue(exercise3.isMultipleBy3or5Word(15));
    }
}