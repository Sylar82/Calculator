package Exercise4;

public class Lollipop implements Sweets {

    String name;
    String additionalInformation;
    int weight;
    int price;

    public Lollipop(String name, int price, int weight, String additionalInformation) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.additionalInformation = additionalInformation;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

}