package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void newLottery () {
        Scanner playersNum = new Scanner(System.in);
        System.out.println("Сколько людей будут учавствовать в лотерее? :");
        int players = playersNum.nextInt();
        System.out.println(playersNum);

        Random random = new Random();//неизвестный текст в консоли
        int winner = random.nextInt(players) + 1;
        System.out.println(winner);
        System.out.println("Поздравляем участника под номером " + winner +" с победой!!!!");


        System.out.println("Задание нормер 4, математические примеры :");
        double sqrt = Math.sqrt(144);
        int abs1 = Math.abs(-100);
        int min = Math.min(10, 20);
        double max = Math.max(12.5, 12.7);
        double random1 = Math.random();
        double sin = Math.sin(30);
        double pi = Math.PI;
        double log = Math.log(0);

        System.out.println(sqrt);
        System.out.println(abs1);
        System.out.println(min);
        System.out.println(max);
        System.out.println(random1);
        System.out.println(sin);
        System.out.println(pi);
        System.out.println(log);


    }


}
