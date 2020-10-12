package oop.basic;

import java.security.Policy;

public class Driver {
    public static void main(String[] args) {
        // Car object (instance)
        // new Car(); -> constructor (special method)
        // - if no constructor is defines, Java gives you 'default constructor':
        // - default constructor: constructor without parameters.
//
//        Car c1 = new Car("Yellow", "Lamborghini", 2020, 550, 2); // create aa new instance
//
//        c1.drive();
//        c1.drive(180);
//        c1.stop();
//        System.out.println(c1.brand);
//        System.out.println(c1.year);
//        System.out.println(c1.color);
//        System.out.println(c1.horsePower);
//        System.out.println(c1.seats);
//
//        Car c2 = new Car();
//        c2.color = "Red";
//        c2.brand = "Ferrari";
//        c2.year = 2019;
//        c2.horsePower = 540;
//        c2.seats = 2;
//
//        c2.drive();
//        c2.stop();
//        System.out.println(c2.color);
        Pokemon pikachu = new Pokemon("Pikachu", "electric", 35, 55);
        Pokemon mewTwo = new Pokemon("Mew Two", "Psych", 50, 35);

        pikachu.attack(mewTwo);

        System.out.println(pikachu.name + " HP: " + pikachu.healthPoint);
        System.out.println(pikachu.name + " AP: " + pikachu.attackPoint);
        pikachu.evolve();
        System.out.println(pikachu.name + " HP: " + pikachu.healthPoint);
        System.out.println(pikachu.name + " AP: " + pikachu.attackPoint);


    }
}
