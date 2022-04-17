package com.lecture5;

public class main {
    public static void main(String[] args) {

        Veterinarian vet = new Veterinarian();
        Animal cat = new Cat("milk", "yard",false);
        Animal dog = new Dog("meat", "house", "California", true);
        Animal horse = new Horse("corn", "corral", false, 4);

        Animal[] animals = {cat, dog, horse};
        for (Animal i: animals){
            vet.treatAnimal(i);
        }

        }
    }
