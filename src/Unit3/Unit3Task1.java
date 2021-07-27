package Unit3;

public class Unit3Task1 {
    public static void main(String[] args) {
        int[] muss = new int[10];
        for(int i = 2, j = 0; j < muss.length;i+=2){
            muss[j] = i;
            j++;
        }
        for(int i = 0; i<muss.length;i++){
            System.out.print(muss[i] + " ");
        }
        System.out.println();

        for(int i = 0; i<muss.length;i++){
            System.out.println(muss[i]);
        }

    }
}
