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
//    feladata: A farmon lévő összes állat megetetése.
    }


    void butcher(Butcher butcher) {
    // összes levágható állat eltávolítása a farmon lévő állatokat tartalmazó listából
    }

    boolean isEmpty() {
      return (animals.isEmpty())? true : false;
    }
    List<Animal> getAnimals() {
        return animals;
    }
    List<String> getStatus() {
     //állatok státuszait tartalmazó listát ad vissza,
        // a farmon lévő összes állatra vonatkozóan.
        //"There is a <állat mérete> sized <állat típusa (pig/cattle)> in the farm."
        return null;
    }


}
