package BitManipulation;
//get bit-to know which bit
//set bit-to chnage 0 to 1 and leave 1 as it is
//clear bit-to change 1 to 0 and leave 0 as it is
//update bit- to update 0 to 1 and 1 to 0

public class GetBit {
    public static void main(String args[]){
        // get 3rd postion bit(position =2) of number n
        int n=10111;
        int mask=1<<2;//1<<k;k=position
        int result=n&mask;
        if(result!=0){
            System.out.println("3rd position is : 1");
            System.out.println(result);
        }
        else{
            System.out.println(result);
        }
        


    }
    
}
