import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("1-c massiv Nece setirli massiv olsun?");
        Scanner sc=new Scanner(System.in);
        int setir =sc.nextInt();
        System.out.println("1-ci massiv Nece Sutunlu massiv olsun");
        int sutun =sc.nextInt();

        int [][] array= new int[setir][sutun];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]=(int)(Math.random()*10);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2-ci massiv Nece setirli massiv olsun?");
        int setir2 =sc.nextInt();
        System.out.println("2-ci massiv Nece Sutunlu massiv olsun");
        int sutun2 =sc.nextInt();

        int [][] secondarray= new int[setir2][sutun2];
        for (int i = 0; i < secondarray.length; i++) {
            for (int j = 0; j < secondarray[0].length; j++) {
                secondarray[i][j]=(int)(Math.random()*10);
                System.out.print(secondarray[i][j]+" ");
            }
            System.out.println();
        }
           int [][] result=new int[setir][sutun];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j]=(array[i][j]+secondarray[i][j]);

            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }




    }
}
