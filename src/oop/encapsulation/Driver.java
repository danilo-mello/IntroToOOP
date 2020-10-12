package oop.encapsulation;

public class Driver {
    public static void main(String[] args) {
        Account acc1 = new Account("abc123", "1235665556", true);

        acc1.login("abc123", "1235665556");


        System.out.println(acc1.getUsername());

        acc1.setUsername("Danilo");

        System.out.println(acc1.getUsername());

        acc1.setPassword("1233");
        acc1.setPassword("12345678");



    }



}

