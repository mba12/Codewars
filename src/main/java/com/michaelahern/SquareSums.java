package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SquareSums {

    private static Set<Integer> perfectSquares = new HashSet<>();
    public static Set<Integer> createPerfectSquares() {
        int[] sqs = new int[57];
        sqs[0] =    0;
        sqs[1] =    1;
        sqs[2] =    4;
        sqs[3] =	9;
        sqs[4] =	16;
        sqs[5] =	25;
        sqs[6] =	36;
        sqs[7] =	49;
        sqs[8] =	64;
        sqs[9] =	81;
        sqs[10] =	100;
        sqs[11] =   121;
        sqs[12] =	144;
        sqs[13] =	169;
        sqs[14] =	196;
        sqs[15] =	225;
        sqs[16] =	256;
        sqs[17] =	289;
        sqs[18] =	324;
        sqs[19] =	361;
        sqs[20] =	400;
        sqs[21] =	441;
        sqs[22] =	484;
        sqs[23] =	529;
        sqs[24] =	576;
        sqs[25] =	625;
        sqs[26] =	676;
        sqs[27] =	729;
        sqs[28] =	784;
        sqs[29] =	841;
        sqs[30] =	900;
        sqs[31] =	961;
        sqs[32] =	1024;
        sqs[33] =	1089;
        sqs[34] =	1156;
        sqs[35] =	1225;
        sqs[36] =	1296;
        sqs[37] =	1369;
        sqs[38] =	1444;
        sqs[39] =	1521;
        sqs[40] =	1600;
        sqs[41] =	1681;
        sqs[42] =	1764;
        sqs[43] =	1849;
        sqs[44] =	1936;
        sqs[45] =	2025;
        sqs[46] =	2116;
        sqs[47] =	2209;
        sqs[48] =	2304;
        sqs[49] =	2401;
        sqs[50] =	2500;
        sqs[51] =	2601;
        sqs[52] =	2704;
        sqs[53] =	2809;
        sqs[54] =	2916;
        sqs[55] =	3025;
        sqs[56] =	3136;

        for(int i = 2; i < 57; i++) {
            perfectSquares.add(sqs[i]);
        }
        return perfectSquares;
    }

    private static int[][] GRAPH = new int[1601][];

    static {
        createMasterGraph(1601);
    }

    public static void createMasterGraph(int n) {
        Set<Integer> perfectSquares = createPerfectSquares();

        int nextNumber, count;
        int[] adjNodes = new int[40];
        for(int i = 1; i < n; i++) {
            count = 0;
            for(int j = 1; j <= n; j++) {
                nextNumber = i + j;
                if(perfectSquares.contains(nextNumber)) {
                    adjNodes[count++] = j;
                }
            }
            int[] part = Arrays.copyOfRange(adjNodes, 0, count);
            GRAPH[i] = part;
        }
    }

    public static int[] createGraph(int size) {
        // will contain the index + 1 of all the edges.
        int [] largestEdge = new int[size + 1];
        int index = 0;
        for(int i = 1; i <= size; i++) {
            int[] row = GRAPH[i];
            index = Arrays.binarySearch(row, size);
            if(index > 0)
                largestEdge[i] = index;
            else
                largestEdge[i] = -(index + 2);
        }
        return largestEdge;
    }

    public static Map<Integer, List<Integer>> buildKeySizeMap(int [] keysIndex, int size) {
        // make a map with edge size as the key and a list of nodes with that size
        Map<Integer, List<Integer>> keySizeToNodes = new HashMap<>();
        for(int i = 1; i <= size; i++) {
            List<Integer> list = keySizeToNodes.getOrDefault(keysIndex[i], new ArrayList<Integer>());
            list.add(i);
            keySizeToNodes.put(keysIndex[i], list);
        }

        return keySizeToNodes;
    }

    public static List<Integer> buildUpTo(int size) {
        if(size < 15 || (size > 17 && size < 23) || size == 24) return null;

        int[] largestEdgeIndexPerNode = createGraph(size);
        // build a map with size, keys of that size
        Map<Integer, List<Integer>> keySizeMap = buildKeySizeMap(largestEdgeIndexPerNode, size);
        List<Integer> rootNodes;
        // find the smallest key size
        for(int i = 1; i <= keySizeMap.size(); i++) {
            if(keySizeMap.containsKey(i)) {
                rootNodes = keySizeMap.get(i);
                for(int root : rootNodes) {
                    Set<Integer> visited = new HashSet<>();
                    Stack<Integer> result = new Stack<>();
                    int depth = 0;
                    dfs(root, visited, result, size, largestEdgeIndexPerNode, depth + 1);
                    if(result.size() == size)
                        return result;
                }
            }
        }

        return null;
    }

    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {

                // sorting in descending order
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });

    }

    private static Stack<Integer> dfs(int rootNode, Set<Integer> visited,
                                      Stack<Integer> result, int size, int[] numberOfEdgesPerNode, int depth) {

        visited.add(rootNode);
        result.push(rootNode);
        if(visited.size() == size) {
            return result;
        }

//        System.out.println(depth + " :: " +
//                           Arrays.toString(result.toArray()));
//        System.out.println(depth + " :: " +
//                           Arrays.toString(visited.toArray()));

        int[] adjList = GRAPH[rootNode];
        int[][] adjListSize = new int[numberOfEdgesPerNode[rootNode]+1][];
        for(int i = 0; i < numberOfEdgesPerNode[rootNode]+1; i++) {
            int[] row = new int[2];
            if (visited.contains(adjList[i])) {
                row[0] = adjList[i];
                row[1] = -1;
            } else {
                row[0] = adjList[i];
                row[1] = numberOfEdgesPerNode[adjList[i]];
            }
            adjListSize[i] = row;
        }
        if(adjListSize.length > 1)
            sortbyColumn(adjListSize, 1);

        for(int i = 0; i < adjListSize.length; i++) {
            if(adjListSize[i][1] == -1) continue;
            result = dfs(adjListSize[i][0], visited, result, size, numberOfEdgesPerNode, depth + 1);
            if(result.size() == size)
                return result;
        }
        if (!result.isEmpty()) {
            result.pop();
            visited.remove(rootNode);
        }
        return result;
    }
}
