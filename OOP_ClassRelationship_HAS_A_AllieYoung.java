package hasa;

public class OOP_ClassRelationship_HAS_A_AllieYoung {
    public static void main(String[] args) {
        createAnimals();
    }

    static void createAnimals() {
        Food hamFood = new Food("plants", "seeds");
        Predator hamPred = new Predator("snakes", 1);
        Habitat hamHome = new Habitat("people's houses", "cages", 70);
        Animal hamster = new Animal("hamster", 8, hamFood, hamPred, hamHome);
        System.out.println(hamster);
        System.out.println();
        Food foxFood = new Food("meat", "sheep");
        Predator foxPred = new Predator("wolves", 35);
        Habitat foxHab = new Habitat("every country except antarctica", "grasslands and deserts", 90);
        Animal fox = new Animal("fox", 30, foxFood, foxPred, foxHab);
        System.out.println(fox);
    }
}