
package LinkedList;

import java.util.*;

public class CircularLinkedList_last_2 {

    public static void main(String[] args) {
       
        int m = 2, n = 5;
        System.out.println("Last:" + lastTwoPepleLeft(m, n));
        
        int x = 2, y = 7;
        System.out.println("Last:" + lastTwoPepleLeft(x, y));
        
    }
    
    
    public static class Node {
        int data;
        Node next;
        
        public Node (int val) {
            this.data = val;
        }
    }
    
    public static int lastTwoPepleLeft(int m, int n){
        Node head = new Node(1);
        Node prev = head;
        
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        
        prev.next = head;
        
        //find node
        Node p = head, temp = head;
        int survive = n;
        while (p.next != p) {
            if (survive == 2){ 
                System.out.print("Second to last person: " + temp.data + ", ");
            }
            int count = 1;
            while (count != m) {
                temp = p;
                p = p.next;
                count++;
            }
            
            //Remove node
            temp.next = p.next;
            p = temp.next;
            survive--;
        }
        return p.data;
    }
}
