package _06_inheritance_examples.employee_example;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    public void methodUniqueToSalariedEmployeeClass() {

    }

    @Override
    public String toString() {
        String nameAndHireDate = super.toString();
        return nameAndHireDate + " " +
                "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
