package model;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {}

    public double calcularAreaQuadrado () {
        return lado*lado;
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        if (quadrado1.calcularAreaQuadrado() == quadrado2.calcularAreaQuadrado()){
            return null;
        } else if (quadrado1.calcularAreaQuadrado() < quadrado2.calcularAreaQuadrado()){
            return quadrado1;
        } else {
            return quadrado2;
        }
    }


}
