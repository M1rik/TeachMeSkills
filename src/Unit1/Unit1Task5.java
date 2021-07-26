package Unit1;

public class Unit1Task5 {
    public static void test(int a, int b, int c){
        int count = 0;
        int count1 = 0;
        if(a>=0){
            count++;
        }else {
            count1++;
        }
        if(b>0){
            count++;
        }else {
            count1++;
        }
        if(c>0){
            count++;
        }else {
            count1++;
        }
        System.out.println("количество положительных чисел равно: " + count);
        System.out.println("количество отрицательных чисел равно: " + count1);
    }

    public static void main(String[] args) {
        test(0,-1,-5);
    }
}
