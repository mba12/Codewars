package com.michaelahern;

public class Node {
      int val;
      Node left;
      Node right;
      Node random;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node left, Node right, Node random) {
          this.val = val;
          this.left = left;
          this.right = right;
          this.random = random;
      }
}
