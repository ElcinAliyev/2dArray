import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem =sc.nextInt();

        int [][] array =new int[regem][regem];

regem=regem-2;

        for (int i = 0; i < array.length-2; i++) {
            int j=i;
            for (; j < array[i].length-i; j++) {
                array[i][j]=regem;
                array[j][i]=regem  ;
                array[(array.length-i-1)][j]=regem;
                array[j][(array.length-1-i)]=regem;
            }
            regem--;


        }




        for (int a = 0; a <array.length ; a++) {
            for (int i = 0; i < array[a].length; i++) {
                System.out.print(array[a][i]+" ");
            }
            System.out.println();
        }
    }
}
