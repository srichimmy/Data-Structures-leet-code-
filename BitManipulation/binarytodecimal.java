package BitManipulation;

public class binarytodecimal {
    public static void main(String args[]){
        String binary="110101";
        int decimal=0;
        int n=binary.length();
        for(int i=0;i<n;i++){
            char bit=binary.charAt(n-1-i);
            if(bit=='1'){
                decimal+=Math.pow(2,i);

            }
        }
        System.out.println("decimal numb is:"+decimal);

    }
    
}
