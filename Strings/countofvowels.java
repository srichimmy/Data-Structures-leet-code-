package Strings;
public class countofvowels {
    public int count(String a){
        
        String b=a.toLowerCase();
        int count=0;
        int n=a.length();
        int left=0;
        while(left<n){
            char alpha=b.charAt(left);
            if(isvowel(alpha)){
                count++;
            }
            left++;

        }
        return count;


    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static void main(String[] args) {
        String a="Elephant";
        countofvowels obj=new countofvowels();
        int result=obj.count(a);
        System.out.println(result);

    }
    
}

