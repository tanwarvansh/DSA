package String;


public class RemoveAdjacentDuplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
    //  StringBuffer st=new StringBuffer();
    //     int top =-1;
    //     for(int i=0;i<s.length();i++){
    //         if(top==-1 || st.charAt(top)!=s.charAt(i)){
    //             st.append(s.charAt(i));
    //             top++;
    //         }else{
    //             st.deleteCharAt(top);
    //             top--;
    //         }
    //     }
    //         return st.toString();

    //best solution
    char[] stack = new char[s.length()];
        int top = -1;
        for( char ch : s.toCharArray()){
            if( top != -1 && stack[top] == ch ){
                top--;
            } else {
                stack[++top] = ch;
            }
        }
        return new String(stack, 0, top+1 );
    }

}
