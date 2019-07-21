import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem=sc.nextInt();
        int[][] array=new int[regem][regem];
        int j=0;
        int k=0;

        for (int i = 0; i < array.length; i++) {
            j=i;
            for (  ; j < array[i].length; j++) {
                k++;
                array[i][j]=k;
            }

        }


        for (int i = 0; i < array.length; i++) {
            for (int l = 0; l <i ; l++) {
                k++;
                array[i][l]=k;
            }
        }

       for (int i = 0; i < array.length; i++) {
            for (int l = 0; l < array[i].length; l++) {
                System.out.print(array[i][l]+" ");
            }
            System.out.println();
        }


    }
}
