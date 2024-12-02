// Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
// Note: When you return '$' driver code will output -1.
// D-E-Shaw , InfoEdge ,  Goldman Sachs

//  1 way to solve Map funtion
// t.c = O(n) and s.c = O(n)
class Solution {
  
    static char nonRepeatingChar(String s) {
        Map<Character,Integer> map = new HashMap();
       // int n = s.length();
        for(int i=0;i<s.length;i++){ //for counting each occurence of characters in the string
            char ch = s.charAt(i); //char index
            map.put(ch,map.getOrDefault(ch,0)+1); //update count of char in map
            //if the char is not already in the map, its default is 0 and we add them with 1
        }
        for(int i=0;i<s.length;i++){ //finding first char with count 1(non repeating)
            char ch = s.charAt(i);
            if(map.get(ch)==1){ //if count is 1, return that char
                return ch;
            }
        }
        return '$'; //if no any non repeating char is found, return $
    }
}

///   2 way to solve  containt size 
// t.c = O(n) and s.c= O(1)
class Solution {
   
    static char nonRepeatingChar(String s) {
        int freq[]=new int[26];
        //count freq of each element
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            freq[idx]++;
        }
        //check the first non repeating integer;
        for(int i=0; i<s.length(); i++){
           char ch=s.charAt(i);
            int idx=ch-'a';
            if(freq[idx]==1){
                return ch;
            }
        }
        return '$';
        
    }
}
