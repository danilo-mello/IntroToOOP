package oop.basic;

public class Pokemon {
    // data fields (instance variables)
    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor (a special method to create an instance (object)
    // default constructor: constructor given without parameters
    // default constructor is given by the compiler if you don't define any constructors
    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        // this : self-reference
        // this is usually optional, but in the constructor method is mandatory since we param name  == instance var name

        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods (behaviours)
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged my attack!");
        } else {
            System.out.println("Attack has been successful! -" + this.attackPoint);
            enemy.healthPoint -= this.attackPoint;
        }
    }

    boolean dodge() {
        // randomly you have 50% chance of dodging
        // // Math.random(); returns a random double value from 0.0 to 1.0
        return Math.random() > 0.5;
    }

    void evolve() {
        System.out.println("I'm evolving...");
        attackPoint += 20;
        healthPoint += 20;

    }

}
