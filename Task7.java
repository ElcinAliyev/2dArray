public class Task7 {
    public static void main(String[] args) {
        int [][] array={{1,2,3,4,5},
                        {4,1,2,3,4},
                        {6,4,1,2,7},
                        {7,6,4,1,2}};



        for (int i = 0; i < array.length; i++) {
            int l=0;
            for (int k = 0; k < array.length-1-i; k++) {
                int z=l;
                int t=i;
                for (; l < array.length-1-i; l++) {
                    if(array[i][l]==array[i+1][l+1]){
                        i++;
                    }
                    else {
                        System.out.println("Sehvlik var!!!");
                        break;
                    }

                }
                i=t;
                l=z;
                l++;





            }
        }



    }
}
