package com.company;
import java.util.Scanner;

public class Employee
{
    private String name;
    private double workHours;
    private double hourPay;
    private int vacationDays;
    private double grossPay;

    public Employee ()
    {
        Scanner scan = new Scanner(System.in);

        name = inputName (scan);
        System.out.println ("Employee name: " + name);

        workHours = inputWorkHours (scan);
        System.out.println ("Hours worked this month: " + workHours);

        hourPay = inputPay (scan);
        System.out.println ("Pay per hour worked: " + hourPay);

        vacationDays = inputVacation (scan);
        System.out.println ("Vacation days taken this month: " + vacationDays);

        grossPay = calculateGross(workHours, hourPay, vacationDays, scan);
    }

    public int inputWorkHours (Scanner scan)
    {
        int tempWorkHours = 0;

        System.out.println ("Please input the number of hours the employee has worked this month: ");
        do
        {
            tempWorkHours = scan.nextInt();
        }
        while (tempWorkHours <= 0);

        return tempWorkHours;
    }

    public String inputName(Scanner scan)
    {
        String tempName = "\0";
        System.out.println("Please input the employee's name: ");

        do
        {
            tempName = scan.nextLine();
        }
        while (tempName.isEmpty() == true);

        return tempName;
    }

    public double inputPay(Scanner scan)
    {
        double tempPay = 0;
        System.out.println ("Please input the employee's hourly pay: ");
        do
        {
            tempPay = scan.nextDouble();
        }
        while (tempPay <= 0);

        return tempPay;
    }

    public int inputVacation(Scanner scan)
    {
        int tempVacation = 0;
        System.out.println ("Input the number of vacations days the employee has taken: ");
        do
        {
            tempVacation = scan.nextInt();
        }
        while (tempVacation <= 0);

        return tempVacation;
    }

    public double calculateGross(double tempHours, double tempPay, int tempDays, Scanner Scan)
    {
        double tempGross = 0;
        double vacationHours = tempDays * 8;

        tempGross = ((tempHours - vacationHours) * tempPay);
        return tempGross;
    }

    public double requestGross ()
    {
        double tempGross = grossPay;
        return tempGross;
    }
}
