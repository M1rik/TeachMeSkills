package Unit2;

public class Unit2Task2 {
    public static void test(){
        int a = 1;
        for(int i = 3; i<=24;i+=3){
            System.out.println(" " + i + " " + (a*=2));
        }
    }

    public static void main(String[] args) {
        test();
    }
}
