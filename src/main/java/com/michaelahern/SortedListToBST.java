package com.michaelahern;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {

        if(head == null) return null;
        int count = 0;
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int[] nums = new int[list.size()];
        int idx = 0;
        for(int i : list)
            nums[idx++] = i;

        return sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);

        int midIdx = nums.length / 2;
        TreeNode root = new TreeNode(nums[midIdx]);
        helper(root, 0, midIdx - 1, nums);
        helper(root, midIdx + 1, nums.length - 1, nums);

        return root;
    }

    public void helper(TreeNode node, int start, int end, int[] nums) {
        if(start > end) {
            return;
        }

        int mid = (start + end)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        add(node, newNode);
        helper(newNode, start, mid - 1, nums);
        helper(newNode, mid+1, end, nums);

    }

    public void add(TreeNode root, TreeNode node) {

        if(node.val <= root.val) {
            if (root.left == null)
                root.left = node;
            else
                add(root.left, node);
        }

        if(node.val > root.val) {
            if (root.right == null)
                root.right = node;
            else
                add(root.right, node);
        }
    }



}
