package Strings;



public class MyStringBuilder {
    //in java string is immutable so instead of creating a new string which is time taking process
    //so in jave there is a optimised string class called string builder which does most operations
    //StringBuilder declaration
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tony");
        //print charAt '0'
        System.out.println(sb.charAt(0));
        //set charAt index "0"
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //insert char into the string
        sb.insert(0,'S');
        System.out.println(sb);
        //delete sub string
        sb.delete(0, 1);
        System.out.println(sb);
        sb.setCharAt(0,'T');
        // use of append
        StringBuilder s=new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s);
    }    
}
