import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        System.out.println("Regemi daxil edin:");
        int regem =sc.nextInt();
        int[][] array =new int[regem][regem];
        int k=(regem*regem);

        for (int i = 0; i < array.length; i++) {
            for (int j =0; j < array[i].length; j++) {
                array[i][j]=k;
                k--;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
