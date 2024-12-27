package com.codewithsuresh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee salariedEmployee = new SalariedEmployee("Suresh", 1, 125);
        salariedEmployee.printEmployeeDetails();
        System.out.println("Monthly Salary :" + salariedEmployee.calculateSalary());

        Employee hourlyEmployee = new HourlyEmployee("Ramesh", 1, 125, 500);
        hourlyEmployee.printEmployeeDetails();
        System.out.println("Monthly Salary :" + hourlyEmployee.calculateSalary());

        }
    }