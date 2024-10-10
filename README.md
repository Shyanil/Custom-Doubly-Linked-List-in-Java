# Custom Doubly Linked List in Java

## Overview

This repository contains a custom implementation of a **doubly linked list** in Java. The doubly linked list allows nodes to reference both their previous and next nodes, facilitating efficient traversal in both directions. This implementation provides functionalities for inserting, deleting, and searching nodes, as well as displaying the list in forward and reverse order.

## Features

- **Insertions**:
  - `insertFirst(int value)`: Insert a node at the beginning of the list.
  - `insertLast(int value)`: Insert a node at the end of the list.
  - `insertNewIndex(int index, int value)`: Insert a node at a specified index.
  - `insertAfter(int after, int value)`: Insert a node after a node with the specified value.
  
- **Deletions**:
  - `deleteFirst()`: Remove and return the first node in the list.
  - `deleteLast()`: (Coming soon) Remove and return the last node in the list.
  - `deleteFromIndex(int index)`: Remove a node at a specified index.
  
- **Search**:
  - `find(int value)`: Find and return the node containing the specified value.
  - `get(int index)`: Get the node at a specified index.

- **Traversal**:
  - `display()`: Display the list from head to tail and tail to head.
  
## Methods Overview

### Insertion Methods

1. **`insertFirst(int value)`**:
   - Adds a node with the specified value at the beginning of the list.
  
2. **`insertLast(int value)`**:
   - Adds a node with the specified value at the end of the list.

3. **`insertNewIndex(int index, int value)`**:
   - Inserts a new node at the specified index.
   
4. **`insertAfter(int after, int value)`**:
   - Inserts a new node after a node with the specified value.

### Deletion Methods

1. **`deleteFirst()`**:
   - Removes and returns the first node in the list.

2. **`deleteLast()`** (Coming soon):
   - Will remove and return the last node in the list.

3. **`deleteFromIndex(int index)`**:
   - Removes the node located at the specified index.

### Search and Utility Methods

1. **`find(int value)`**:
   - Finds and returns a node containing the specified value.

2. **`get(int index)`**:
   - Returns the node at the specified index.

3. **`display()`**:
   - Prints the list from head to tail and tail to head, showing the connections between nodes.

### Example Usage

```java
public class Main {
    public static void main(String[] args) {
        Doublylinkedlist list = new Doublylinkedlist();

        // Inserting elements
        list.insertFirst(10);
        list.insertLast(20);
        list.insertNewIndex(1, 15); // Inserts 15 at index 1
        list.insertAfter(20, 25);   // Inserts 25 after 20

        // Displaying the list
        list.display(); // Output: 10 <=> 15 <=> 20 <=> 25 <=> END
                        // Printing in reverse: 25 <=> 20 <=> 15 <=> 10 <=> START
        
        // Deleting elements
        list.deleteFirst();
        list.display(); // Output: 15 <=> 20 <=> 25 <=> END

        list.deleteFromIndex(1);
        list.display(); // Output: 15 <=> 25 <=> END
    }
}
```

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/Shyanil/Custom-Doubly-Linked-List-in-Java.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Custom-Doubly-Linked-List-in-Java
   ```

3. Compile the Java files:
   ```bash
   javac Doublylinkedlist.java
   ```

4. Run the example:
   ```bash
   java Main
   ```

## Upcoming Features

- **Delete Last Node**: Implementing the `deleteLast()` method to remove the last node.
- **More Utility Methods**: Additional utility methods for searching, sorting, and reversing the list.
- **Support for Generics**: Allowing the list to store any data type, not just integers.

## Contributing

We welcome contributions! If you'd like to improve the implementation, feel free to submit a pull request or open an issue.

---

This README reflects the updated structure and methods in your project, including the **`deleteFromIndex`** method.
