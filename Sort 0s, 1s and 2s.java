// Dutch National Flag Algorithm
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public void sort012(int[] arr) {
        // code here
        int n =arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
