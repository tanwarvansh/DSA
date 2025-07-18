package String;

public class ValidPalindrome {
     public boolean isPalindrome(String st) {
        st = st.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int s=0,e=st.length()-1;
        while(s<e){
            while(s<e && !Character.isLetterOrDigit(st.charAt(s))) s++;
            while(s<e && !Character.isLetterOrDigit(st.charAt(e))) e--;
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
