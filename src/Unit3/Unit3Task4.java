package Unit3;

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mas = new int[20];
        int index = 0;

        for(int i = 0; i < mas.length; i++){
            mas[i] = r.nextInt(20);
            if(i %2 ==0 && i != 0){
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
    }
}
