package com.gmail.s.granovskiy;

/*  declaration and description of Triangle class  */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double p;
    private double calculationResult;

    /* object constructor of Triangle class */
    /*  access modifier: public !!! */
    public Triangle(double a, double b, double c){
        super();         /*  constructor by default  */
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

    /*  method data type: double, not void!!!  The method returns triangle area. */
    public double calculateTriangleArea(){
        p = (a + b + c)/2.0;
        calculationResult = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return calculationResult;
    }
    /*  The toString() method returns the string representation of the object.  */
    public String toString() {
        return "Triangle [side a=" + a + ", side b=" + b + ", side c=" + c + ",  p=" + p + ", calculationResult=" + calculationResult + "]";
    }
}
