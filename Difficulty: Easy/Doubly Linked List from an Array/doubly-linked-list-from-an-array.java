/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node store=new Node(arr[i]);
            store.next=null;
            store.prev=temp;
            temp.next=store;
            temp=store;
        }
        return head;
        
    }
}