package Strings;
class ReverseStr {
    public String reverseStr(String s, int k) {
        // change string to array for easy access
        char [] arr=s.toCharArray();
        //calculate the length
        int n=arr.length;
        //using pointers
        //the i i moving from 0 t0 2k and reversing the first 'K' characters
        for(int i=0;i<n;i+=2*k){
            int left=i;//left pointer intialization
            int right=Math.min(i+k-1,n-1);//intitializing right pointer for upto k elements or <k elements
        while(left<right){  //reversing the elements          
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            }
        }
        return new String(arr);      
    }
    // for testing
    public static void main(String[] args){
        int k=2;
        String s="abcdefghi";
        ReverseStr obj = new ReverseStr();   // create object
        String result = obj.reverseStr(s, k);

        System.out.println(result);      // print result
        
    }
}