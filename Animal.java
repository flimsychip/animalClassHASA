package hasa;

public class Animal {
    private static int numAnimals = 0;
    private String name;
    private int speed;
    private Food food;
    /*"predator" is a stand-in for anything that uses this animal as a food source.
    the food chain loops back around and the animal at the top is used as a food source by microorganisms.*/
    private Predator predator;
    private Habitat habitat;

    public Animal() {
        Animal.numAnimals++;
    }

    public Animal(String name, int speed, Food food, Predator pred, Habitat hab) {
        this.name = name;
        this.speed = speed;
        this.food = food;
        this.predator = pred;
        this.habitat = hab;
        Animal.numAnimals++;
    }

    public static int getNumAnimals() {
        return Animal.numAnimals;
    }

    public static void setNumAnimals(int num) {
        Animal.numAnimals = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Food getFood() {
        return this.food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Predator getPredator() {
        return this.predator;
    }

    public void setPredator(Predator pred) {
        this.predator = pred;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public void setHabitat(Habitat hab) {
        this.habitat = hab;
    }

    public String toString() {
        return "this animal is a " + this.name + ". it has a speed of " + this.speed + "mph\n" + this.food + "\n" + this.predator + "\n" + this.habitat;
    }
}
