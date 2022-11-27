package resource;
public class things {
    private int age;
    private String owner;
    private String address;
    private String color;

    public int getAge() {
        return this.age;
    }
    public String getOwner() {
        return this.owner;
    }
    public String getAddress() {
        return this.address;
    }
    public String getColor() {
        return this.color;
    }
    
    public things () {
    }
    public things (int age, String owner, String address, String color) {
        this.age = age;
        this.owner = owner;
        this.address = address;
        this.color = color;
    }
    public things (int age, String owner, String address) {
        this.age = age;
        this.owner = owner;
        this.address = address;
    }

    public String ownerNColor() {
        return this.owner + this.color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
