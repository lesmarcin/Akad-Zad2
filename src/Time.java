import java.util.Random;

public class Time {
    public static void main(String[] args) {

        long timeBefore1;
        long timeAfter1;
        long result1;

        int[] table = {10, 9, 8, 6, 5, 3, 2, 1};
        int num = 5;

        timeBefore1 = System.nanoTime();
        for (int i=0; i<table.length; i++) {
            if (table[i] == num) {
            }
        }
        timeAfter1 = System.nanoTime();
        result1 = timeAfter1 - timeBefore1;
        System.out.println(result1);

        /*--------------------------------------------*/

        long timeBefore2;
        long timeAfter2;
        long result2;

        Random random = new Random();
        int[] table2 = new int[10000];

        for (int i=0; i<table2.length; i++) {
            table2[i] = random.nextInt(50);
        }
        timeBefore2 = System.nanoTime();
        for (int i=0; i<table2.length; i++) {
            if (table2[i] == num) {
            }
        }
        timeAfter2 = System.nanoTime();
        result2 = timeAfter2 - timeBefore2;
        System.out.println(result2);
    }
}
