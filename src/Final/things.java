package Final;

public abstract class things {
    private String color;
    private int age;
    private String brand;
    private double price;
    private String origin;

    public things(String color, int age, String brand, double price, String origin) {
        this.color = color;
        this.age = age;
        this.brand = brand;
        this.price = price;
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double tax() {
        return price * 0.1;
    };

    public String function(int hotOrCold) {
        switch (hotOrCold) {
            case 1:
                return "Suoi";
            case 2:
                return "Lam mat";
            default:
                return "unknown";
        }
    };

    public String longevity(int time) {
        if (time > 3) {
            return "Long";
        } else {
            return "Short";
        }
    }

    public abstract double chargingTime(int capacity, int bateryLife);
}
