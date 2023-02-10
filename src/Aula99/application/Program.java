package Aula99.application;

import Aula99.entities.Employee;

import java.util.Scanner;
import java.util.ArrayList;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            if (employeeExists(id, employees)) {
                System.out.println("Employee with id " + id + " already exists. Please enter a unique id.");
                i--;
            } else {
                Employee employee = new Employee(id, name, salary);
                employees.add(employee);
            }
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percent = sc.nextDouble();

        Employee employee = getEmployeeById(id, employees);

        if (employee == null) {
            System.out.println("Employee with id " + id + " not found.");
        } else {
            employee.increaseSalary(percent);
        }

        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        sc.close();
    }
    public static boolean employeeExists(int id, ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static Employee getEmployeeById(int id, ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}