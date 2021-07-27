package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task5 {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] mas = new int[a][a];
        Random r = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = r.nextInt(50);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if(j>i){
                    int b = mas[i][j];
                    mas[i][j] = mas[j][i];
                    mas[j][i] = b;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
