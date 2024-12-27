package com.codewithsuresh;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public abstract double calculateSalary();

}

class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, int id, double salary){
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }


}

class HourlyEmployee extends Employee{

    private int hours;
    private double amountPerHour;

    public HourlyEmployee(String name, int id, int hours, int amountPerHour){
        super(name, id);
        this.hours = hours;
        this.amountPerHour = amountPerHour;
    }

    @Override
    public double calculateSalary(){
        return hours*amountPerHour;
    }
}

