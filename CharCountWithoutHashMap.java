/*
Tricky Java Question I Recently Faced in an Interview!

During a recent interview, I got this simple-looking but tricky question 👇

> ❓ “Write a program to print the occurrences of each character in a string — without using a HashMap.”



At first, it sounds easy… until they say no HashMap! 😅
So here’s the logic I used 👇
*/

public class CharCountWithoutHashMap 
{
 public static void main(String[] args) 
 {
    String str = "java";
    boolean[] visited = new boolean[str.length()];

    for (int i = 0; i < str.length(); i++) 
    {
        if (visited[i]) continue;
        int count = 1;

    for (int j = i + 1; j < str.length(); j++) 
    {
        if (str.charAt(i) == str.charAt(j)) 
        {
            count++;
            visited[j] = true;
        }
    }

    System.out.println(str.charAt(i) + " -> " + count);
    }
 }

  /*
  
🧠 Output:
j -> 1
a -> 2
v -> 1
👉 Key idea:
Instead of using a HashMap, I used a boolean[] visited array to skip already counted characters — simple nested loop logic.

🎯 Takeaway:
Sometimes interviewers check logical thinking more than library knowledge.
Even a small twist (“no HashMap”) can reveal how you approach problems creatively
  */
}
