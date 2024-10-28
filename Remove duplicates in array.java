// T.c = O(n) and S.c = O(n)

// Q. Given an array arr consisting of positive integer numbers, remove all duplicate numbers.

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num : arr){
            if(!answer.contains(num)) answer.add(num);
        }
        return answer;
    }
}
