package lesson3;

import java.util.Random;

public class Salary {
    public static void mySalary () {
        System.out.println("Задание номер 5, зарплата : ");
        double randomMath = Math.random();
        System.out.println((int) (randomMath + 4000) + "$");

        Random random = new Random();
        int randomRan = random.nextInt(1000)+3001;
        System.out.println(randomRan + "$");



    }

}
