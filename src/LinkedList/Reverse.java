package LinkedList;

class ListNodeClass{
    int val;
    ListNodeClass next;

    ListNodeClass(int val){
        this.val = val;
    }
}
public class Reverse {
    public static ListNodeClass addTwoNumbers(ListNodeClass l1) {
        ListNodeClass prev = null;
        ListNodeClass current = l1;
        ListNodeClass next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNodeClass head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNodeClass node1 = new ListNodeClass(10);
        ListNodeClass node2 = new ListNodeClass(20);
        ListNodeClass node3 = new ListNodeClass(30);

        node1.next = node2;
        node2.next = node3;

        ListNodeClass node4 = new ListNodeClass(100);
        ListNodeClass node5 = new ListNodeClass(200);
        ListNodeClass node6 = new ListNodeClass(300);

        node4.next = node5;
        node5.next = node6;

        printList(node1);
        printList(node4);

        ListNodeClass reverseList1 = addTwoNumbers(node1);
        ListNodeClass reverseList2 = addTwoNumbers(node4);
        printList(reverseList1);
        printList(reverseList2);

    }
}
