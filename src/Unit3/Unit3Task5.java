package Unit3;

import java.util.Random;

public class Unit3Task5 {

    public static void main(String[] args) {

        Random r = new Random();
        int summa1 = 0;
        int summa2 = 0;
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        for(int i = 0; i < mas1.length; i++){
            mas1[i] = r.nextInt(15);
            System.out.print(mas1[i] + " ");
            summa1 += mas1[i];
        }
        System.out.println();

        for(int i = 0; i < mas2.length; i++){
            mas2[i] = r.nextInt(15);
            System.out.print(mas2[i] + " ");
            summa2 += mas2[i];
        }
        System.out.println();

        System.out.println("сумма первого массива: " + summa1);
        System.out.println();
        System.out.println("сумма второго массива: " + summa2);
        System.out.println();

        if(summa1 > summa2){
            System.out.println(summa1);
        }else if(summa2 > summa1){
            System.out.println(summa2);
        }else {
            System.out.println("числа равны");
        }
    }
}
