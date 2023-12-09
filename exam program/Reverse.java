

public class Reverse {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,15,17,18,56,98,91,75};

        Reverse r = new Reverse();
        int b[] =r.reverse(a);

        for(int i = 0; i < b.length;i++){
            System.out.print(b[i] + "  ");
        }
    }

    int [] reverse(int a[]){
        // System.out.println("hi");
        // System.out.println(a.length);
       int c = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                c++;
            }
        }

        int arr[] = new int[c];

        int j = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                arr[j] = a[i];
                j++;
            }
        }
        return (arr);
    }
}
