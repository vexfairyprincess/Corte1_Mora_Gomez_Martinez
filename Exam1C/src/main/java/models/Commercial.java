package models;

public class Commercial extends Employee {
    private double comission;

    public Commercial() {
    }

    public Commercial(String id, String names, String lastNames, int age, double baseSalary, int incentive, double comission) {
        super(id, names, lastNames, age, baseSalary, incentive);
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Commercial{");
        sb.append("comission=").append(comission);
        sb.append('}');
        return sb.toString();
    }

    public double calculateComission() {
        double finalSalary = this.getBaseSalary();
        if (this.getAge() > 30 && this.comission < 500) {
            finalSalary += 0.5 * INCENTIVE  ;
        }
        return finalSalary * 0.93;
    }
}
