package com.ejemplo.animales;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter(){
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){ // el segundo animal es el nombre que yo quiera meter a esta lista class Animal para adicionarlo
        animals.add(animal); // we add "animal" to the list of animals. (agregamos "animal" a la lista de animales.)
    }

    public List<String> getAllSounds(){
        List<String> sounds = new ArrayList<>();
        for( Animal animal : animals){
            sounds.add(animal.makeSound());
        }
        return sounds;


    }


}
