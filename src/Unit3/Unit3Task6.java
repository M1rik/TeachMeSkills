package Unit3;

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {

        Random r = new Random();
        boolean b = true;
        int[] array = new int[4];

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < array.length -1; i++){
            if(array[i + 1]> array[i]){
                b = true;
            }else {
                b = false;
                break;
            }
        }

        if(b == true){
            System.out.println("массив строго возрастающий");
        }else{
            System.out.println("массив не строго возрастающий");
        }
    }
}
