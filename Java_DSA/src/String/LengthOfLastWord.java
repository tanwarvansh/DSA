package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World    "));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)!=' '){
                i++;
                count++;
            }else{
                while(i<s.length() && s.charAt(i)==' ')i++;
                if(i==s.length()) return count;
                count=0;
            }
        }
        return count;
    }
}
