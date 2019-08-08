public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        //while(l1 != null){
        //    System.out.println(l1.val);
        //    l1 = l1.next;
        //}
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if(l1 != null) {head.next = l1;}
        if(l2 != null) {head.next = l2;}
        return head.next;
    }

}
