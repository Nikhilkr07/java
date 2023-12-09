// Write a program to initialize 2-D uneven integer array.After initializing 2d array convert into 1d array then print it and reverse order. 

public class ConvertIn1Darray {
    public static void main(String[] args) {
        int [][] a = {{1,2},{3,4,5,6},{7,8,9}};
        
        int c = 0;
        for(int []i : a){
            for(int j: i){
                c++;
            }
        }
       
        int arr[] = new int[c];

        int ac = 0;
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0 ; j < a[i].length; j++){
                arr[ac] = a[i][j];
                ac++;
            }
        }

          for(int i : arr){
             System.out.print(i+"  ");  
        }
        // print in reverse order

        for(int i = arr.length-1; i >= 0 ; i--){
            System.out.print(arr[i]+ "  ");
        }

    }
}
