package com.bridgelabz.employee_wage;

public class EmployeeWageSwitchCase {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 8;
    public static final int PART_TIME = 4;
    public static final int TOTAL_WORKING_DAYS = 20;

    public static void main(String[] args) {

        int workdays = 0;
        int empWage = 0;
        while (workdays <= TOTAL_WORKING_DAYS) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full time Present");
                    empWage = FULL_TIME * EMPLOYEE_WAGE_PER_HOUR;
                    System.out.println("Employee wage is: " + empWage);
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part time Present");
                    empWage = PART_TIME * EMPLOYEE_WAGE_PER_HOUR;
                    System.out.println("Employee wage is: " + empWage);
                    break;
                default:
                    System.out.println("Employee is Absent");
                    System.out.println("Employee wage is: " + empWage);
            }
            System.out.println("Employee wage for Day #" + workdays + " =>  " + empWage);
            workdays++;
        }
    }
}
