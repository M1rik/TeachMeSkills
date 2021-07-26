package Unit4;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] mas = new int[a][a];
        Random r = new Random();
        int summa = 0;

        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length; j++){
                mas[i][j] = r.nextInt(50);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < mas.length; i++){
            if(mas[i][i]%2 ==0){
                summa += mas[i][i];
            }
        }
        System.out.println("Сумма чётных чисел: " + summa);
    }
}
