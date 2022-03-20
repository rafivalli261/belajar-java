package dalampantauan;

//@author Rafi

// soal
/*
Given an array A of n positive numbers. Find the first Equibrium Point in the Array
* Equibrium point in an array is a position such that the sum of the elements before it is equal to the sum of the element after it
* Return -1 if no such point exist

Ex.
    I/P : n = 5, A[] = (1, 3, 5, 2, 2)
    O/P : 3

*/
public class EquilibriumPoint {

    public static int equilibriumPoint(long[] arr, int N){
        long sum = 0, cursum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        
        for(int i = 0; i < N; i++){
            sum = sum - arr[i];
            if(cursum == sum){
                return i + 1;
            }
            cursum += arr[i];
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int n = 5, result;
        long[] A = {1, 3, 5, 2, 2};
        result = equilibriumPoint(A, n);
        System.out.println(result);
    }

    
}
