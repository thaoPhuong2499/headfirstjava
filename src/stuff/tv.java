package stuff;

public class tv extends device {
    private String owner;
    public tv(String name, int age, String type, String owner){
        super(name, age, type);
        this.owner = owner;
    }
    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
