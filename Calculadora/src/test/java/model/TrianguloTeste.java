package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrianguloTeste {

    Triangulo resultado;
    Triangulo triangulo1;
    Triangulo triangulo2;

    @Before
    public void before() {
        resultado = new Triangulo();
        triangulo1 = new Triangulo();
        triangulo2 = new Triangulo();
    }

    @Test
    public void deveCalcularAreaTriangulo() {
        // Given: um triangulo
        triangulo1.setBase(3.0);
        triangulo1.setAltura(4.0);
        // When: calcular área
        double resultado = triangulo1.calcularAreaTriangulo();
        // Then: resultado deve ser igual 6
        assertEquals(6,resultado,0.0);
    }
    @Test
    public void trianguloDeMenorAreaDeveTerAreaMenorQueDoTriangulo2() {
        triangulo1.setBase(3);
        triangulo1.setAltura(4);
        triangulo2.setBase(6);
        triangulo2.setAltura(8);

        resultado = resultado.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertTrue(resultado.calcularAreaTriangulo() < triangulo2.calcularAreaTriangulo());

    }

    @Test
    public void trianguloDeMenorAreaDeveTerAreaMenorQueDoTriangulo1() {
        triangulo1.setBase(5);
        triangulo1.setAltura(9);
        triangulo2.setBase(3);
        triangulo2.setAltura(4);

        resultado = resultado.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertFalse(resultado.calcularAreaTriangulo() > triangulo2.calcularAreaTriangulo());

    }

    @Test
    public void deveRetornarNuloQuandoAsAreasDosTriangulosSaoIguais() {
        triangulo1.setBase(3);
        triangulo1.setAltura(4);
        triangulo2.setBase(3);
        triangulo2.setAltura(4);

        resultado = resultado.trianguloDeMenorArea(triangulo1, triangulo2);

        Assert.assertNull(resultado);

    }

}
