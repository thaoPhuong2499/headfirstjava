package Ex2;

public class zoo implements property, property2 {
    private String address;
    private double price;
    private int ageAllow;
    // private staff[] listStaff;
    // private animal[] listAnimal;

    public String shape() {
        return "round";
    };

    public int age() {
        return 2;
    }

    public void name() {
    }

    // public zoo(String address, float price, int ageAllow, staff[] listStaff,
    // animal[] listAnimal) {
    // this.address = address;
    // this.price = price;
    // this.ageAllow = ageAllow;
    // this.listStaff = listStaff;
    // this.listAnimal = listAnimal;
    // }
    public zoo(String address, double price, int ageAllow) {
        this.address = address;
        this.price = price;
        this.ageAllow = ageAllow;
    }

    public String getAddress() {
        return this.address;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAgeAllow() {
        return this.ageAllow;
    }

    // public staff[] getListStaff() {
    // return this.listStaff;
    // }

    // public animal[] getListAnimal() {
    // return this.listAnimal;
    // }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAgeAllow(int ageAllow) {
        this.ageAllow = ageAllow;
    }

    // public void setListStaff(staff[] listStaff) {
    // this.listStaff = listStaff;
    // }

    // public void setListAnimal(animal[] listAnimal) {
    // this.listAnimal = listAnimal;
    // }
}
