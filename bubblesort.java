package Arrays;

public class bubblesort {
    public static void bubbleSort(int arr[]) {
    for(int turn=0;turn<arr.length;turn++) {
        for(int j=turn+1;j<arr.length;j++) {
            if(arr[turn]>arr[j]) { // ascending order
                //swap
                int temp=arr[turn];
                arr[turn]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
public static void printArr(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
