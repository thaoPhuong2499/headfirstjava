package stuff;

public class device {
    private String name;
    private int age;
    private String type;
    private float price;
    private String color;

    public device(String name, int age, String type, float price, String color) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
        this.color = color;
    }
    public device(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type; 
    }
    public String getType() {
        return this.type;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getColor() {
        return this.color;
    }
    public float getPrice() {
        return this.price;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
}
