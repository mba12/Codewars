package com.michaelahern;

public class NumArray {

        private int[] tree;
        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.tree = new int[nums.length + 1];
            for(int i = 0; i < nums.length; i++)
                this.tree[i + 1] = nums[i];

            for(int i = 1; i < tree.length; i++) {
                int j = i + Integer.lowestOneBit(i);
                if (j < tree.length) tree[j] += tree[i];
            }
        }

        public int prefixSum(int i) {
            int sum = 0;
            while(i != 0) {
                sum += this.tree[i];
                i -= Integer.lowestOneBit(i);
            }
            return sum;
        }

        public void add(int i, int k) {
            while(i < tree.length) {
                tree[i] += k;
                i += Integer.lowestOneBit(i);
            }
        }

        public void update(int index, int val) {
            int old = this.nums[index];
            this.nums[index] = val;
            int i = index + 1;

            add(i, val - old);

        }

        public int sumRange(int left, int right) {
            return prefixSum(++right) - prefixSum(left);
        }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
}
