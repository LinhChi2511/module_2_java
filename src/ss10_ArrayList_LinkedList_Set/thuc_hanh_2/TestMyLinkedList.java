package ss10_ArrayList_LinkedList_Set.thuc_hanh_2;
java.util.ArrayList
public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(3,5);
        ll.addFirst(2);
        ll.printList();
    }
}
