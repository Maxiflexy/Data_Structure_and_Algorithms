package com.practice.data_structure_and_algorithm.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{

        private TreeNode left;
        private TreeNode right;
        private int data;

        private TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- root --> third

        second.left = fourth;
        second.right = five;

    }
    public void createBinaryTree2(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- root --> third

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }

    public void recursivePreOrderTraversal(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        recursivePreOrderTraversal(root.left);
        recursivePreOrderTraversal(root.right);
    }

    public void iterativePreOrderTraversal(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
    }

    public void recursiveInOrderTraversal(TreeNode root){
        if(root == null) return;
        recursiveInOrderTraversal(root.left);
        System.out.print(root.data + " ");
        recursiveInOrderTraversal(root.right);
    }

    public void iterativeInOrderTraversal(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.empty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void recursivePostOrderTraversal(TreeNode root){
        if(root == null) return;
        recursivePostOrderTraversal(root.left);
        recursivePostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void iterativePostOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.empty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else {
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.empty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else
                    current = temp;
            }

        }
    }

    public void levelOrderTraversal(){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                queue.offer(temp.left);
            if(temp.right != null)
                queue.offer(temp.right);
        }
    }

    public int findMaxValueInABinaryTree(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int result = root.data;
        int left = findMaxValueInABinaryTree(root.left);
        int right = findMaxValueInABinaryTree(root.right);
        if(left > result)
            result = left;
        if (right > result)
            result = right;
        return result;
    }



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree2();

        System.out.println("Recursive Pre-Order: ");
        binaryTree.recursivePreOrderTraversal(binaryTree.root);


        System.out.println();
        System.out.println("Iterative Pre-Order: ");
        binaryTree.iterativePreOrderTraversal(binaryTree.root);


        System.out.println();
        System.out.println("Recursive In-Order: ");
        binaryTree.recursiveInOrderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Iterative In-Order: ");
        binaryTree.iterativeInOrderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Recursive Post-Order: ");
        binaryTree.recursivePostOrderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Iterative Post-Order: ");
        binaryTree.iterativePostOrderTraversal(binaryTree.root);

        System.out.println();
        System.out.println("Level-Order: ");
        binaryTree.levelOrderTraversal();

        System.out.println();
        System.out.print("Maximum value in a Binary Tree: " + binaryTree.findMaxValueInABinaryTree(binaryTree.root));


    }


}
