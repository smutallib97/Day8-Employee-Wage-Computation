package com.bridgelabz.employee_wage;

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMPLOYEE_WAGE_PER_HOUR = 20;
        int empHRS = 8;
        int empWAGE = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
            empHRS = 0;
        }
        empWAGE = empHRS * EMPLOYEE_WAGE_PER_HOUR ;
        System.out.println("Employee wage is "+ empWAGE);
    }
}
