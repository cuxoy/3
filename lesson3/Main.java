package lesson3;

import java.util.Random;

import static lesson3.MathClass.Sub;

public class Main {
    public static void main(String[] args) {
        FirstTask.firstScanner();

        Lottery.newLottery();

        Salary.mySalary();

        Employee employee1 = new Employee();
        employee1.salary = 2000;
        employee1.position = "head";
        employee1.age = 35;
        Employee employee2 = new Employee();
        employee2.salary = 2000;
        employee2.position = "head";
        employee2.age = 35;

        System.out.println(employee1== employee2);
        System.out.println(employee1.equals(employee2));




        int result = MathClass.Add(5, 6, 7);
        System.out.println("Sum result : " + result);
        long result1 = MathClass.Sub(10, 5, 3);
        System.out.println("Sub result : " + result1);
        MathClass mathClass = new MathClass();
        double result2 = mathClass.Mult(3, 4, 5.3);
        System.out.println("Mult result : " + result2);
        MathClass mathClass1 = new MathClass();
        double result3 = mathClass.Div(100, 2, 3.3);
        System.out.println("Div result : " + result3);


    }}

