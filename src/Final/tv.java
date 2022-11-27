package Final;

public class tv extends things implements property, property2 {
    private boolean isConnectInternet;
    public tv(String color, int age, String brand, double price, String origin) {
        super(color, age, brand, price, origin);
    }
    public boolean getIsConnectInternet() {
        return this.isConnectInternet;
    }
    public void setConnectInternet(boolean isConnectInternet) {
        this.isConnectInternet = isConnectInternet;
    }

    public double chargingTime(int capacity, int bateryLife) {
        return bateryLife/capacity;
    }

    public String locationAllow(String location) {
        return "location: " + location;
    }

    public int ageAllow(int age) {
        return age;
    }

    public String userAllow(String user) {
        return "user allow: " + user;
    }

}
