package com.Maktab;

import java.util.Scanner;

public class Main {
    static int lastIndex = 0;
    static Scanner sc = new Scanner(System.in);
    static Employee[] employee = new Employee[1];

    public static void main(String[] args) {
        boolean continues = true;
        while (continues) {
            System.out.println("1. add employee ");
            System.out.println("2.employee[id] add wife or husband?");
            System.out.println("3.employee[id] is married?");
            System.out.println("4.employee[id] is invited?");
            System.out.println("5.list invited employee");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 -> {
                    addEmployee();
                }
                case 2 -> addSpouse();
                case 3 -> isMarried();
                case 4 -> isInvited();
                case 5 -> printInvited();
                case 6 -> continues = false;
            }
        }


    }

    public static Employee[] resize(Employee[] employees) {
        Employee[] newEmployee = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployee[i] = new Employee();
            newEmployee[i] = employees[i];

        }
        lastIndex++;
        return newEmployee;
    }

    public static void addEmployee() {
        employee[lastIndex] = new Employee();
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name : ");
        String name = sc.nextLine();
        System.out.println("Enter employee family: ");
        String family = sc.nextLine();
        System.out.println("Enter employee gender : ");
        String gender = sc.nextLine();
        System.out.println("Enter employee location x : ");
        double locationx = sc.nextFloat();
        System.out.println("Enter employee location y : ");
        double locationy = sc.nextFloat();
        sc.nextLine();
        employee[lastIndex] = new Employee(id, name, family, gender, new Location(locationx, locationy));
        employee = resize(employee);
    }

    public static void addSpouse() {
        System.out.println("Enter first employee id : ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second employee id : ");
        int id2 = sc.nextInt();
        sc.nextLine();
        int a = 0, b = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (employee[i].getId() == id1)
                a = i;
            if (employee[i].getId() == id2)
                b = i;
        }
        employee[a].setSpouse(employee[b]);
        employee[b].setSpouse(employee[a]);
    }

    public static void isMarried() {
        System.out.println("Enter employee id : ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < lastIndex; i++) {
            if (employee[i].getId() == id)
                if (employee[i].isMarried())
                    System.out.println("this employee is married ");
                else System.out.println("this employee is not married ");

        }

    }

    public static void isInvited() {
        System.out.println("Enter employee id : ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < lastIndex; i++) {
            if (employee[i].getId() == id)
                if (employee[i].getLocation().getDistance() >= 30)
                    System.out.println("this employee isInvited ");
                else
                    System.out.println("this employee is not Invited ");
        }
    }

    public static void printInvited() {
        for (int i = 0; i < lastIndex; i++) {
            if (employee[i].getLocation().getDistance() >= 30)
                System.out.println(employee[i].toString());
        }
    }

}
