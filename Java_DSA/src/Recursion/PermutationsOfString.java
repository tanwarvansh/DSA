package Recursion;

public class PermutationsOfString {
    public static void main(String[] args) {
        printPemutations("ABC".toCharArray(), 0, "");
    }
    public static void printPemutations(char[] s,int i,String res){
        if(i==s.length){
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length;j++){
            swap(s, i, j);
            printPemutations(s, i+1, res+s[j]);
            swap(s, i, j);
        }
    }
    public static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
