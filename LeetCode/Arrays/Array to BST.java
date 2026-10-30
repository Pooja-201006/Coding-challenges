/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        // code here
        return bst(arr,0,arr.length-1);
        
    }
    public Node bst(int[] arr,int start,int end )
    {
        if(start>end)
        {
            return null;
        }
        int mid=start+(end-start)/2;
        Node root=new Node(arr[mid]);
        root.left=bst(arr,start,mid-1);
        root.right=bst(arr,mid+1,end);
        return root;
    }
}
