package String;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revStr("Hello World!"));
    }
    static String revStr(String s) {
        // code here
        char[] arr = s.toCharArray();
        int i=0,e=s.length()-1;
        while(i<e){
            char temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            i++;
            e--;
        }
        return new String(arr);
    }
}
