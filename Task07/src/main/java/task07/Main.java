package task07;

import task07.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog01 = new Dog("Sharik", "brown");
        Dog dog02 = new Dog("Snizhok", "white", "home");
        Dog dog03 = new Dog("Apollo", "red");
        System.out.println(dog01.getDogHabitat());
        System.out.println(dog02.getDogHabitat());
        System.out.println("Dog's name is: " + dog03.getName());
        System.out.println("Ranaming " + dog03.getName());
        dog03.setRandomName(dog03.getName());
        System.out.println("And now... dog's name is: " + dog03.getName());
        System.out.println(dog03.getDogOwner());
        dog03.setDogOwner("Masha");
        System.out.println(dog03.getDogOwner());
        System.out.println(Dog.getNumberOfDogs());
    }
}