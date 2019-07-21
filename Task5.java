import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Regemi daxil edin:");
        int regem=sc.nextInt();


        int[][] array=new int[regem][regem];

        int k=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                k++;
                array[i][j]=k;
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }

    }
}
