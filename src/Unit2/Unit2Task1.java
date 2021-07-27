package Unit2;

public class Unit2Task1 {
    public static void test(){
        double a = 6;
        double km = 0;
        double c = 10;
        for(double i = 1; i <=a;i++){
            km += c + (c *0.1);
            c+= c*0.1;
        }
        System.out.println(km + 10);
    }

    public static void main(String[] args) {
        test();
//        System.out.println(11 + (11 * 0.1));
    }
}
