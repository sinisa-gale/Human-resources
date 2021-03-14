/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sinisa
 */
public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        boolean emptyArr = true;
        for (Employee item : this.employees) {
            if (item != null) {
                emptyArr = false;
                break;
            }
        }
        if (emptyArr) {
            throw new IllegalArgumentException("Array is empty");
        } else {
            return employees;
        }
    }

    public int numberOfEmployees() {
        int counter = 0;
        for (Employee item : this.employees) {
            if (item != null) {
                counter++;
            }
        }
        return counter;
    }

    public void addEmployee(Employee employee) {
        boolean added = false;
        for (int i = 0; i < 10; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Department capacity is full. " + employee.getName() + " can't be added.");
        }
    }

    public Employee findEmployee(int ident) {
        for (Employee item : this.getEmployees()) {
            if (item.getIdNumber() == ident) {
                return item;
            } else {
            }
        }
        return null;
    }

    public double totalSalary() {
        double total = 0;
        for (Employee item : this.getEmployees()) {
            if (item != null) {
                total += item.getSalary();
            }
        }
        return total;
    }

    public double averageSalary() {
        double average;
        average = (this.numberOfEmployees() == 0) ? 0 : this.totalSalary() / this.numberOfEmployees();
        return average;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department: " + this.getName();
    }

}
