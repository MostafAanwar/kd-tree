package com.company;

public class NewNode {
    public NewNode(int[] point) {
    }

    Node newNode(int arr[])
    {
         Node temp = new Node();

        for (int i=0; i<2; i++)
            temp.point[i] = arr[i];

        temp.left = temp.right = null;
        return temp;
    }
}
