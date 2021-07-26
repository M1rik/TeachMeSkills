package Unit3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int count = 0;
        int[] muss = new int[15];

        for(int i = 0; i < muss.length; i++){
            muss[i] = r.nextInt(99);
            if(muss[i] % 2 ==0){
                count++;
            }
            System.out.print(muss[i] + " ");
        }
        Arrays.toString(muss);
        System.out.println("количество чётных числе: " + count);

    }
}
