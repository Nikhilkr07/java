// butterfly pattern

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(j=n;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }



        for(i=n;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print("* ");
            }
             for(j=n;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
