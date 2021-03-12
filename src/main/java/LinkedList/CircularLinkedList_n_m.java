
package LinkedList;

import java.util.*;

public class CircularLinkedList_n_m {
    
    //LinkedNode class to store the data
    static class LinkedNode
    {
        public int data;
        public LinkedNode next;
        public LinkedNode( int val) {
            this.data = val;
        }
    }
    
    
    static int lastPersonLeft(int m, int n) {
        //Create a circular linked list of size n
        LinkedNode head = new LinkedNode(1);
        LinkedNode prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new LinkedNode(i); // linked new Node
            prev = prev.next;
        }
        //connect last node to first Node
        prev.next = head;
        
        //while only one Node is left in the Linked List
        //2 Pointers are needed 
        LinkedNode p = head, temp = head;
        while (p.next != p){
            //find m-th Node
            int count = 1;
            while (count != m){
                temp = p;
                p = p.next;
                count++;
            }
            //remove the m=th node
            temp.next = p.next;
            p = temp.next;
        }
        return p.data;
    
    }
    
    
    public static void main(String[] args) {
       
        int n = 14, m = 2; //m-1
        System.out.println("Last person left standing is: " + lastPersonLeft(m, n));
    }
    
}
