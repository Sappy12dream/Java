class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class LinkedList {
  Node head;

  void insertAtTail(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
  }

  void PrintList() {
    Node currentNode = head;
    if (currentNode == null) {
      System.out.println("List is empty");
    }
    while (currentNode != null) {
      System.out.print(currentNode.data + " -> ");
      currentNode = currentNode.next;
    }
    System.out.println("NULL");
  }

  void insertAtHead(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  void insertAtIndex(int data, int index) {
    if (index < 0) {
      System.out.println("Invalid index");
      return;
    }
    if (index == 0) {
      insertAtHead(data);
      return;
    }
    int count = 0;
    Node currentNode = head;
    Node newNode = new Node(data);
    while (currentNode != null & count < index - 1) {
      currentNode = currentNode.next;
      count++;
    }
    if (currentNode == null) {
      System.out.println("Index out of bounds");
    }
    newNode.next = currentNode.next;
    currentNode.next = newNode;
  }

  void deleteByValue(int value) {
    if (head == null) {
      System.out.println("List is empty");
    }
    if (head.data == value) {
      head = head.next;
      return;
    }
    Node current = head;
    while (current.next != null && current.next.data != value) {
      current = current.next;
    }
    if (current.next == null) {
      System.out.println("Value not found");
    }
    current.next = current.next.next;
  }

  void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;
    if (current == null) {
      System.out.println("List is empty");
    }
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;

  }
}