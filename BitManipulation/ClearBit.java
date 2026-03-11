package BitManipulation;

public class ClearBit {
    //clear Bit clears the bit in any position means it sets it to "zero"
    public static void main(String[] args) {
        int n=6;//1000 try 100
        String num=Integer.toBinaryString(n);
        System.out.println(num);
        int pos=2;
        int bitmask=1<<pos;
        int result=n&bitmask;
        if(result!=0){
            System.out.println(pos+" bit is one");
            int newnum=n&pos;
            System.out.println("newnum"+newnum);
            String s=Integer.toBinaryString(newnum);
            System.out.println(s);
        }
        else{
            System.out.println(pos+" bit is already 0");
        }

    }
    
}
