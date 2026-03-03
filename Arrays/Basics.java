package Arrays;
public class Basics {
    //Arrays are the non-primitive types
    //Arrays are the list of items of same types
    //declaration:type[] arrayname=new type[size];
    //java is zero(o) indexed
    //arr[0] gives value at 0 index
    public static void main(String[] args){

    int marks[]={98,98,97,78,92,100,32};
    //System.out.println(marks);//prints the garbage value
    int size=marks.length;
    for(int i=0;i<size;i++){
        if(marks[i]==92){
            System.out.println("index:"+i);
            
        }
        i++;
    }
    }
    // Scanner sc=new Scanner(System.in);
    // int size=sc.nextInt();
    // int numbers[]=new int[size]; //by default it takes null values as in the array
    // for(int i=0;i<size;i++){
    //     numbers[i]=sc.nextInt();
    // }}
}


    

