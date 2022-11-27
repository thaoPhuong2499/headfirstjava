package Ex5;

public class person {
    private String name;
    private int age;
    private String address;
    private int id;

    public person(String name, int age, String address, int id) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setId(int id) {
        this.id = id;
    }
}
