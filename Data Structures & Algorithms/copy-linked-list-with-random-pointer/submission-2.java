/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        if(head == null)
            return null;

        Node headNew = new Node(head.val);
        map.put(head, headNew);

        Node cur = head;
        Node curC = headNew;
        while(cur.next!= null) {
            Node next = cur.next;
            Node nextC = new Node(next.val);
            map.put(next , nextC);
            curC.next = nextC;
            cur=cur.next;
            curC = curC.next;
        }
        curC = headNew;
        cur = head;
        while(curC != null) {
            curC.random = map.getOrDefault(cur.random, null);
            curC = curC.next;
            cur = cur.next;
        }

        return headNew;
    }
}
