package Strings;
import java.util.*;
public class Stringsbasics {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //string declaration
        String name="Tony Stark";
        //In java Strings are immutable
        System.out.println(name);
        //concatenation
        String a="Tony";
        String b="Stark";
        String fullname= a+" "+b;
        System.out.println(fullname);
        //length of String
        System.out.println(fullname.length());
        //print character-wise
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        //takes input only for one word or until space appears
        System.out.println("write input");
        String input=sc.next();
        
        System.out.println("write input 2");
        
        //take sentence as input use nextLine()
        String input2=sc.next();
        System.out.println(input2);
        //use compareTo to compare to strings
        //input==input2 then'0'
        //input>input2 then 'positive'
        //input < input2 then 'negative'
        if(input.compareTo(input2)==0){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        //parse Integer change integer to string
        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num);
        //from int to string
        int number=123;
        String srg=Integer.toString(number);
        System.out.println(srg);



    }
}
