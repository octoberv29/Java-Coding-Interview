import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ds_tree {
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


    Binary Search Tree (BST) -  special form of a binary tree, where each value of the node must be
                                greater than or equal to any values in its left subtree 
                                but less than ot equal to any values in its right subtree,
                                in addition, both left and right subtrees are also BSTs.
                                
                                - In addition, all elements on the right of the root must be greater 
                                than the root and the saem for the left children.
    
        1. USED when you want to store data in order and need several operations, 
           such as search, insertion or deletion, at the same time, a BST might be a good choice.

        Like a Binary Tree, BST can be traversed using:
            1. pre-order
            2. in-order: we can create a sorted array
            3. post-order
            4. level-order

        BST supports 3 operations:
            1. search:
                1. return the node if the target value is equal to the value of the node;
                2. continue searching in the left subtree if the target value is less than the value of the node;
                3. continue searching in the right subtree if the target value is larger than the value of the node.
            2. insertion:
                1. search the left or right subtrees according to the relation of the value of the node and the value of our target node;
                2. repeat STEP 1 until reaching an external node;
                3. add the new node as its left or right child depending on the relation of the value of the node and the value of our target node.
            3. deletion:
                1. If the target node has no child, we can simply remove the node.
                2. If the target node has one child, we can use its child to replace itself.
                3. If the target node has two children, replace the node with its in-order successor or predecessor node and delete that node.
        
                Time Complexity for all: O(h), where h - height of the tree

                
            

    Tree (N-ary) 
    
        Traversal Algorithms:

        1. pre-order: root -> left subtree -> right subtree

        2. post-order: left subtree -> right subtree -> root

        3. level-order: level by level, from left to right

        - For each child:
            traverse the subtree rooted at that child by recursively calling the traversal function
            instead of traverse the left subtree, than the right subtree
*/
}


class BinaryTree {
    // For Binary Tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // pre-order 
    private ArrayList<Integer> result1 = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result1;
        
        result1.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return result1;
    }

    // in-order
    private ArrayList<Integer> result2 = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result2;
        
        inorderTraversal(root.left);
        result2.add(root.val);
        inorderTraversal(root.right);
        
        return result2;
    }

    // post-order
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

class BST {
    // BST
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Search
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        else if (val > root.val) return searchBST(root.right, val);
        else if (val < root.val) return searchBST(root.left, val);
        return root;
    }

    // insert
    public TreeNode insertIntoBST(TreeNode root, int val) { 
        if (root == null) return new TreeNode(val);
        if (val > root.val) root.right = insertIntoBST(root.right, val);
        else root.left = insertIntoBST(root.left, val);
        return root;
    }

    // delete
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            TreeNode p = findRightMin(root.right);
            root.val = p.val;
            root.right = deleteNode(root.right, p.val);
        }
        return root;
    }
    
    private TreeNode findRightMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}


class Tree {
    // For N-ary Tree
    public class Node {
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
}

