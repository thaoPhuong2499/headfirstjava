package stuff;

public class computer extends device {
    private String CPU;
    public computer(String name, int age, String type, float price, String color, String CPU) {
        super(name, age, type,price, color);
        this.CPU = CPU;
    }
    public String getCPU() {
        return this.CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }
}

