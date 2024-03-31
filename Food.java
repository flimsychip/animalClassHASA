package hasa;

public class Food {
    private String type;
    private String name;

    public Food() {
    }

    public Food(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "this animal eats " + this.type + ". its food source is " + this.name;
    }
}
