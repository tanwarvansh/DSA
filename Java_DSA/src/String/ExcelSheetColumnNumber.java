package String;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(excelColumnNumber("UMU"));
        System.out.println(excelColumnNumber("RWXP"));
    }
   public static int excelColumnNumber(String s) {
        // Code here
        int ans = 0;
        int power = 1;
        for (int i = s.length()-1; i >=0; i--) {
            // Convert character to its corresponding value in base 26
            ans += (s.charAt(i) - 'A' +1) * power;
            power *= 26; 
        }
        return ans;
        
    }
}
