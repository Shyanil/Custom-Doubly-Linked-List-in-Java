package Introduction_to_Doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        Doublylinkedlist ll = new Doublylinkedlist();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertFirst(0);
        ll.insertLast(10);
        ll.insertLast(22);
        ll.display();
        ll.insertNewIndex(2, 200);
        ll.display();
        ll.insertOldIndex(3,100);
        ll.display();
        ll.insertAfter(10,20);
        ll.display();
        System.out.println("The item is deleted is " + ll.deleteFirst());
        ll.display();
        System.out.println("The item is deleted is " + ll.deleteLast());
        ll.display();


    }
}
