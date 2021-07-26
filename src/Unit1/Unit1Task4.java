package Unit1;

public class Unit1Task4 {
    public static void test(int a, int b, int c){
        int count = 0;
        if(a>0){
            count++;
        }
        if(b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        System.out.println("количество положительных чисел равно: " + count);
    }

    public static void main(String[] args) {
        test(-1,-1,3);
    }
}
