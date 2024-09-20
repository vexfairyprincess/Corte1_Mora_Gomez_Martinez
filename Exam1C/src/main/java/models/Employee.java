package models;

import java.util.Objects;

public class Employee {
    private String id;
    private String names;
    private String lastNames;
    private int age;
    private double baseSalary;
    public static final int INCENTIVE = 300;

    public Employee() {
    }

    public Employee(String id, String names, String lastNames, int age, double baseSalary) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String id, String names, String lastNames, int age, double baseSalary, int incentive) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id='").append(id).append('\'');
        sb.append(", names='").append(names).append('\'');
        sb.append(", lastNames='").append(lastNames).append('\'');
        sb.append(", age=").append(age);
        sb.append(", baseSalary=").append(baseSalary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(baseSalary, employee.baseSalary) == 0 && Objects.equals(id, employee.id) && Objects.equals(names, employee.names) && Objects.equals(lastNames, employee.lastNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, names, lastNames, age, baseSalary);
    }
}
