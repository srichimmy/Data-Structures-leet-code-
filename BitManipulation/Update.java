package BitManipulation;

public class Update {
    //update bit :we can update any position bit from one to zero and zero to one.
    // For one to zero:operation=>bit mask 1<<pos,and & nor
    // For zero to one :operation=>bit mask 1<<i ,or
    public static void main(String[] args) {
        int n=5;//101 change pos 0 1 to 0
        int pos=0;
        int bitmask=1<<0;
        int notbitmask=~(bitmask);
        System.out.println(notbitmask&n);
        //change pos 1 0 to 1
        int mask=1<<1;
        System.out.println(mask|n);

        
    }
    
}
