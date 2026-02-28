package Strings;

public class Reverseprefix {
    
    public String reversePrefix(String s, int k) {
        char [] arr= s.toCharArray();
        int left=0;
        int right=k-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }    
        return new String(arr);    
    }
    public static void main(String[] args) {
        String s="abcdef";
        int k=4;
        Reverseprefix obj=new Reverseprefix();
        String result=obj.reversePrefix(s,k);
        System.out.println(result);

    }


}
    

