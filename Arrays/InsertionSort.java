package Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        //insertion sort
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
    
}
