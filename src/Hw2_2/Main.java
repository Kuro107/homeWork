package Hw2_2;

import Hw2_2.*;

public class Main {
    public static void main(String[] args) {
        Pets pets = new Pets();

        Parrot parrot = new Parrot();
        parrot.setAge(12);
        parrot.setSex("Male");
        pets.setParrots(parrot);

        Dog dog = new Dog();
        dog.setName("Bobby");
        dog.setVoiceLevel(122);
        pets.setDogs(dog);

        Cat cat = new Cat();
        cat.setBreed("Straight");
        cat.setLivesLeft(4);
        pets.setCats(cat);

        Fishes fishes = new Fishes();
        fishes.setColor("orange");
        fishes.setSize(12);
        pets.setFishes(fishes);

        System.out.println(pets);
    }
}
