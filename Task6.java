import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Regem daxil edin:");
        int regem = sc.nextInt();
        int[][] array = new int[regem][regem];

        int sira = 0;
        int sutun = 0;
        int maxsira = regem - 1;
        int maxsutun = regem - 1;
        int value = 0;

value++;
       while(value<=regem*regem) {



           for (int i = sutun; i <= maxsutun; i++) {


               array[sira][i] = value;
               value++;



           }

          for (int i = sira + 1; i <= maxsira; i++) {

              System.out.println(i + "------ Yazdirildi" + maxsira);

              array[i][maxsutun] = value;
              value++;

          }



           for (int i = maxsutun - 1; i >= sira; i--) {

               array[maxsira][i] = value;
               value++;

           }

           for (int i = maxsira - 1; i >= sira + 1; i--) {

               array[i][sutun] = value;
               value++;


           }


           sira++;
           sutun++;
           maxsutun--;
           maxsira--;

       }



        for (int i = 0; i<array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
