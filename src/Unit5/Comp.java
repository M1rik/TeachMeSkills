package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Comp {

    String proc;
    String oper;
    String ssd;
    int resource;
    boolean bool = true;

    public Comp(String proc, String oper, String ssd, int resource) {
        this.proc = proc;
        this.oper = oper;
        this.ssd = ssd;
        this.resource = resource;
    }

    Random r = new Random();
    Scanner scanner = new Scanner(System.in);


    void showInfo(Comp c) {
        System.out.println("Процуссор: " + proc + " Оперативная память: " + oper + " Жесткий диск: " + ssd);
    }

    void turnON() {
        int a = r.nextInt(2);
        System.out.println("Введите число для того что бы включить");
        if(scanner.hasNextInt(2)){
            int b = scanner.nextInt();
            if (a == b) {
                System.out.println("Comp die");
                bool = false;
            } else {
                System.out.println("Comp switched on");
            }
        }else {
            System.out.println("Вы ввели что-то не то");
        }
    }

    void turnOff() {
        int a = r.nextInt(2);
        System.out.println("Введите число для того что бы выключить");
        if(scanner.hasNextInt()){
            int b = scanner.nextInt();
            if (a == b) {
                System.out.println("Comp die");
                bool = false;
            } else {
                System.out.println("Comp switched off");
                resource--;
            }
        }else {
            System.out.println("Вы ввели что-то не то");
        }

    }
}

class CompTest{
    public static void main(String[] args) {
        Comp c1 = new Comp("i5", "16gb", "500gb", 5);
        c1.showInfo(c1);
        c1.turnON();
        c1.turnOff();



        }
    }

