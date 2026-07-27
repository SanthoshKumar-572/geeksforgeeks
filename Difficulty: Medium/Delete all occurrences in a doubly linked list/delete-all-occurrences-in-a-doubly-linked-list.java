/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(head.data==x){
                    head=head.next;
                }
                Node newnode=temp.next;
                Node previous=temp.prev;
                if(newnode!=null){
                    newnode.prev=previous;
                }
                if(previous!=null){
                    previous.next=newnode;
                }
                temp=newnode;
                
                
            }
            else{
                temp=temp.next;
            }
        }
        return head;
        
    }
}