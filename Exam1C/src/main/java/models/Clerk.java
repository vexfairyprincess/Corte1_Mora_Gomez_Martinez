package models;

public class Clerk extends Employee {
    private String charge;

    public Clerk() {
    }

    public Clerk(String id, String names, String lastNames, int age, double baseSalary, String charge) {
        super(id, names, lastNames, age, baseSalary);
        this.charge = charge;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Clerk{");
        sb.append("charge='").append(charge).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
