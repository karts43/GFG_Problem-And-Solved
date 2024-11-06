class Solution {
    // step 1111
     public static int sum = 0;
     // step 22
    public static void pathSum(Node root,int num){
        // step 22.0
        if(root==null) return;
        // step 22.1 ---> It's alwayes Both condition are true then run eithedr false
        if(root.left==null && root.right==null){
            // step 22.1.0 
            num = num*10+root.data;
            // step 22.1.1 --->1111
            sum += num;
            // step final 22.1.2
            return;
        }
        // step 22.2 
        num = num*10+root.data;
        // step 22.3 ---> call(22)
        pathSum(root.left,num);
         // step 22.4 ---> call(22)
        pathSum(root.right,num);
    }
    // step 11
    public static int treePathsSum(Node root) {
        // step 1---> 1111
        sum = 0;
        // step 2 ---> call(22)
        pathSum(root,0);
        // step 3 -->1111
        return sum;
    }
}
