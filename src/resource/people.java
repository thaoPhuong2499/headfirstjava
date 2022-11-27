package resource;

public class people {
    private int age;
    private String name;
    private String address;
    private int height;
    private int weight;
    public people(int age, String name, String address, int height, int weight) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
}


