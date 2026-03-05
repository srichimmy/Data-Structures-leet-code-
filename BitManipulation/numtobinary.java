package BitManipulation;
public class numtobinary {
    public static void main(String args[]){
        StringBuilder binary=new StringBuilder();//can also use Integer.BinaryString();
        int n=4;
        while(n>0){
            binary=binary.append(n%2);
            n=n/2;
        }
        binary.reverse();
        System.out.println(binary);
    }
    
}
