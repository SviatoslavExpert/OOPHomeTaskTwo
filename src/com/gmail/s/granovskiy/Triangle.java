package com.gmail.s.granovskiy;

/*  declaration and description of Triangle class  */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double p;

    /* object constructor of Triangle class */
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* getters and setters of Triangle class */
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void calculatePrintTriangleArea(){
        p = (a + b + c)/2.0;
        System.out.println("Площадь треугольника: " + Math.sqrt(p*(p - a)*(p - b)*(p - c)));
    }
}
