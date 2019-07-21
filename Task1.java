import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Matrix nece setirli olsun?");
        Scanner sc=new Scanner(System.in);
        int setir=sc.nextInt();
        System.out.println("Matrix nece sutunlu olsun?");
        int sutun=sc.nextInt();

        int[][] array =new int[setir][sutun];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*10);
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2==0){
                    System.out.println("array["+i+"]["+j+"]= "+array[i][j]);
                }
            }
        }
    }
}
