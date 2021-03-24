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
        List<Animal> animalsToButcher = new ArrayList<>();
        for (Animal animal : animals) {
            if (butcher.canButcher(animal)) {
                animalsToButcher.add(animal);
            }
        }
        animals.removeAll(animalsToButcher);
    }

    boolean isEmpty() {
      return animals.isEmpty();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<String> getStatus() {
        List<String> farmStatus = new ArrayList();

        for (Animal animal : animals) {
            farmStatus.add(animal.toString());
        }
        return farmStatus;
    }
}
