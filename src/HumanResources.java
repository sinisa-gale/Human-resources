/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sinisa
 */

public class HumanResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The appliacation is starting...");
        Department logistic = new Department("Logistics");
        System.out.println("Information about department");
        System.out.println(logistic.toString());
        Employee john = new Employee(225, "John Smith", 220.52);
        Employee mike = new Employee(100, "Mike Smith", 285.52);
        Employee steve = new Employee(560, "Steve Smith", 520.52);
        logistic.addEmployee(john);
        logistic.addEmployee(mike);
        logistic.addEmployee(steve);
        try {
        for(Employee item: logistic.getEmployees()) {
            if (item != null) {System.out.println(item);}
        }
        } catch(IllegalArgumentException ex) {
            System.out.println("Catched");
        }
        System.out.println("Total salary: " + logistic.totalSalary());
        System.out.println("Average salary: " + logistic.averageSalary());
    }
    
}
