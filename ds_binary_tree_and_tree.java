import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    Tree - is a data sctructure to simulate a hierarchical tree structure.
         - Each node of the tree has a root value and a list of references
           to other nodes which are called child nodes.
         - Tree can also be defined as a directed acylic graph which has N nodes and N-1 edges.

    Binary Tree - is a tree in which each node has at most two children (left and right).
    
        Binary Tree Traversal Algorithms:

        1. pre-order traversal: root -> left subtree -> right subtree

        2. in-order traversal: left subtree -> root -> right subtree

        3. post-order traversal: left subtree -> right subtree -> root 
        (deleting nodes: delete left child, right child, only then delete root)

        - All of them can be implemented recursively and iteratively (stack)

        4. level Order Traversal (BFS(queue)): level by level, from left to right


    Tree (N-ary) Traversal Algorithms:

    1. pre-order: root -> left subtree -> right subtree

    2. post-order: left subtree -> right subtree -> root

    3. level-order: level by level, from left to right

    - For each child:
        traverse the subtree rooted at that child by recursively calling the traversal function
        instead of traverse the left subtree, than the right subtree
*/


public class ds_binary_tree_and_tree {

    // For Binary Tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private ArrayList<Integer> result1 = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result1;
        
        result1.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return result1;
    }

    private ArrayList<Integer> result2 = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result2;
        
        inorderTraversal(root.left);
        result2.add(root.val);
        inorderTraversal(root.right);
        
        return result2;
    }

    private ArrayList<Integer> result3 = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return result3;
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result3.add(root.val);
        
        return result3;
    }

    
    // BFS or level-traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
    
        List<List<Integer>> global = new ArrayList<>();
        if (root == null) return global;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            List<Integer> local = new ArrayList<>();
            int size = queue.size();
            for (int i=0; i<size; ++i) {
                TreeNode curr = queue.peek();
                local.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
                queue.poll();
            }
            global.add(local);
        }
        return global;   
    }
    
}

// For N-ary Tree
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};