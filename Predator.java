package hasa;

public class Predator {
    private String species;
    private int speed;

    public Predator() {
    }

    public Predator(String species, int speed) {
        this.species = species;
        this.speed = speed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return "this animal is hunted by " + this.species + ", which have a speed of " + this.speed + "mph";
    }
}
