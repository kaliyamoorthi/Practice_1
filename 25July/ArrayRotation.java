package DataStructure;
import java.util.Arrays;
 
class ArrayRotation
{
    // Function to right-rotate an array by one position
    public static void rightRotateByOne(int[] A)
    {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
 
        A[0] = last;
    }
 
    // Function to right-rotate an array by `k` positions
    public static void rightRotate(int[] A, int k)
    {
        // base case: invalid input
        if (k < 0 || k >= A.length) {
            return;
        }
 
        for (int i = 0; i < k; i++) {
            rightRotateByOne(A);
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
 
        rightRotate(A, k);
 
        System.out.println(Arrays.toString(A));
    }
	
	
	
	        
   /*     public static void rotate(int arr[], int d, int n)
        {
            int p = 1;
            while (p <= d) {
                int last = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = last;
                p++;
            }
     
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
         
        public static void main(String[] args)
        {
            int arr[] = { 1,3, 5, 7, 9 };
            int N = arr.length;
            
            int d = 2;
     
            
            rotate(arr, d, N);
        }*/
    }


