/*  You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
Note: Positive number starts from 1. The array can have negative integers too.  */

// Company Tags
// Accolite , Amazon , Samsung , Snapdeal

class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int Element : arr){
            if(Element > 0){
            set.add(Element);
            }
        }
        int n = arr.length;
        for(int i = 1 ; i <= arr.length ; i++){
            if(!set.contains(i))return i;
        }
    return n+1;    
    }
}
