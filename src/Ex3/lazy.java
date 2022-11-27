package Ex3;

public class lazy extends cow {
    public lazy(String color, int age, String owner) {
        super(color, age, owner);
    }

    public void boo(String sound) {
        System.out.println(sound);
    }
}
