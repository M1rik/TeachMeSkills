package Unit1;

public class Unit1Task6 {

    public static void test(int a, int b){
        if(a>b){
            System.out.println("Большее число: " + a);
        }else if(a == b){
            System.out.println("Числа равны");
        }

        else {
            System.out.println("Большее число: " + b);
        }
    }
    public static void main(String[] args) {
        test(5,5);

    }
}
