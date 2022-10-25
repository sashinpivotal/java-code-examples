package _06_inheritance_examples.employee_example;

import java.time.LocalDate;

public class AnotherChildClassofEmployee extends Employee{
    public AnotherChildClassofEmployee(String name,
                                       LocalDate hireDate) {
        super(name, hireDate);
    }
}
