package br.com.tests.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Exercise2Test {
    @Mock
    private Exercise2 exercise2;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void returnPowNumberTest() {
        Assert.assertEquals(144, (long) exercise2.returnPowNumber(12));
    }

    @Test
    public void returnSumPowNumbers() {
        Assert.assertEquals(85, (long) exercise2.returnSumPowNumbers(29));
    }

    @Test
    public void isHappyNumberTest() {
        Assert.assertTrue(exercise2.isHappyNumber(7));
    }

    @Test
    public void isNotHappyNumberTest() {
        Assert.assertFalse(exercise2.isHappyNumber(3));
    }
}
