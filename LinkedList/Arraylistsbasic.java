package LinkedList;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylistsbasic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();
        // ArrayList<Boolean> list3=new ArrayList<>();

        //Add elements
        list.add(0);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(4);
        System.out.println(list);
        //get elements at index
        int element=list.get(1);
        System.out.println(element);
        //add element in between
        list.add(1,2);//add 2 in index 1
        System.out.println(list);
        //set element
        list.set(0,2);//replaces index 0 element to 2
        System.out.println(list);

        //delete element
        list.remove(2);//removes element at index 2
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            int n=list.get(i);
            System.out.println(n);
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);


        

    }
    
}
