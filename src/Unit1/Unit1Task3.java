package Unit1;

public class Unit1Task3 {
    public static void Test(int a){
        if(a > 0){
            System.out.println(a += 1);
        }else if(a < 0 ){
            System.out.println(a -= 2);
        }else if(a == 0){
            System.out.println(a += 10);
        }
    }

    public static void main(String[] args) {
        Test(0);
    }
}
