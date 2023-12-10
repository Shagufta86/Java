package com.employee;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        System.out.println("Employee Management Application");
        EmployeeData Data = new EmpDataImp();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add Employee\n" + "2. Show All Employee\n" + "3. Show Employee based on id\n" + "4. Update the employee\n" + "5. Delete the employee\n");

            System.out.println("Enter Option: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter ID : ");
                    id = sc.nextInt();
                    System.out.println("Enter Name : ");
                    name = sc.next();
                    System.out.println("Enter Salary");
                    double salary = sc.nextDouble();
                    System.out.println("Enter Age");
                    int age = sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    Data.createEmployee(emp);
                    break;
                case 2:
                    Data.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id to show the details");
                    int empid = sc.nextInt();
                    Data.showEmployeeBasedOnID(empid);
                    break;
                case 4:
                    System.out.println("Enter id to update the detils");
                    int empid1 = sc.nextInt();
                    System.out.println("Enter the new name");
                    name = sc.next();
                    Data.updateEmployee(empid1,name);
                    break;
                case 5:
                    System.out.println("Enter the id to delete");
                    id = sc.nextInt();
                    Data.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;
            }
        }while (true);

    }
}
