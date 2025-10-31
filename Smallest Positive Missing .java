/*
   Examples:
            Input: arr[] = [2, -3, 4, 1, 1, 7]
            Output: 3
            Explanation: Smallest positive missing number is 3.
            
            Input: arr[] = [5, 3, 2, 5, 1]
            Output: 4
            Explanation: Smallest positive missing number is 4.

  Edge Cases
              Input	        Output	    Reason
              [1, 2, 3]	      4	        All first 3 present
              [0, -1, -2]	    1	        No positive number
              [2, 3, 4]	      1	        Missing smallest one
              [1, 1, 2, 2]	  3	        Handle duplicates correctly

  Time & Space Complexity
            ⌚ T.C: O(n log n) — Sorting the array
            🫙 S.C: O(1) — Constant extra space
*/
class Solution {
    public int missingNumber(int[] arr) {
        // 1.0 : Sort array in ascending order
        Arrays.sort(arr);
        // 2.0 : +ve numbers start from 1
        int checkNum = 1;
        
        // 3.0 : Iterate from 0 to 'n' (array length)
        for(int i = 0 ; i<arr.length;i++)
        {
            //3.0.1: check number If current element equals 'checkNum' if true
            if(arr[i] == checkNum)
                 //3.0.1.1: Increment 'checkNum' and continue
                 checkNum++;
                 
            // 3.0.2: Else if element is greater than 'checkNum' if false
            else if(arr[i]>checkNum)
                    // 3.0.2.1 → Break since missing number found
                    break ;
        }
        
        // 4.0 → Return first missing positive number
        return checkNum;
    }
}
