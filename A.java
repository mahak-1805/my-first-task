

public class A {
   static class Node{
        int data;
        Node next;
    
    Node(int newData){
        data = newData;
        next = null;
    }
}
public static Node insertAtFront(Node head, int newData){
    Node newNode = new Node(newData);
    newNode.next=head;
    return newNode;
}
public static void printList(Node head){
Node curr= head;
while(curr!=null){
    System.out.println(""+curr.data);
    curr = curr.next;
}
}


public static void main(String[]args){
    Node head = new Node(2);
     head.next = new Node(3);
head.next.next = new Node(4);
head.next.next.next = new Node(5);
 System.out.println("ORIGINAL LIST:");
 printList(head);

 System.out.println("aftr insertion:");
 int data=1;
 head= insertAtFront(head, data);

 printList(head);




}
}
