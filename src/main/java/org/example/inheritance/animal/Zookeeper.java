package org.example.inheritance.animal;

import java.util.ArrayList;
import java.util.List;

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

        List<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(fish);
        animals.add(reptile);

        // for-each loop
        System.out.println();
        for (Animal a : animals) {
            System.out.println(a);
        }


        //for-each method
        System.out.println();
        animals.forEach(a -> System.out.println(a));


        //for-each stream method
        System.out.println();
        animals.stream()
                .forEach(a -> System.out.println(a));
    }
}
