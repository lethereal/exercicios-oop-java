package com.company;

public class Main
{
    public static void main(String[] args)
    {
        double employeeGross = 0;

        com.company.Employee newEmployee = new com.company.Employee();

        employeeGross = newEmployee.requestGross();
        System.out.println ("The employee's gross pay is: " + employeeGross);
    }
}

