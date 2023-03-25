package model;

public class Triangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {

    }

    public double calcularAreaTriangulo(){
        return (base*altura)/2.0;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        if (triangulo1.calcularAreaTriangulo() == triangulo2.calcularAreaTriangulo()){
            return null;
        } else if (triangulo1.calcularAreaTriangulo() < triangulo2.calcularAreaTriangulo()){
            return triangulo1;
        } else {
            return triangulo2;
        }
    }
}
