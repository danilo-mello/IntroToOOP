package oop.basic;

public class Car {
    // set of variables (states)
    String color;
    String brand;
    int year;
    int horsePower;
    int seats;

    // constructor
    // - 'initialize' instance variables

    // to keep the default constructor:
    Car () {
        // setting a default value
        this.color = "White";
        this.brand = "";
        this.year = 2020;
        this.horsePower = 0;
        this.seats = 5;
    }

    Car(String color, String brand, int year, int horsePower, int seats) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.horsePower = horsePower;
        this.seats = seats;
    }

    // set of methods (behaviors)
    void drive() {
        System.out.println("Driving..." + this.brand);
    }

    // you can create 2 or more functions with the same name, as long as the number of parameters are different
    // this is called 'method overloading'
    void drive(int speed) {
        System.out.println("Driving " + this.brand + " at " + speed + " km/h");
    }

    void stop() {
        System.out.println("Stoping...");
    }



}
