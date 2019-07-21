import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem=sc.nextInt();
        int[][] array =new int[regem][regem];
        int z=0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            j=i;
            for (; j < array[i].length; j++) {
                z++;
                array[i][j]=z;

            }
            for (int k = 0; k < i; k++) {
                z++;
             array[i][k]=z;
            }



        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }
    }
}
