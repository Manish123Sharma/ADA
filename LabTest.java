package ADA;

import java.util.Scanner;

class Node {
    int data;
    Node left, right, nextRight;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.nextRight = null;
    }
}
public class LabTest {
    Node root;
    boolean printAncestors(Node node, int target)
    {
        /* base cases */
        if (node == null) {
            return false;
        }
        if (node.data == target)
            return true;

        /* If target is present in either left or right subtree
           of this node, then print this node */
        if (printAncestors(node.left, target) || printAncestors(node.right, target))
        {
            System.out.print(node.data + " ");
            return true;
        }
        else
        {
            return false;
        }
    }
    public Node insertLevelOrder(int[] arr, Node root, int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }


    public static void main(String args[])
    {
        LabTest t2 = new LabTest();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        t2.root = t2.insertLevelOrder(arr, t2.root, 0);
        t2.inOrder(t2.root);
        System.out.println();
        System.out.println("Enter the node to find its ancestors");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Ancestors" );

        if(n==t2.root.data)
        {
            System.out.println("Error : Parent Node Entered");
        }
        if(t2.printAncestors(t2.root,n)==false)
        {
            System.out.println("Error : Node does not exist");
        }
        else
        t2.printAncestors(t2.root,n);
    }
}
