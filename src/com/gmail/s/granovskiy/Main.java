package com.gmail.s.granovskiy;

public class Main {
    public static void main(String[] args){

        /*  creating exemplars of Triangle class  */
        Triangle triangleOne = new Triangle(0.3, 0.4, 0.5);
        Triangle triangleTwo = new Triangle(0.7, 0.8, 0.9);

        /*  calling the method calculateTriangleArea for Triangle class exemplars and printing the result  */
        System.out.println(triangleOne.calculateTriangleArea());
        System.out.println(triangleTwo.calculateTriangleArea());

        /*  Calling the toString() method to see the state of the objects  */
        System.out.println(triangleOne);
        System.out.println(triangleTwo);
    }
}
