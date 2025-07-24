package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 18};
        selectionSort(arr);
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }

    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
