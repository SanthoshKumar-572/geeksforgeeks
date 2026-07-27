/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        Node temp1=head;
        while(temp1!=null){
            Node temp2=temp1.next;
            ArrayList<Integer> pair= new ArrayList<>();
            while(temp2!=null && temp1.data+temp2.data<=target ){
                if(temp1.data + temp2.data==target){
                    pair.add(temp1.data);
                    pair.add(temp2.data);
                    ans.add(pair);
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return ans;
    }
}