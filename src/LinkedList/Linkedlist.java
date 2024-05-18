package LinkedList;

class Listnode{
    int val;
    Listnode next;

    Listnode(int val){
        this.val = val;
    }
}
public class Linkedlist {
    public static void main(String[] args){
        //creating linkedlist
        Listnode node1 = new Listnode(10);
        Listnode node2 = new Listnode(20);
        Listnode node3 = new Listnode(30);

        node1.next = node2;
        node2.next = node3;


        //traversing the linkedlist and printing the values
        System.out.println("Linked List: ");
        Listnode current = node1;
        while(current != null){
            System.out.println(current.val);
            current=current.next;
        }
    }
}
