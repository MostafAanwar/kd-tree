package com.company;

public class Node {

    int point[] = new int[2];
    Node left,right;
    Node insertRec(Node root, int point[], int depth)
    {
        // Tree is empty?
        if (root == null)
            return new NewNode(point);

        // Calculate current dimension (cd) of comparison
        int cd = depth % 2;

        // Compare the new point with root on current dimension 'cd'
        // and decide the left or right subtree
        if (point[cd] < (root.point[cd]))
            root.left  = insertRec(root.left, point, depth + 1);
        else
            root.right = insertRec(root.right, point, depth + 1);

        return root;
    }
}

