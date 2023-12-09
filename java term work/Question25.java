/* Initlize integer array of any size containg values 0 and 1 only.
Now check which is longest series of either 0 or 1 ,which is existing.
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,0,0,1,1,1}
Ans is 0 and length is 5
If there is same series of 0 and 1 then ans will which is existing first
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,1,1,1}
Ans is 1 and length is 3
As 1,1,1 comming first before 0,0 0
 */

public class Question25 {
    
    public static void main(String[] args) {
        int a[] = {1,1,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        // int a[] = {0,0,0,1,1,1,0,0,1,1,1,1,0,0,0,0,0,1,1,1,1,1};
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();

        int count0 = 1;
        int count1 = 1;

        int store0 = 1;
        int store1 = 1;
        // System.out.println(a.length);
        int last = 0;

        for(int i = 0 ; i < a.length-1; i++){ 
            last++;
            if(last == a.length-1){
            }
            if(a[i] == a[i+1]){
                if(a[i] == 1 && a[i+1] == 1){
                        count1++;
                }
                else if(a[i] == 0 && a[i+1] == 0){
                        count0++;
                        
                }
            }
            if(a[i] != a[i+1] || last == a.length-1){ // yahan hum do condition me pahunchenge ya to Array a[i] == a[i+1] na ho ro array last ho gya ho
                if(count1 > store1){
                    store1 = count1;
                    count1 = 1;
                }
                else if(count0 > store0){
                    store0 = count0;
                    count0 = 1;
                }
                else{
                    count0 = 1;
                    count1 = 1;
                }
            }
            
        }

        if(store1 > store0){
            System.out.println("Ans is 1 and length is "+store1);
        }
        else if(store0 > store1){
            System.out.println("Ans is 0 and length is "+store0);
        }
        else{ // if we are in else part it is sure that the length of 0 and 1 are same so write logic for this situation
            count0 = 1;
            count1 = 1;
            for(int i = 0 ; i < a.length-1; i++){
            if(a[i] == a[i+1]){
                if(a[i] == 1 && a[i+1] == 1){
                        count1++;
                        if(count1 == store1){
                            System.out.println("Ans is 1 and length is "+store1);
                            break;
                        }
                       
                }
                else if(a[i] == 0 && a[i+1] == 0){
                        count0++;
                        if(count0 == store0){
                            System.out.println("Ans is 0 and length is "+store0);
                            break;
                        }
                }
            }
            else{
                    count0 = 1;
                    count1 = 1;
                }

        }
    }
}
}
