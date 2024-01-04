/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    public double perimeter;
    public double area;

    public Triangle() {
    }

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

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double getPerimeter() {
        return a + b + c;
    }

    
    public double getArea() {
        double p = (a + b + c)/2;
        return Math.sqrt(p *(p-a) *(p-b) *(p-c));
    }

    
    public void printResult() {
        System.out.println("Input Side A: "+ a);
        System.out.println("Input Side B: "+ b);
        System.out.println("Input Side C: "+ c);
        System.out.println("Perimeter: "+getPerimeter());
        System.out.println("Area: "+getArea());
    }
    public boolean checkTriangle(double a, double b, double c){
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)){
            return true;
        } else {
            return false;
        }
    }
}
