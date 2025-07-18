package String;

public class LongestCommonPrefixOfStrings {
    public String longestCommonPrefixVerticalScanning(String arr[]) {
        // code here
        String ans = "";
        if (arr.length == 0)
            return ans;
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[j].charAt(i) != arr[0].charAt(i)) {
                    // If the character doesn't match or we reach the end of the first string
                    return ans;
                }
            }
            ans += arr[0].charAt(i);
        }
        return ans;
    }

    public String longestCommonPrefixHorizontalScanning(String strs[]) {
        // code here
        if (strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                strs[i].contains(pre);
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty())
                    return "";
            }
        }
        return pre;
    }

}
