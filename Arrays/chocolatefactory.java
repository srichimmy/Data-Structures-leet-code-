package Arrays;
import java.util.*;

public class chocolatefactory {
    public static void pushZeroes(int arr[]){
        int length=arr.length;
        int index=0;//index for checking zeroes
        for(int i=0;i<length;i++){
            if(arr[i]!=0){//if element is non zero push forward
                arr[index]=arr[i];//push forward
                index++;
            }
        }
        while(index<length){
            arr[index]=0;//insert zeroes at end
            index++;
        }
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter:"+i);
            arr[i]=sc.nextInt();
        }
        pushZeroes(arr);     
    }
    
}
