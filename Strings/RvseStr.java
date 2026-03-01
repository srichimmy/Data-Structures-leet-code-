package Strings;
import java.util.*;
public class RvseStr {
    public static void main(String[] args){
        //reverse a string using string builder
        StringBuilder sb=new StringBuilder("hello");
        //we have to replace the first char at lst position until the
        //string is revesed
        //there is no need to check the whole string
        //loop around half of length
        for(int i=0;i<sb.length()/2;i++){
            int first=i;
            int last=sb.length()-1-i;
            char frontchar=sb.charAt(i);
            char lastchar=sb.charAt(last);
            sb.setCharAt(first,lastchar);
            sb.setCharAt(last,frontchar);

        }
        System.out.println(sb);

        
    }
    
}