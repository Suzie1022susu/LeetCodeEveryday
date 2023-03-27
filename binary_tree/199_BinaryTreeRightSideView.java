class Solution {

    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> rightSideView(TreeNode root) {
         
         if(root==null) return result;
         fun1(root);
        
    }

    public void fun1(TreeNode root){
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            
        }
    }
}