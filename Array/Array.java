//Work on 2D array
// It is a commbination of two 1-D Arrays 

public class Array {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{1,8,9,7,3,6},{7,8,20,15,36}};

        //How i printing 2-D array? There is two way to printing first is using nested for loop but it is complex to print the uneven array but here we can access array index , But in for each loop there is no way to access index value means we can not chnage index value using for each loop
        
        // Here is first way using nested for loop. 

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
