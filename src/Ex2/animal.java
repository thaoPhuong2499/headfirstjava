package Ex2;

public class animal {
    private String name;
    private int age;
    private String type;
    private String origin;

    public animal (String name, int age, String type, String origin) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.origin = origin;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getOrigin() {
        return this.origin;
    }
    public String getType() {
        return this.type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setType(String type) {
        this.type = type;
    }
}
