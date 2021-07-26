package Unit1;

public class Unit1Task2 {

    public static void test(int a, int b, int c){
        if(a > b+c){
            System.out.println("треугольник существует");
        }else if(b > a+c){
            System.out.println("треугольник существует");
        }else if(c > a+b){
            System.out.println("треугольник существует");
        }else {
            System.out.println("треугольник не существует");
        }
    }
    public static void main(String[] args) {
        test(3,6,3);

    }
}
