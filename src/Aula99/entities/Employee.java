package Aula99.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public String toString() {
        return "Employee #" + (id + 1) + ", Id: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}