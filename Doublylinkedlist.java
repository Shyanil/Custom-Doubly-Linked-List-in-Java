/**
 * Doublylinkedlist
 */

package Introduction_to_Doubly_linked_list;

public class Doublylinkedlist {
    private Node head;
    private int size;

    Doublylinkedlist() {
        this.size = 0;
    }

    // now adding Node on First
    public void insertFirst(int value) {

        Node node = new Node(value);
        if (head != null) {
            head.prev = node; // from 2nd element the head.prev point to the new node i created
        }
        node.next = head; // first my new node next point to the head
        node.prev = null; // and my new node previous point to the null
        head = node; // and i move my head
        size++;
    }


    public void insertLast(int value) {
        Node node = new Node(value);  // First create a new box
        if (head == null) {  // if the list is empty then insert first or insert new node
            //  insertFirst(value);
            head = node;
            node.prev = null;
        }
        Node tail = head; // basically its checks and move forwards

        while (tail.next != null) {
            tail = tail.next;  // move my tail
            if (tail.next == null) { // its moves its basically 2nd reference variable the checks  the next is null not moving my head
                // then assign the next to new  node
                // draw the copy and code
                tail.next = node;
                node.next = null;
                node.prev = tail;
                return;
            }
        }
        size++;
    }

    public void insertNewIndex(int index, int value) {
        // here we inserting element on the index
        // means there is previous index not removing
        if (index == 0) {
            insertFirst(value);
        }

        if (index == size) {
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);       // Create a new node with the given value
        node.next = temp.next;             // Set the new node's 'next' to point to the current 'next' of 'temp'
        node.prev = temp;                  // Set the new node's 'prev' to point to 'temp' (the node before insertion point)
        temp.next.prev = node;             // Update the 'prev' of the next node (original node at the index) to point to the new node
        temp.next = node;                  // Set 'temp's 'next' to the newly created node (linking the previous node to the new node)
        size++;

    }

    public void  insertOldIndex(int index , int value){
        if (index == 0) {
            insertFirst(value);
        }

        if (index == size) {
            insertLast(value);
        }
        Node temp = head;
        for (int i = 0; i < index ; i++) {
          temp = temp.next;
        }
        Node node = new Node(value);        // Create a new node with the given value
        node.next = temp.next;              // Set the new node's next to the current next of temp
        temp.next.prev = node;              // Make the next node's previous point to the new node
        temp.prev.next = node;              // Link the previous node's next to the new node
        node.prev = temp.prev;              // Set the new node's previous to the node before temp

    }

    public void insertAfter(int after , int value){
        Node previousNode = find(after);   // Find the node with the value 'after' where we want to insert the new node after it.
        if (previousNode == null) {        // If the node is not found, handle the case where it doesn't exist.
            System.out.println("Not found");  // Output a message indicating that the node was not found.
            return;                         // Exit the method as there is no valid position to insert the new node.
        }
        Node node = new Node(value);        // Create a new node with the given value.
        node.next = previousNode.next;      // Set the new node's 'next' to the node that comes after 'previousNode' (original next of 'previousNode').
        previousNode.next = node;           // Set 'previousNode's 'next' to the newly created node, linking it after 'previousNode'.
        node.prev = previousNode;           // Set the new node's 'prev' to point to 'previousNode'.
        if (node.next != null) {            // If the new node is not the last node (i.e., there is a node after it),
            node.next.prev = node;          // Update the 'prev' of the next node to point to the new node (linking backward).
        }

    }

    public int deleteFirst(){
        int value = head.value;
        if (head.next != null) {
            head = head.next;  // Move the head to the next node
            head.prev = null;  // Correctly set the previous of the new head to null
        } else {
            head = null;  // If there's no next node, the list is now empty
        }
        size--;  // Decrement the size after deletion
        return value;
    }


    // Finding node based on index
    private Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Finding node based on value
    private Node find(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return  temp;
            } else  {
                temp = temp.next;
            }
        }
        return  null;
    }

    public void display() {
        Node temp = head;
        Node last = null; // its null first // its basically tail that create with display
        while (temp != null) {
            System.out.print(temp.value + " <=> ");
            last = temp; // when new node created we tell reference variable to point to the last node
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");

        while (last != null) { // here two fita 1 is point to the next and one is previous so at the end head
            // prev is null
            System.out.print(last.value + " <=> ");
            last = last.prev; // print backwards so use prev
        }
        System.out.println("START");

    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}