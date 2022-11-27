package Ex5;

public class employee extends person {
    private double bonus;
    private double netSalary;
    private double minus;

    public employee(String name, int age, String address, int id, double bonus, double netSalary,
            double minus) {
        super(name, age, address, id);
        this.bonus = bonus;
        this.netSalary = netSalary;
        this.minus = minus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getMinus() {
        return minus;
    }

    public double actualSalary() {
        return netSalary + bonus - minus;
    };

}
