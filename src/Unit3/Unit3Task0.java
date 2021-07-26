package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {

    public static void main(String[] args) {

        System.out.println("Введите количество элементов массива");
        Scanner sc = new Scanner(System.in);
        int[] muss = new int[sc.nextInt()];
        Random r = new Random();

        for(int i = 0;i< muss.length;i++){

            muss[i] = r.nextInt(50);
            System.out.print(muss[i] + " ");
        }
    }
}
