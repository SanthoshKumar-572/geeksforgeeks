/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        Node temp=headRef;
        while(temp!=null && temp.next!=null){
            Node newnode= temp.next;
            while(newnode!=null &&newnode.data==temp.data){
                newnode =newnode.next;
            }
            temp.next=newnode;
            if(newnode!=null){
                 newnode.prev=temp;
            }
           
            temp=newnode;
        }
        return headRef;
        
    }
}