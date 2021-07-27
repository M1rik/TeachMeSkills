package Unit2;

public class Unit2Task7 {

    public static void test(){

        int result = 0;

        for(int i = 1; i<=100; i++){
            if(i%2 ==0){
                continue;
            }
            result +=i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        test();
    }
}
