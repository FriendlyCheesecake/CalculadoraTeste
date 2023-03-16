package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTeste {

    CalculadoraService calculadoraService = new CalculadoraService();
    int a;
    int b;

    @Before
    public void before() {
        a = 8;
        b = 2;
    }

    @Test
    public void deveSomarCorretamente() {
        //Given
        //When
        int resultado = calculadoraService.somar(a, b);

        //Then
        Assert.assertEquals(a + b, resultado);
    }


    @Test
    public void deveSubtrairCorretamente () {
        int resultado = calculadoraService.subtrair(a, b);

        Assert.assertEquals(a-b, resultado);

    }

    @Test
    public void deveDividirCorretamente () {
        int resultado = calculadoraService.dividir(a, b);

        Assert.assertEquals(a/b, resultado);
    }

    @Test
    public void deveMultiplicarCorretamente () {
        int resultado = calculadoraService.multiplicar(a, b);

        Assert.assertEquals(a*b, resultado);

    }
}



