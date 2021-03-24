package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals = new ArrayList<>();

    Farm(List animals) {
        this.animals = animals;
    }

    void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    void butcher(Butcher butcher) {
        Butcher theButcher = new Butcher();
        List<Animal> animalsToButcher = new ArrayList<>();
        for (Animal animal : animals) {
            if (theButcher.canButcher(animal)) {
                animalsToButcher.add(animal);
            }
        }
        animals.removeAll(animalsToButcher);
    }

    boolean isEmpty() {
      return (animals.isEmpty())? true : false;
    }
    List<Animal> getAnimals() {
        return animals;
    }
    List<String> getStatus() {
        List<String> farmStatus = new ArrayList();

        for (Animal animal : animals) {
            farmStatus.add(animal.toString());
        }
        return farmStatus;
    }



}
