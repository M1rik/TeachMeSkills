package Unit7;

import Unit7.hands.SamsungHand;
import Unit7.hands.SonyHand;
import Unit7.hands.ToshibaHand;
import Unit7.heads.SamsungHead;
import Unit7.heads.SonyHead;
import Unit7.heads.ToshibaHead;
import Unit7.legs.SamsungLegs;
import Unit7.legs.SonyLegs;
import Unit7.legs.ToshibaLegs;

public class Run {

    public void howMuch(Robot r1, Robot r2, Robot r3){
        if(r1.getPrice() > r2.getPrice() && r1.getPrice() > r3.getPrice()){
            System.out.println("наибольшая цена у 1 робота");
        }else if(r2.getPrice() > r1.getPrice() && r2.getPrice() > r3.getPrice()){
            System.out.println("наибольшая цена у 2 робота");
        }else if(r3.getPrice() > r1.getPrice() && r3.getPrice() > r2.getPrice()){
            System.out.println("наибольшая цена у 3 робота");

        }else{
            System.out.println("цены равны");

        }
    }
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SamsungHand samsungHand = new SamsungHand(100);
        SamsungHead samsungHead = new SamsungHead(250);
        SamsungLegs samsungLegs = new SamsungLegs(120);
        SonyHand sonyHand = new SonyHand(110);
        SonyHead sonyHead = new SonyHead(260);
        SonyLegs sonyLegs = new SonyLegs(115);
        ToshibaHand toshibaHand = new ToshibaHand(105);
        ToshibaHead toshibaHead = new ToshibaHead(255);
        ToshibaLegs toshibaLegs = new ToshibaLegs(110);

        Robot r1 = new Robot(samsungHead,sonyHand, toshibaLegs);
        Robot r2 = new Robot(sonyHead,samsungHand,toshibaLegs);
        Robot r3 = new Robot(toshibaHead,toshibaHand,samsungLegs);
        r1.action();
        System.out.println();
        r2.action();
        System.out.println();
        r3.action();
        Run run = new Run();
        run.howMuch(r1,r2,r3);



    }
}
