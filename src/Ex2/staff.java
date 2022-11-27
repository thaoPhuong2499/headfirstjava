package Ex2;

public class staff {
    private String name;
    private int age;
    private int id;
    private String idCard;
    private String address;

    public staff (String name, int age, int id, String idCard, String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.idCard = idCard;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getId() {
        return this.id;
    }
    public String getIdCard() {
        return this.idCard;
    }
    public String getAddress() {
        return this.address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
