package com.lab3.abstraction;

public class Lenovo extends Computer {

    @Override
    public void speed() {
        System.out.println("4.1ghz");
    }

    @Override
    public void power(int p) {
        System.out.println("Number of processors : " + p * 4);
    }
}