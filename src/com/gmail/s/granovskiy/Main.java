package com.gmail.s.granovskiy;

public class Main {
    public static void main(String[] args){

        /*  creating exemplars of Triangle class  */
        Triangle triangleOne = new Triangle(0.3, 0.4, 0.5);
        Triangle triangleTwo = new Triangle(0.7, 0.8, 0.9);

        /*  calling the method calculatePrintTriangleArea for Triangle class exemplars  */
        triangleOne.calculatePrintTriangleArea();
        triangleTwo.calculatePrintTriangleArea();
    }
}
