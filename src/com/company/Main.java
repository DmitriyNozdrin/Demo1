package com.company;



public class Main {

    public static void main(String[] args) {
        Apple appleRed = new Apple();
        appleRed.addPrice (50);
Apple newApple = new Apple();
newApple.addPrice(100);
System.out.println("Sum of apples " + Apple.applePrice);

    }

    public static class Apple {
    public static int applePrice = 0;

    public static void addPrice (int applePrice) {
        Apple.applePrice = Apple.applePrice + applePrice;
        System.out.println("Price " + applePrice);
    }
    }

    
}
