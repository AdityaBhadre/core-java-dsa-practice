import java.util.*;
class sorting {
     private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;   


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }


        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  
        mergeSort(arr, mid + 1, high); 
        merge(arr, low, mid, high);  
    }
    static void quickSort(int arr[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (start <= ub && arr[start] <= pivot) {
                start++;
            }
            while (end >= lb && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }

    static void insertionSort(int arr[]){
        int l = arr.length;
        for(int i = 0; i < l; i++){
            int j = i;
            while( j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr [min];
            arr[min] = temp;
        }
    }
    static void bubbleSort(int arr[]){
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,1,3,4};
        selectionSort(arr);
        bubbleSort(arr);
        int n = arr.length;
        insertionSort(arr);
        quickSort(arr,0,n-1);
        mergeSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}