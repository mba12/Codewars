package com.michaelahern;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeSet;

public class LeetCode {

    public int[] addNegabinary(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        long one = tensPower(arr1);
        long two = tensPower(arr2);
        long total = one + two;
        String neg = negativeBase(total, -2l);

        int[] bitArr = new int[neg.length()];
        for(int i = 0; i < neg.length(); i++) {
            bitArr[i] = Integer.parseInt(String.valueOf(neg.charAt(i)));
        }
        return bitArr;

    }

    public String negativeBase(long integer, long base) {
        if(integer == 0) return "0";
        String result = "";
        long number = integer;
        while (number != 0) {
            long i = number % base;
            number /= base;
            if (i < 0) {
                i += Math.abs(base);
                number++;
            }

            result = i + result;
        }

        return result;
    }

    public int tensPower(int[] arr) {
        int total = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            if(arr[i] == 1)
                total += twoPower(len - 1 - i);
        }
        return total;
    }

    public int twoPower(int x) {
        int total = 1;
        if(x == 0) return 1;

        for(int i = 0; i < x; i++)
            total = total * 2;

        if(x % 2 == 0)
            return total;
        else
            return -total;
    }

    // Input: points = [[1,1],[3,4],[-1,0]]
    public int minTimeToVisitAllPoints(int[][] points) {

        int total = 0;
        int xDiff, yDiff;
        boolean yMin;

            for(int i = 0; i <= points.length - 2; i++) {
                int[] x1 = points[i];
                int[] x2 = points[i + 1];

                xDiff = Math.abs(x2[0] - x1[0]);
                yDiff = Math.abs(x2[1] - x1[1]);

                yMin = (yDiff <= xDiff);

                if(yMin) {
                    total += yDiff + (xDiff - yDiff);
                } else {
                    total += xDiff + (yDiff - xDiff);
                }
            }

        return total;

    }

    public String[] uncommonFromSentences(String A, String B) {

        Map<String, Integer> aMap = createMap(A);
        Map<String, Integer> bMap = createMap(B);
        List<String> answer = compareMaps(aMap, bMap);

        return answer.stream().toArray(String[]::new);

    }

    private List<String> compareMaps(Map<String, Integer> aMap, Map<String, Integer> bMap) {
        List<String> answer = new ArrayList<>();

        for (Map.Entry<String, Integer> item : aMap.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            if(value == 1 && !bMap.containsKey(key)) {
                answer.add(key);
            }
        }

        for (Map.Entry<String, Integer> item : bMap.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            if(value == 1 && !aMap.containsKey(key)) {
                answer.add(key);
            }
        }

        return answer;
    }


    private Map<String, Integer> createMap(String S) {
        String[] a = S.split(" ");
        Map<String, Integer> map = new HashMap<>();
        if(a == null || a.length == 0) return map;
        for(String s : a) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, (count + 1));
            } else {
                map.put(s, 1);
            }
        }

        return map;
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {

        if(root == null) return null;

        if(root.val < L) return trimBST(root.right, L, R);

        if(root.val > R) return trimBST(root.left, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }


    public int findSpecialInteger(int[] arr) {

        if(arr.length == 1) return arr[0];

        int count = arr.length;
        float percent = 0.25f * Integer.valueOf(count).floatValue();
        int max = Float.valueOf(percent).intValue() + 1;
        int[] map = new int[100000];

        for(int i = 0; i < arr.length; i++) {
            map[arr[i]]++;
            if(map[arr[i]] >= max) return arr[i];
        }
        return 0;
    }

    Map<Integer, Integer> tribMap = new HashMap<>();
    public int tribonacci(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int minus3 = getFibValue(n - 3);
        int minus2 = getFibValue(n - 2);
        int minus1 = getFibValue(n - 1);

        return minus3 + minus2 + minus1;

    }

    public int getFibValue(int n) {
        int value = 0;
        if(tribMap.containsKey(n)) {
            value = tribMap.get(n);
        } else {
            value = tribonacci(n);
            tribMap.put(n, value);
        }
        return value;
    }

    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int sIdx = 0;
        for(int i = 0; i < tArr.length; i++) {
            if(tArr[i] == sArr[sIdx]) sIdx++;
        }

        return sIdx == sArr.length;

    }

    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];

        int player = 0;
        int mark = 0;
        int count = 0;
        for(int[] move : moves) {
            mark = player % 2 == 0? 1 : -1;
            board[move[0]][move[1]] = mark;
            count++;
            player++;
        }

        for(int i = 0; i < 3; i++) {
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if(board[i][0] == 1) return "A"; else if(board[i][0] == -1) return "B";
            }
        }
        for(int i = 0; i < 3; i++) {
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if(board[0][i] == 1) return "A"; else if(board[0][i] == -1) return "B";
            }
        }
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if(board[0][0] == 1) return "A"; else if(board[0][0] == -1) return "B";
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            if(board[0][2] == 1) return "A"; else if(board[0][2] == -1) return "B";
        }

        return count == 9?"Draw":"Pending";

    }

    public int missingNumber(int[] nums) {

        int[] found = new int[nums.length + 1];
        for(int i : nums)
            found[i] = 1;

        for(int i = 0; i < found.length; i++)
            if(found[i] == 0) return i;

            return 0;

    }

    public String restoreString(String s, int[] indices) {
        char[] newS = new char[indices.length];

        for(int i = 0; i < indices.length; i++)
            newS[indices[i]] = s.charAt(i);

        return String.valueOf(newS);

    }

    public int maxSubArray2(int[] nums) {

        if(nums.length == 1) return nums[0];

        int total = nums[0];
        int globalMax = 0;
        for(int i = 1; i < nums.length; i++) {
            total = Math.max(nums[i], total + nums[i]);
            if(total > globalMax) globalMax = total;
        }
        return globalMax;
    }



    public int maxSubArray(int[] nums) {

        if(nums.length == 1) return nums[0];

        int total = 0;
        for(int i : nums) total += i;

        return Math.max(total, Math.max(maxSubHelper(true, total, nums, 0, nums.length - 2 ), maxSubHelper(false, total, nums, 1, nums.length - 1 ) ));

    }
    Map<String, Integer> map = new HashMap<>();
    public int maxSubHelper(boolean right, int total, int[] nums, int i, int j) {
        if (i == j) return Math.max(total, nums[i]);

        StringBuilder index = new StringBuilder();
        index.append(i); index.append(":"); index.append((j));

        if(map.containsKey(index.toString())) {
            return map.get(index.toString());
        }

        if(right) {
            total -= nums[j + 1];
        } else {
            total -= nums[i - 1];
        }

        int lv, rv;
        lv = maxSubHelper(true, total, nums, i, j - 1);
        rv = maxSubHelper(false, total, nums, i + 1, j);

        total =  Math.max(total, Math.max(lv, rv));
        map.put(index.toString(), total);
        return total;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return null;

        ListNode temp = null;
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode nextNode = head;
        if(nextNode != null) {
            while(nextNode.next != null) {
                if(nextNode.next.val == val) {
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
        }
        return head;
    }

    public int findDuplicate(int[] nums) {

        int diff = 1;
        while(diff < nums.length - 1) {
            for(int i = 0; (i + diff) < nums.length; i++) {
                if(nums[i] == nums[i + diff])
                    return nums[i];
            }
            diff++;
        }

        return 0;
    }
/*
    public int repeatedStringMatch(String A, String B) {

        if(A.equals(B)) return 1;
        char[] aChar = A.toCharArray();
        char[] bChar = B.toCharArray();

        int bIdx = 0;
        int aIdx = 0;

        while(aChar[aIdx] != bChar[bIdx]) {
            aIdx++;
            if(aIdx == aChar.length) return -1;
        }

        int count = 1;
        while(aChar[aIdx] == bChar[bIdx]) {
            aIdx++; bIdx++;
            if(aIdx == aChar.length) {
                count++;
                aIdx = 0;
            }
            if(bIdx == bChar.length) return count;
        }
        return -1;
    }

    private int repeatHeaper(char[] a, char[] b, int aIdx, int iIdx) {
        return 0;

    }

    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        if(root.left == null && root.right == null) return true;
        if(root.left == null) return false;
        if(root.right == null) return false;
        printInorderLeft(root.left, left);
        printInorderRight(root.right, right);

        if(left.size() != right.size()) return false;
        for(int i = 0; i < left.size(); i++) {
            Integer l = left.get(i);
            Integer r = right.get(i);
            if(l == null && r == null) continue;
            if(l == null && r != null) return false;
            if(r == null && l != null) return false;

            if(left.get(i) != right.get(i)) return false;

        }

        return true;

    }

    void printInorderLeft(TreeNode node, List<Integer> list)
    {
        if (node == null) {
            list.add(null);
            return;
        }

        list.add(node.val);
        printInorderLeft(node.left, list);
        printInorderLeft(node.right, list);
    }

    void printInorderRight(TreeNode node, List<Integer> list)
    {
        if (node == null) {
            list.add(null);
            return;
        }


        list.add(node.val);
        printInorderRight(node.right, list);
        printInorderRight(node.left, list);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.val + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

        public int repeatedStringMatch(String A, String B) {

            int lenA = A.length();
            int lenB = B.length();

            if(A.indexOf(B) >= 0) return 1;

            char[] aChar = A.toCharArray();
            char[] bChar = B.toCharArray();

            int count = -1;
            for(int i = 0; i < aChar.length; i++) {
                if(aChar[i] == bChar[0]) {
                    count = potentialMatch(i, aChar, bChar);

                    if(count > 0) break;
                }
            }

            return count;
        }

// A: "abcabcabcabc"
// BL          "abac"

// A: "bbbbbb"
// B: "bbbbbbb"

// "a"
// "aa"

    // "       aaaaaaaaaaaaaaaaaaaaa"
    // "bacbacbac"

//   abcabcabcabc
//     cabcabca

//  abaabaa
//     abaababaab"

        public int potentialMatch(int i, char[] aChar, char[] bChar) {  // i = 0,

            int bIdx = 0;
            int count = (i == 0)? 0 : 1;

            // System.out.println("i: " + i);

            while(aChar[i] == bChar[bIdx] && bIdx < bChar.length) {
                bIdx++; i++;
                if(bIdx == bChar.length) break;
                if(i == aChar.length && bIdx < bChar.length ) {
                    i = 0;
                    count++;
                }
            }

            if ( i == 0 && bIdx < bChar.length && aChar[0] != bChar[bIdx])
                return -1;

            if(i > 0 && bIdx < bChar.length && aChar[i] != bChar[bIdx] )
                return -1;
            else if(aChar.length * count < bChar.length)
                count++;
            //else if(bIdx == bChar.length && aChar[0] == bChar[bIdx - 1])
            //    count++;

            if (count <= 1)
                return -1;
            else
                return count;
        }
    //  ["a","a","b","b","c","c","c"]
    public int compress(char[] chars) {

        if(chars.length == 1) return 1;

        int i = 0; int nextIdx = 0; int printNext = 0;
        int streak = 0;
        while(nextIdx < chars.length) {
            char current = chars[i];
            // currentIdx = i;
            nextIdx = i + 1;
            while(nextIdx < chars.length && current == chars[nextIdx]) {
                nextIdx++;
            }

            if(nextIdx - streak > 1) {
                if(nextIdx - streak < 9) {
                    chars[printNext] = current;
                    chars[printNext + 1] = ((char) (48 + nextIdx - streak));
                    printNext = printNext + 2;
                } else {
                    char[] digits = String.valueOf(nextIdx - streak).toCharArray();
                    int idx = 1;
                    chars[printNext] = current;
                    for(char c : digits)
                        chars[printNext + (idx++)] = c;
                    printNext = printNext + idx;
                }
            } else if (nextIdx - streak == 1) {
                chars[printNext] = current;
                printNext++;
            }
            streak = nextIdx;
            i = nextIdx;
        }
        return printNext;
    }



    public boolean buddyStrings(String A, String B) {

        char[] aArr = A.toCharArray();
        char[] bArr = B.toCharArray();

        if(aArr.length != bArr.length) return false;
        if(aArr.length < 2 || bArr.length < 2) return false;

        int len = aArr.length;
        int count = 0;
        int[] indices = new int[2];
        int[] aletterCount = new int['z' + 1];
        int[] bletterCount = new int['z' + 1];
        for(int i = 0; i < len; i++) {
            if(aArr[i] != bArr[i]) {
                if(count < 2) indices[count] = i;
                count++;
            }
            aletterCount[aArr[i]]++;
            bletterCount[bArr[i]]++;

            if(count > 2) return false;
            if (i == len - 1 && count == 2) {
                if(aArr[indices[0]] == bArr[indices[1]] &&
                        aArr[indices[1]] == bArr[indices[0]])
                    return true;
                else
                    return false;
            }
        }

        if(len == 2) {
            if(aArr[0] == bArr[1] &&
                    aArr[1] == bArr[0])
                return true;
            else
                return false;
        } else if (len > 2) {
            int sumA = 0, sumB = 0;
            for(int i = 'a'; i <= 'z'; i++) {
                if(aletterCount[i] != bletterCount[i])
                    return false;

            }

            int oneCount = 0;
            for(int i = 'a'; i <= 'z'; i++) {
                if(aletterCount[i] > 1)
                    return true;
                else if(aletterCount[i] == 1 )
                    oneCount++;
            }
            if(oneCount == len) return false;


            return true;
        }

        return A.equals(B);
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> tMap = new HashMap<>();
        Map<Integer, Integer> aMap = new HashMap<>();

        for(int i = 0; i < target.length; i++) {
            canBeEqualHelper(target[i], tMap);
            canBeEqualHelper(arr[i], aMap);
        }
        //Union of keys from both maps
        HashSet<Integer> unionKeys = new HashSet<>(tMap.keySet());
        unionKeys.addAll(aMap.keySet());

        unionKeys.removeAll(tMap.keySet());
        if(unionKeys.size() > 0) return false;

        for (Map.Entry<Integer, Integer> entry : tMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            Integer x = aMap.get(key);
            if(x == null || !x.equals(value)) return false;
        }

        return true;

    }

    public void canBeEqualHelper(int i, Map<Integer, Integer> map) {
        if(map.containsKey(i)) {
            int x = map.get(i);
            map.put(i, x + 1);
        } else {
            map.put(i, 1);
        }
    }

    public int titleToNumber(String s) {
        int[] digits = new int[s.length()];
        byte[] charBytes = s.getBytes(StandardCharsets.US_ASCII);
        for(int i = 0; i < charBytes.length; i++) {
            digits[i] = ((int) charBytes[i]) - 65;
        }
        int total = 0;
        for(int i = digits.length - 1; i > -1; i--) {
            total += digits[i] * (int) Math.pow(26, digits.length - 1 - i);
        }
        return total;
    }

    public String convertToTitle(int n) {

        int x = n;
        StringBuilder str = new StringBuilder();
        while(x > 0) {
            int digit = x % 26;
            if(digit == 0) {
                str.append('Z');
                x = x - 1;
            } else
                str.append((char) (digit + 64));

            x = x / 26;
        }

        return str.reverse().toString();
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return findTargetHelper(root, set, k);
    }

    public boolean findTargetHelper(TreeNode root, Set<Integer> set, int k) {

        if(root == null) return false;
        boolean returnVal1 = false, returnVal2 = false, returnVal3 = false;
        int target = k - root.val;
        if(set.contains(target)) {
            returnVal1 = true;
        }
        set.add(root.val);
        if(root.right != null) {
            returnVal2 = findTargetHelper(root.right, set, k);
        }
        if(root.left != null) {
            returnVal3 = findTargetHelper(root.left, set, k);
        }
        return returnVal1 || returnVal2 || returnVal3;
    }

    public int trailingZeroes(int n) {

        int count = 0;
        for(int i = 1; i <= n; i++) {
            int fivePower = 5;
            while(fivePower <= n) {
                if (n % fivePower == 0) count++;
                fivePower = fivePower * 5;
            }
        }

        return count;
    }

    private static Map<Integer, Character> hexMap = new HashMap();
    static {
        hexMap.put(0, '0');
        hexMap.put(1, '1');
        hexMap.put(2, '2');
        hexMap.put(3, '3');
        hexMap.put(4, '4');
        hexMap.put(5, '5');
        hexMap.put(6, '6');
        hexMap.put(7, '7');
        hexMap.put(8, '8');
        hexMap.put(9, '9');
        hexMap.put(10, 'a');
        hexMap.put(11, 'b');
        hexMap.put(12, 'c');
        hexMap.put(13, 'd');
        hexMap.put(14, 'e');
        hexMap.put(15, 'f');
    }

    public String toHex(int num) {

        if(num == 0) return "0";
        StringBuilder str = new StringBuilder();
        while(num != 0) {
            // int d =  num % (int) Math.pow(16, power++);
            int d = num & 15;
            num = num >>> 4;
            str.append(hexMap.get(d));
        }

        return str.reverse().toString();
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

    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int[] totals = new int[nums.length];
        totals[0] = nums[0];
        for(int i = 1; i < totals.length; i++)
            totals[i] = totals[i - 1] + nums[i];

        for(int i = 0; i < totals.length; i++) {
            if(totals[i] == k) count++;
            for(int j = i+1; j < totals.length; j++) {

                int total = totals[j] - totals[i];
                if (total == k) count++;
            }
        }
        return count;
    }

    List<Integer> answer = new ArrayList<>();
    int maxDepth = 0; int leftDepth = 0; int currentDepth = 0;
    public List<Integer> rightSideView(TreeNode root) {

        if(root == null) return answer;

        answer.add(root.val);

        if(root.right != null) {
            rightSideViewHelper(root.right, 1);
        }
        leftSideView(root.left, 1);
        return answer;
    }

    public List<Integer> rightSideViewHelper(TreeNode root, int currentDepth) {

        if(root == null) return answer;
        if(currentDepth > maxDepth) {
            answer.add(root.val);
            maxDepth++;
        }
        if(root.right != null) {
            rightSideViewHelper(root.right, currentDepth + 1);
        }
        if(root.left != null) {
            rightSideViewHelper(root.left, currentDepth + 1);
        }
        return answer;
    }

    public List<Integer> leftSideView(TreeNode root, int currentDepth) {

        if(root == null) return answer;

        if(currentDepth > maxDepth) {
            answer.add(root.val);
            maxDepth++;
        }

        if(root.right != null) {
            leftSideView(root.right, currentDepth + 1);
        } else if(root.left != null) {
            leftSideView(root.left, currentDepth + 1);
        }
        return answer;
    }

    public int idx;
    public int idxValue;
    public int findKthLargest(int[] nums, int k) {

        if(k == 1) return nums[0];
        idx = k - 1;
        int j = nums.length - k;

        sort(nums, 0, nums.length - 1, j);
        System.out.println(Arrays.toString(nums));
        return idxValue;
    }

    void sort(int arr[], int l, int r, int j) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m, j);
            sort(arr, m + 1, r, j);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            if(k == idx) {idxValue = arr[k]; return;}
            k++;

        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            if(k == idx) {idxValue = arr[k]; return;}
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            if(k == idx) {idxValue = arr[k]; return;}
            j++;
            k++;
        }
    }


}
