package resource;
public class car extends things {
    private float price;
    public car() {
        super();
    }
    public car(int age, String owner, String address, String color, float price) {
        super(age, owner, address, color);
        this.price = price;
    }
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
