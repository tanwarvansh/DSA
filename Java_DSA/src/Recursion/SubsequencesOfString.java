package Recursion;

public class SubsequencesOfString {
    public static void main(String[] args) {
        printSubSequence("abc", 0, "");
    }
    public static void printSubSequence(String s, int i,String ans){
        if(i==s.length()){
            
            System.out.println(ans);
            return;
        }
        printSubSequence(s,i+1,ans+s.charAt(i));
        printSubSequence(s,i+1,ans);
    }
}
