public class ds{
    public static void main(String args[]){
        int arr[] = {4,3,1,5,6,2};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        printArr(arr);
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; 
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }  
        while(i<=mid){
            temp[k++] = arr[i++]; 
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0; k<temp.length; k++){
            arr[si+k] = temp[k];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}