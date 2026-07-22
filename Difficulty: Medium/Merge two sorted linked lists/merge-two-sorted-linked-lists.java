/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        ArrayList<Integer>ans=new ArrayList<>();
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            ans.add(temp1.data);
            temp1=temp1.next;
        }
        while(temp2!=null){
            ans.add(temp2.data);
            temp2=temp2.next;
        }
        Collections.sort(ans);
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        
        return arraytll(arr);
        
    }
    public static Node arraytll(int arr[]){
        Node temp=new Node(arr[0]);
        Node mover=temp;
        for(int i=1;i<arr.length;i++){
            Node newnode=new Node(arr[i]);
            mover.next=newnode;
            mover=newnode;
        }
        return temp;
    }
}