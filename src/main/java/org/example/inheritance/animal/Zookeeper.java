package org.example.inheritance.animal;

public class Zookeeper {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal fish= new Fish();
        Animal reptile = new Reptile();

        ((Fish)fish).swim();

        bird.setAge(12);
        fish.setAge(2);
        reptile.setAge(5);

        System.out.println(bird);
        System.out.println(fish);
        System.out.println(reptile);
    }
}
