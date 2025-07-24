package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        printTowerOfHanoi(10, 'F', 'T', 'A');
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==0)
        return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 3;
        return 2*towerOfHanoi(n-1,from,to,aux)+1;
    }

    public static void printTowerOfHanoi(int n, char from, char to, char aux) {
        // code here
        if(n==0)
        return;
    
        printTowerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from rod---> "+ from +" to rod --> "+to);
        printTowerOfHanoi(n-1, aux, to, from);
        
    }


}
