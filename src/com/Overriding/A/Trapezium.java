package com.Overriding.A;

public class Trapezium extends GeometricFigure {

    private double A;
    private double B;
    private double h;

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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public void area(){
        double S = ((A + B) * h) /2;
        System.out.println("Trapetsiya yuzasi : " + S);
    }

    @Override
    public void perimeter(){
        double P = 2*(A+B);
        System.out.println("Trapetsiya perimetri : " + P);
    }

}
