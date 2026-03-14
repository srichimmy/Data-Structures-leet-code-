package Arrays;

public class RemoveElement {
    //27.Remove Element ==>Leetcode
    public static void main(String[] args) {
        int i=0;
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j]);
            
        }
    }
    
}
