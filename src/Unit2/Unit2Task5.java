package Unit2;

public class Unit2Task5 {

    public static void test(){
        double cm = 20;
        double in = 2.54;

        for(int i = 1; i <= cm; i++){
            System.out.println(i + " in = " + (i * in) + " cm");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
