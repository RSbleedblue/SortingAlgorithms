public class MergerSort {
    public static void MergeSort(int arr[],int start,int end){
        if(start<end){
            int mid = start + (end-start)/2;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            mergerhelper(arr,start,mid,end);
        }
    }
    public static void mergerhelper(int[] arr,int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int i = start,j=mid+1,k=0;
        while(i<=mid && j <=end){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=end){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }
        for(int x = 0;x<k;x++){
            arr[start+x] = temp[x];
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,1,2,3,0,8};
        int size = arr.length;
        MergeSort(arr,0,size-1);
    }
}
