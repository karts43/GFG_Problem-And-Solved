// Find a Peck element in given array  where adjesant element is A[i-1] < a[i] (i.e peak element) > A[i+1]
// T.c = O(nlogn)  we are use Binary Search
// S.c = O(1) 
class Solution {
    public int peakElement(int[] arr) {
        int L = 0 ;
        int R =arr.length-1;
        while(L<R){
            int mid = L + (R-L) /2;
            if(arr[mid] < arr[mid + 1]){
                L = mid + 1;
            }else{
                R = mid;
            }
        }
        return L;
    }
}

