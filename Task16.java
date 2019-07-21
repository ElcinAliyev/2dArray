import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem=sc.nextInt();
        int[][] array=new int[regem][regem];
         int k=0;
        for (int i = 0; i <array.length ; i++) {
            if (i%2==0){
                for (int j = 0; j < array[i].length; j++) {
                    k++;
                    array[j][i]=k;
                }

            }
            else {
                for (int j = (regem-1); j >= 0; j--) {
                    k++;
                    array[j][i]=k;

                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
