package hasa;

public class Habitat {
    private String region;
    private String type;
    private int temp;

    public Habitat() {
    }

    public Habitat(String region, String type, int temp) {
        this.region = region;
        this.type = type;
        this.temp = temp;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String toString() {
        return "this animal lives in " + this.type + " in " + this.region + ". their preferred temperature is " + this.temp + " degrees F";
    }
}
