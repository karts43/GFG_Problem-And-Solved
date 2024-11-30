// T.c = O(n) and S.c = O(n)
class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> answerstored = new ArrayList<>();
        for(int takevalues : arr){
      if(!answerstored.contains(takevalues)){ answerstored.add(takevalues);
        }
}
        return answerstored;
    }
}
