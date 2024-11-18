// You are given an array of integers arr[]. Your task is to reverse the given array.
// TCS , Infosys , Capgemini ... +14.
// t.c = O(n) & s.c = O(1)
class Solution {
    public void reverseArray(int arr[]) {
        int f = 0;
        int l = arr.length - 1;
        while(f<=l){
            swap(arr,f,l);
            f++;
            l--;
        }
    }
    public void swap(int []arr,int f,int l){
        int t = arr[f];
        arr[f] = arr[l];
        arr[l] = t;
    }
}
