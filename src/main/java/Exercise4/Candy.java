package Exercise4;

public class Candy implements Sweets {

    String name;
    String additionalInformation;
    int weight;
    int price;

    public Candy(String name, int price, int weight, String additionalInformation){
        this.name = name;
        this.weight = weight;
        this.price = price;
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
