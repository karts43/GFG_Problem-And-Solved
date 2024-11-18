/* Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular. */
// t.c = 
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
   static public void rotateArr(int arr[], int d) {
    d = d % arr.length; // Handle cases where d >= arr.length
    if (d == 0) return; // No rotation needed if d is 0

    reverse(arr, 0, d - 1);         // Reverse the first d elements
    reverse(arr, d, arr.length - 1); // Reverse the remaining elements
    reverse(arr, 0, arr.length - 1); // Reverse the entire array
}

static public void reverse(int arr[], int start, int end) {
    while (start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
     }
    }

}
