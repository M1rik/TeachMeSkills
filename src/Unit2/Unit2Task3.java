package Unit2;

public class Unit2Task3 {
    public static void test(int a){
        int sum = 0;
        for(int i = 1; i<=a; i++){
            if(i%2 == 1){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        test(256);
    }
}
