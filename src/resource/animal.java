package resource;

public class animal {
    private String type;
    private String address;
    public animal(String type, String address) {
        this.type = type;
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public String getType() {
        return this.type;
    }
}
