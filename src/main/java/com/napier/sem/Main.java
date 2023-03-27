package com.napier.sem;


public class Main {

    public static void main(String[] args) {
        // Create new Application
        App a = new App();

        // Connect to database
            a.connect();

        // Get Employee
        Employee emp = a.getEmployee(255531);
        // Display results
        a.displayEmployee(emp, "EmployeesNames.md");

        // Disconnect from database
        a.disconnect();

    }
}