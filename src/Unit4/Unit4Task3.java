package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] mas = new int[a][a];
        Random r = new Random();
        int summa1 = 1;
        int summa2 = 1;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = r.nextInt(50);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            summa1 *= mas[i][i];
        }

        for (int i = 0; i < mas.length; i++) {
            int j = mas.length - 1 - i;
            summa2 *= mas[i][j];
        }
        System.out.println("произведение основной диагонали: " + summa1);
        System.out.println();
        System.out.println("произведение побочной диагонали: " + summa2);
        System.out.println();

        if(summa1 > summa2){
            System.out.println(summa1);
        }else if(summa2>summa1){
            System.out.println(summa2);
        }else{
            System.out.println("числа равны");
        }

    }
}
