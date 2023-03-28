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
            int len = que.size();
          
            while(len>0){
                TreeNode node = que.poll();
                if(len == 1) result.add(node.val);
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
                len--;
            }
            
        }

        return result;
    }
}