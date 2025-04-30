package com.bruno.santana.merge_two_sorted_lists;

// Definition for singly-linked list.

 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     // Method to print the entire list
     public void printList() {
         ListNode current = this;
         while (current != null) {
             System.out.print(current.val);
             if (current.next != null) {
                 System.out.print(" -> ");
             }
             current = current.next;
         }
         System.out.println(); // for a new line after the list
     }
 }
