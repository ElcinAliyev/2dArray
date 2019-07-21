import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Regem Girin:");
        int regem=sc.nextInt();
        int [][] array=new int[regem][regem];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=j;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
