package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Create 2 objects:
        1) Cat with default values
        2) Parameterized
         */
        Cat cat = new Cat();
        Cat cat1 = new Cat("Tiger", "brown", 5);
        System.out.println(cat.getName());

        // Print out with toString all values

        // Overwrite default name using setter
        cat.setName("Panther");
        System.out.println(cat.getName());


        // Overwrite age of cat1
        cat1.setAge(3);

        // Print again
        System.out.println("---");

    }
}