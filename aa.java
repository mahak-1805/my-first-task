
    public class aa{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data= data;
            }
        }
        public static void main(String[] args) {
            Node a = new Node(100);
             Node b = new Node(200);
              Node c = new Node(300);
               Node d = new Node(400);
                Node e = new Node(500);
                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;
                e.next = null;

                int size = 0;
                
                Node temp = head;
                while(temp!=head){
                    size++;
                    temp = temp.next;

                }
                int m = m -n +1;
                temp = head;
                for(int i = 1; i<=m-1;i++){
                    temp = temp.next;
                }
                return temp;
            }

        }
            
        
    
