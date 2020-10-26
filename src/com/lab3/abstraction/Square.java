package com.lab3.abstraction;

public class Square implements Polygon, Form{
    //Polygon Forms
    @Override
    public void width(int width) {
        System.out.println("Width is " + width);
    }

    @Override
    public void getArea(int length, int width){
        System.out.println("Area is " + (length*width));
    }

    //Form methods
    @Override
    public void typeOfForm(){
        System.out.println("this is a square");
    }

    @Override
    public void typeOfColor(String color){
        System.out.println(color);
    }
}
