package Recursion;


public class ArraySorted {

    public static void main(String[] args) {
        System.out.println(checkIfArraySorted(new int[]{1,2,1,4,5}, 5));
    }

    public static boolean checkIfArraySorted(int[] arr, int n){
	if(n==1 || n==0)
		return true;

	return (arr[n-1]>arr[n-2]) && checkIfArraySorted(arr, n-1);
}

}
