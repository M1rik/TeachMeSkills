package Unit2;

public class Unit2Task4 {

    public static void test(int a, int b){

        int result = 0;
        for(int i = 0; i < b; i++){
            result += a;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        test(6,5);
    }
}
