package lesson3;

import java.util.Scanner;

public class FirstTask {
    public static void firstScanner () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.next();
        System.out.println("Enter your Surname :");
        String surname = scanner.next();
        System.out.println(" Enter your Age : ");
        int age = scanner.nextInt();
        System.out.println("Enter your Email : ");
        String Email = scanner.next();
        System.out.println("Enter additional info : ");
        String info = scanner.next(); // NextLine не работает...
        System.out.println("Your name : " + name);
        System.out.println("Your surname : " + surname);
        System.out.println("Your age : " + age);
        System.out.println("Your Email : " + Email);
        System.out.println("Your additional info : " + info);



    }
}
