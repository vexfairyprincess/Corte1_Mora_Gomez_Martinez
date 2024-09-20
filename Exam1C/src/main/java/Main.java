import models.Clerk;
import models.Dealer;
import models.Commercial;
import models.Employee;
import models.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Interface {
    private List<Employee> employees;

    public Main() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void showEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main mainApp = new Main();

        // Example: Adding Employees
        mainApp.addEmployee(new Clerk("C001", "Silvio", "Mora", 35, 2000, "Manager"));
        mainApp.addEmployee(new Clerk("C002", "Douglas", "Gomez", 28, 1800, "Employee"));
        mainApp.addEmployee(new Dealer("D001", "Andres", "Martinez", 22, 1500, "Ciudad Sandino"));
        mainApp.addEmployee(new Commercial("CM001", "Jose", "Duran", 31, 2500, 400));


        System.out.println("Employees:");
        mainApp.showEmployee();


        for (Employee employee : mainApp.employees) {
            double finalSalary;

            if (employee instanceof Clerk) {
                Clerk clerk = (Clerk) employee;
                finalSalary = clerk.getBaseSalary();
                if (clerk.getCharge().equalsIgnoreCase("Manager")) {
                    finalSalary += 0.2 * Employee.INCENTIVE;
                } else {
                    finalSalary += 0.8 * Employee.INCENTIVE;
                }
                finalSalary *= 0.93; // Deduct 7% for social security
            } else if (employee instanceof Dealer) {
                finalSalary = ((Dealer) employee).calculateSalary();
            } else if (employee instanceof Commercial) {
                finalSalary = ((Commercial) employee).calculateComission();
            } else {
                finalSalary = 0;
            }

            System.out.println("Employee: " + employee.getNames() + " " + employee.getLastNames() + ", Final Salary: " + finalSalary);
        }

        scanner.close();
    }
}
