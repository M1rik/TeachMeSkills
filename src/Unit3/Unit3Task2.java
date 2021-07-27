package Unit3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Unit3Task2 {
    public static void main(String[] args) {
        int[] muss = new int[50];

        for(int i = 1, j = 0; j< muss.length; i +=2){
            muss[j] = i;
            j++;
        }
        for (int i = 0; i < muss.length; i++){
            System.out.print(muss[i] + " ");
        }
        System.out.println();
    }
    }

