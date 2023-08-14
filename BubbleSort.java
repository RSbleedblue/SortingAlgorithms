import java.util.Arrays;

public class BubbleSort {
    public static void Bubblesort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {22,3,1,4,5};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

