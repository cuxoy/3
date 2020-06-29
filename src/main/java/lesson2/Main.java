package lesson2;

import java.util.Arrays;

public class Main {
    /**
     * @param args КОММЕНТАРИЙ
     */
    public static void main(String[] args) {
        int var = 1;
        System.out.println(var--);
        System.out.println(var++);
        System.out.println(var--);
        System.out.println(++var);
        System.out.println(var++);
        System.out.println(var--);
        System.out.println(var--);
        System.out.println(++var);

        int a = 2;
        long b = 3;
        short c = 4;
        double d = 5.5;
        double e = 6.6;
        float f = 7.7f;

        int c2 = c;
        double e2 = f;
        long a2 = a;

        double sum = a + b + c + d + e + f;
        String str = Double.toString(sum);
        System.out.println(str);
        //КОММЕНТАРИЙ
        /*КОММЕНТАРИЙ*/
        //TODO: КОММЕНТАРИЙ

        int[] ints = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println(Arrays.toString(ints));
        ints[0] = ints[0] - 2;
        ints[2] = ints[2] - 2;
        ints[4] = ints[4] - 2;
        ints[6] = ints[6] - 2;
        ints[8] = ints[8] - 2;
        ints[1] = ints[1] * 2;
        ints[3] = ints[3] * 2;
        ints[5] = ints[5] * 2;
        ints[7] = ints[7] * 2;
        ints[9] = ints[9] * 2;

        System.out.println(Arrays.toString(ints));

        int[][] ints1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(ints1));
        ints1[0][0] = 9;
        ints1[0][1] = 8;
        ints1[0][2] = 7;
        ints1[1][0] = 6;
        ints1[1][1] = 5;
        ints1[1][2] = 4;
        ints1[2][0] = 3;
        ints1[2][1] = 2;
        ints1[2][2] = 1;
        System.out.println(Arrays.deepToString(ints1));










    }
}