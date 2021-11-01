public class linkedlist {
    public class ListNode{
        int val = 0;
        LinkNode next = null;
    }
    public ListNode(int val){
        this.val = val;
    }
}
ListNode head = null;
int size =0;
    public static void addfirst(int val){
        ListNode node = new ListNode();
        if(head == null){
            head  = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }
    public static void addlast(int val){
        ListNode node = new ListNode();
        if(head == null){
            head = node;
        }
        else{
            ListNode temp = head;
            while(temp!= null){
               temp = temp.next;
            }
            temp.next = node;
        }
    }
    // get at index
    public int getAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            return -1;
        }
        ListNode curr = head;
        for(int i= 1; i < idx; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public static int getAtIndexwith (int idx){
        int head = m;
        
    }
}
