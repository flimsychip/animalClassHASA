package hasa;

public class Animal {
    private String name;
    private int speed;
    private Food food;
    private Predator predator;
    private Habitat habitat;

    public Animal() {
    }

    public Animal(String name, int speed, Food food, Predator pred, Habitat hab) {
        this.name = name;
        this.speed = speed;
        this.food = food;
        this.predator = pred;
        this.habitat = hab;
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
