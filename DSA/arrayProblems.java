import java.util.*;

public class arrayProblems{
    public static void findMaxProd(int[] arr, int k){
        if (arr.length < k) {
            System.out.println("Invalid input: k is larger than array size.");
            return;
        }

        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                // Reset the product if a zero is encountered
                product = 1;
                left = right + 1;  // Start a new window
                continue;
            }

            product *= arr[right];

            // Shrink window if size exceeds k
            if (right - left + 1 > k) {
                product /= arr[left];
                left++;
            }

            // If window is size k, consider for maxProduct
            if (right - left + 1 == k) {
                maxProduct = Math.max(maxProduct, product);
            }
        }

        System.out.println("MaxProduct is : " + maxProduct);
    }

    //replace array elements by their rank in the array
    public static void replaceByRank(int[] arr ){
        int n = arr.length;
        int temp = 1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 3, 4, -1, 0, 3, 2, 1};
        int k = 3;
        findMaxProd(arr, k);
    }
}
