package Unit2;

public class Unit2Task0 {
    public static void test1(){
        for(int i = 1;i < 11; i++){
            System.out.print(i + " ");
        }
    }

    public static void test2(){
        int i = 1;
        while(i<11){
            System.out.print(i + " ");
            i++;
        }
    }

    public static void test3(){
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while(i<11);
    }


    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
    }
}
