class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}
 public static Node MiddleOne(Node head){
    if(head==null){
        return null;
    }
    Node slow = head;
    Node fast = head;

    while(fast!=null&&fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;

}
public static  void printList(Node head){
Node temp = head;
while(temp!=null){
    System.out.println(temp.data+" →");
    temp= temp.next;
}
System.out.println("null");
}
public static void main(String[]args){
    Node head= new Node(100);
    head.next= new Node(40);
    Node c = new Node(80);
    Node d = new Node(30);
    Node e = new Node(70);
    Node f = new Node(50);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;
printList(head);
Node middle = findModdle(head);






}