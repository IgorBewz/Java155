package task07.Animals;

import java.sql.Array;
import java.util.Random;

public class Dog extends Animal {
    Habitat dogHabitat = new Habitat();
    Owner dogOwner = new Owner();
    private static int numberOfDogs;
    public Dog(String name, String color) {
        super(name, color);
        new Counter().incrementCounter();
    }

    public Dog(String name, String color, String habitat) {
        super(name, color);
        dogHabitat.setHabitat(habitat);
        new Counter().incrementCounter();
    }
    private static class Counter {
        private void incrementCounter() {
            numberOfDogs++;
        }
    }
    public static String getNumberOfDogs() {
        return "Number of dogs : " + Integer.toString(numberOfDogs);
    }
    private class Habitat {
        private String habitat = "unknown";
        Habitat() {}
        Habitat(String habitat) {
            this.habitat = habitat;
        }

        void setHabitat(String habitat) {
            this.habitat = habitat;
        }
        String getHabitat() {
            return habitat;
        }
    }

    private class Owner {
        private String owner = "unknown";
        void setOwner(String owner) {
            this.owner = owner;
        }
        String getOwner() {
            return owner;
        }
    }
    public String getDogHabitat() {
        return "Dog's name is: " + getName() + " and dog's habitat is: " + dogHabitat.getHabitat();
    }
    public void setDogOwner(String owner) {
        dogOwner.setOwner(owner);
    }
    public String getDogOwner() {
        return "Dog name is: " + getName() + " and dog's owner is: " + dogOwner.getOwner();
    }
    public void setRandomName(String presentName) {
        enum DogName {
            Sharik, Apollo, Snizhok, Casper, Tesla
        }
        DogName namesArray[] = DogName.values();
        Random random = new Random();
        do {
            int numberOfRandomName = random.nextInt(namesArray.length);
            super.setName(namesArray[numberOfRandomName].toString());
        } while (presentName.compareTo(super.getName()) == 0);
    }
}
