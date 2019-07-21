import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem=sc.nextInt();
        int[][] array=new int[regem][regem];

        int z=0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                z++;
              array[j][i]=z;
              int m=j;
                for (int k = 1; k <=m ; k++) {
                    z++;
                    j--;
                    array[j][k]=z;

                }
                j=m;

            }
        }


        int t=(regem*regem);
        for (int i = (array.length-1); i >=0; i--) {
            array[i][array.length-1]=t;
            t--;
            int a=i;
            for (int j = array.length-2; j >=a; j--) {
                 i++;
                array[i][j]=t;
                t--;


            }
            i=a;

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
