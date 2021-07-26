package Unit1;

public class Unit1Task1 {

    public static void numb (int a){
        if(a>0){
            System.out.println("число положительное");
            String s1 = Integer.toString(a);
            System.out.println("количество цифр в числе: " + s1.length());

        }else {
            System.out.println("число отрицательное");
            String s1 = Integer.toString(a);
            System.out.println("количество цифр в числе: " + (s1.length() - 1));

        }
    }
    public static void main(String[] args) {
        numb(213546);

    }
}
