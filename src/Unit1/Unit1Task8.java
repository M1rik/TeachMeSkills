package Unit1;

import java.util.Scanner;

public class Unit1Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");

        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        if (numb1 > numb2) {
            System.out.println("Большее число: " + numb1);
        } else if (numb1 == numb2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Большее число: " + numb2);
        }
    }
}
