package br.com.tests.service;

import br.com.tests.service.builder.NaturalNumbersBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class Exercise1Test {

    @Mock
    private Exercise1 exercise1;

    private List<Long> naturalNumbers;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        naturalNumbers = NaturalNumbersBuilder.listOf1000NaturalNumbers().now();
    }

    //Testar se realmente pegou os múltiplos de 3 ou 5 - A soma tem que dar 233168
    @Test
    public void sumMultiplesBy3or5Test() {
        Long sum = exercise1.returnSum(exercise1.returnMultiplesBy3or5(naturalNumbers));
        Assert.assertEquals(233168, (long) sum);
    }

    //Testar se realmente pegou os múltiplos de 3 e 5 - A soma tem que dar 33165
    @Test
    public void sumMultiplesBy3and5Test() {
        Long sum = exercise1.returnSum(exercise1.returnMultiplesBy3and5(naturalNumbers));
        Assert.assertEquals(33165, (long) sum);
    }

    //Testar se realmente pegou os múltiplos de 3 ou 5 e 7 - A soma tem que dar 33173
    @Test
    public void sumMultiplesBy3or5and7Test() {
        Long sum = exercise1.returnSum(exercise1.returnMultiplesBy3or5and7(naturalNumbers));
        Assert.assertEquals(33173, (long) sum);
    }
}
