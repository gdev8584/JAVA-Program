import java.util.Scanner;

public class reverse_K_times_linkedlist {
    static Node head;
    static int size;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public static void main(String[] args) {
     reverse_K_times_linkedlist li = new reverse_K_times_linkedlist();
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
         li.push(sc.nextInt());
     }
     int k = sc.nextInt();
     li.printit();
     head= li.reverseit(k);
     li.printit();
    }
    public static void push(int data){
        Node newNode = new Node(data);
        Node ptr=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public static void printit(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public static Node reverseit(int k){
        if(head==null || k==1) return head;
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev = dummy;
        Node curr = prev.next;
        Node next = curr.next;

        for(int i=1;i<k;i++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev=curr;
        return dummy.next;
    }
}
