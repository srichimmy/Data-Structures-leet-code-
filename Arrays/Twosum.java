package Arrays;

public class Twosum {
    public int[] twosumnum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }
    public static void main(String args[]){
        int arr[]={2,7,9,6,5,4};
        int target=11;
        Twosum obj=new Twosum();
        int result[]=obj.twosumnum(arr,target);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        

    }
    
}
