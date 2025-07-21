package String;

public class RemoveKAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeKDuplicates(str, k));
    }
    static class Pair{
        char ch;
        int count;
        Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    
        
    }
    public static String removeKDuplicates(String s, int k){
        Pair[] stack = new Pair[s.length()];
        int top = -1;
        for( char ch : s.toCharArray()){
            if(top > -1 && stack[top].ch == ch){
                stack[top+1]=new Pair(ch,stack[top].count+1);
                top++;
            }
            else {
                stack[++top] = new Pair(ch,1);
            }

            if(stack[top].count==k)
            top-=k;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=top;i++){
            sb.append(stack[i].ch);
        }
        return sb.toString();
    }
    }

