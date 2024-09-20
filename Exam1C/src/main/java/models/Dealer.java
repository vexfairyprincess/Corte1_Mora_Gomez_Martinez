package models;

public class Dealer extends Employee {
    private String zone;

    public Dealer() {
    }

    public Dealer(String id, String names, String lastNames, int age, double baseSalary, int incentive, String zone) {
        super(id, names, lastNames, age, baseSalary, incentive);
        this.zone = zone;
    }

    @Override
    public double calculateSalary() {
        double finalSalary = this.getBaseSalary();
        if (this.getAge() < 25 && "Ciudad Sandino".equalsIgnoreCase(this.zone)) {
            finalSalary += INCENTIVE;
        }

        return finalSalary * 0.90;

    }


    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
