package com.Overriding.A;

public class Triangle extends GeometricFigure {

    private double A;
    private double B;
    private double C;

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    @Override
    public void area(){
        double p = (A+B+C)/2;
        double S = Math.sqrt(p*(p-A)*(p-B)*(p-C));
        System.out.println("Uchburchak yuzasi : " + S);
    }

    @Override
    public void perimeter(){
        double P = A + B + C;
        System.out.println("Uchburchak perimetri : " + P);
    }
}
