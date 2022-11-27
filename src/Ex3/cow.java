package Ex3;

public abstract class cow {
    private String color;
    private int age;
    private String owner;

    public cow(String color, int age, String owner) {
        this.color = color;
        this.age = age;
        this.owner = owner;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract void boo(String sound);
}
