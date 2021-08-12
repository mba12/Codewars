package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SquareSumsN5 {

    private static HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    private static final int[] sqs = new int[60];
    private static final Set<Integer> perfectSquares = new HashSet<>();
    static {
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
        sqs[57] =	3249;

        for(int i = 2; i < 58; i++) {
            perfectSquares.add(sqs[i]);
        }

        for(int i = 3; i < 1600; i++) {
            SquareSumsN5.buildUpTo( i );
        }
    }

    public static int[][] buildMatrixGraph(int n, Set<Integer> squaresSet) {

        int nextNumber = 0;
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = i; j < n; j++) {
                if(i == j) continue;
                nextNumber = (i+1) + (j+1);
                if(squaresSet.contains(nextNumber)) {
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
            }
        }

        return matrix;
    }

    public static List<Integer> findNext(List<Integer> list, Integer nextNumber) {

        int size = list.size() - 1;
        int firstNumber, secondNumber;
        List<Integer> answer = null;
        for(int i = 0; i < size; i++) {
            firstNumber = list.get(i) + nextNumber;
            if(!perfectSquares.contains(firstNumber)) continue;
            secondNumber = list.get(i + 1) + nextNumber;
            if(perfectSquares.contains(secondNumber)) {
                // answer = new ArrayList(list);
                answer = new LinkedList<>(list);
                answer.add(i + 1, nextNumber);
                // System.out.println("N+1 solution for: " + nextNumber);
                return answer;
            }
        }
        return null;
    }

    public static Set<Integer> createPerfectSquares() {
        Set<Integer> perfectSquares = new HashSet<>();
        int[] sqs = new int[60];
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
            sqs[57] =	3249;

            for(int i = 2; i < 58; i++) {
                perfectSquares.add(sqs[i]);
            }
            return perfectSquares;
    }


    public static void createGraphJSON(int n) {
        Set<Integer> perfectSquares = createPerfectSquares();
        int nextNumber;
        List<List<Integer>> graphMap = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            Set<Integer> row = new HashSet<>();
            for(int j = i; j <= n; j++) {
                nextNumber = i + j;
                if(perfectSquares.contains(nextNumber)) {
                    row.add(j);
                }
            }
            List<Integer> rowList = new ArrayList<>(row);
            Collections.sort(rowList);
            System.out.print("G[" + i + "]=");
            System.out.print(rowList);
            System.out.println(";");

            // graphMap.add(rowList);
        }
        // System.out.println(graphMap);

    }


    public static List<Integer> buildUpTo(int n) {
        // System.out.println(n );
        if(n < 15 || (n > 17 && n < 23) || n == 24) return null;


        /*
        if(map.containsKey(n - 1)) {
            List<Integer> previous = map.get(n - 1);
            if(previous != null) {
                List<Integer> answer = checkPrevious(n, previous, squaresSet);
                if(answer != null) {
                    // System.out.println("HIT: " + n );
                    return answer;
                }
            }
        }
        */

//        if(n == 17) {
//            System.out.println("We are on 17");
//        }

        if (map.containsKey((n))) {
            return map.get(n);
        } else if(map.containsKey(n - 1)) {
            List<Integer> previous = map.get(n - 1);
            if(previous != null) {
                List<Integer> answer = findNext(previous, n);
                if(answer != null) {
                    map.put(n, answer);
                    return answer;
                }
            }
        }

        Set<Integer> squaresSet = setupSquareSet(n);
        int[][] distance = buildMatrixGraph(n, squaresSet);
        List<Integer> answer = solve(distance);

        List<Integer> finalAnswer = null;

        if(answer != null && answer.size() > 0) {
            finalAnswer = new LinkedList<>();
            for(int i=0; i < n; i++) {
                finalAnswer.add(answer.get(i) + 1);
            }
        }
        map.put(n, finalAnswer);
        long end = System.currentTimeMillis();
        // System.out.println( (end - start) + " :: " + procedure_1_total + " :: " + procedure_2_total);
        return finalAnswer;
    }

    public static List<Integer> checkPrevious(int n, List<Integer> answer, Set<Integer> squares) {

        int x = answer.get(0);
        for(int i=1; i < answer.size(); i++) {
            int y = answer.get(i);
            if(squares.contains(x + n) && squares.contains(y + n)) {
                answer.add(i, n);
                return answer;
            }
            x = y;
        }
        return null;
    }

    public static Set<Integer> setupSquareSet(int n) {
        int largestSquare = n + n - 1;
        Set<Integer> squares = new HashSet<>();
        int c = 2;
        while(sqs[c] <= largestSquare) {
            squares.add(sqs[c]);
            c++;
        }
        squares.remove(sqs[c]);
        return squares;
    }

    private static int pathSize = 0;
    public static List<Integer> solve(int[][] graph) {
        boolean solved = false;
        int i, k, n, vertex;

        n = graph.length;

        neighbor = new int[n];
        int[] index = sort(graph, n);
        graph = reindex(graph, index, n);
        List<Integer> answer = null;
        int[] path = new int[n];
        for (vertex = 0; vertex < n; vertex++) {

            answer = new LinkedList<>();
            // ArrayList<Integer> path = new ArrayList<>(n);
            Arrays.fill(path, 0);
            pathSize = 0;
            path[pathSize++] = vertex;
            path = procedure_1(graph, path);
            path = procedure_2(graph, path);
            k = pathSize;
            if (k < n) { path = procedure_2b(graph, path); k = pathSize; }
            if (k < n) { path = procedure_2c(graph, path); k = pathSize; }
            if (k < n) {
                solved = false;
            } else {
                solved = true;
            }
            for (i = 0; i < pathSize; i++) {
                answer.add(index[path[i]]);
            }
            if(solved) return answer;
        }

        if(solved)
            return answer;
        else
            return null;

    }
    private static int extPathIdx = 0;
    private static int[] neighbor;
    private static long procedure_1_total = 0;
    private static long start = 0;
    private static long end = 0;
    private static int[] procedure_1(int[][] graph, int[] path) {
        start = System.currentTimeMillis();
        int i, j, k;
        int n = graph.length;
        // List<Integer> neighbor = new ArrayList<>(n);
        ArrayList<Integer> next_neighbor = new ArrayList<>();

        int[] extended_path = new int[n]; extPathIdx = 0;
        int[] visited = new int[n];

        // for (i = 0; i < n; i++) {
        //     visited.add(0);
        // }
        int present = 0;
        for (i = 0; i < pathSize; i++) {
            present = path[i];
            visited[present] = 1;
            extended_path[extPathIdx++]  = present;
        }
        for (k = 0; k < n; k++) {
            // neighbor.clear();
            Arrays.fill(neighbor, 0);
            int neighborIdx = 0;
            for (i = 0; i < n; i++) {
                if (graph[present][i] == 1 && visited[i] == 0) {
                    neighbor[neighborIdx++] = i;
                }
            }
            if (neighborIdx > 0) {
                int choice = neighbor[0];
                int minimum = n;
                for (i = 0; i < neighborIdx; i++) {
                    next_neighbor.clear();
                    for (j = 0; j < n; j++) {
                        if (graph[neighbor[i]][j] == 1 && visited[j] == 0) {
                            next_neighbor.add(j);
                        }
                    }
                    int eta = next_neighbor.size();
                    if (eta < minimum) {
                        choice = neighbor[i];
                        minimum = eta;
                    }
                }
                present = choice;
                visited[present] =  1;
                extended_path[extPathIdx++] = present;
                if(extPathIdx > n) {
                    System.out.println("N: " + n + " EP: " + extPathIdx);
                }
            } else {
                break;
            }
        }
        pathSize = extPathIdx;
        end = System.currentTimeMillis();
        procedure_1_total += (end - start) ;
        return extended_path;
    }

    private static long procedure_2_total = 0;
    private static int[] procedure_2(int[][] graph, int[] path) {
        start = System.currentTimeMillis();
        int i, j, k;
        int n = graph.length;
        boolean quit = false;
        while (!quit) {
            int m = pathSize;
            int inlet = -1;
            int outlet = -1;
            ArrayList<Integer> neighbor = new ArrayList<>(n);
            for (i = 0; i < pathSize; i++) {
                if (graph[path[m - 1]][path[i]] == 1) {
                    neighbor.add(i);
                }
            }
            ArrayList<Integer> unvisited = new ArrayList<>(n);
            for (i = 0; i < n; i++) {
                boolean outside = true;
                for (j = 0; j < pathSize; j++) {
                    if (i == path[j]) {
                        outside = false;
                    }
                }
                if (outside) {
                    unvisited.add(i);
                }
            }
            if ((!unvisited.isEmpty()) && (!neighbor.isEmpty())) {
                int maximum = 0;
                for (i = 0; i < neighbor.size(); i++) {
                    for (j = 0; j < unvisited.size(); j++) {
                        if (graph[path[neighbor.get(i) + 1]][unvisited.get(j)] == 1) {
                            ArrayList<Integer> next_neighbor = new ArrayList<Integer>();
                            for (k = 0; k < unvisited.size(); k++) {
                                if (graph[unvisited.get(j)][unvisited.get(k)] == 1) {
                                    next_neighbor.add(unvisited.get(k));
                                }
                            }
                            int eta = next_neighbor.size();
                            if (eta >= maximum) {
                                inlet = neighbor.get(i);
                                outlet = unvisited.get(j);
                                maximum = eta;
                            }
                        }
                    }
                }
            }
            ArrayList<Integer> extended_path = new ArrayList<>(n);
            if (inlet != -1 && outlet != -1) {
                for (i = 0; i <= inlet; i++) {
                    extended_path.add(path[i]);
                }
                for (i = pathSize - 1; i > inlet; i--) {
                    extended_path.add(path[i]);
                }
                extended_path.add(outlet);
            }
            if (!extended_path.isEmpty()) {
                path = extended_path.stream().mapToInt(Integer::intValue).toArray();
                pathSize = extended_path.size();
            }
            if (m < pathSize) {
                path = procedure_1(graph, path);
            } else {
                quit = true;
            }
        }
        end = System.currentTimeMillis();
        procedure_2_total += (end - start) ;
        return path;
    }

    private static int[] procedure_2b(int[][] graph, int[] path)
    {
        int i, j, k, l, p;
        int n = graph.length;
        boolean quit = false;
        while (!quit) {
            ArrayList<Integer> extended_path = new ArrayList<>(n);
            int m = pathSize;
            ArrayList<Integer> unvisited = new ArrayList<>(n);
            for (i = 0; i < n; i++) {
                boolean outside = true;
                for (j = 0; j < pathSize; j++) {
                    if (i == path[j]) {
                        outside = false;
                    }
                }
                if (outside) {
                    unvisited.add(i);
                }
            }
            boolean big_check = false;
            for (i = 0; i < pathSize; i++) {
                for (j = 0; j < unvisited.size(); j++) {
                    if (graph[unvisited.get(j)][path[i]] == 1) {
                        ArrayList<Integer> temp_path = new ArrayList<>(n);
                        temp_path.add(unvisited.get(j));
                        ArrayList<Integer> temp_extended_path = new ArrayList<>(n);
                        ArrayList<Integer> temp_visited = new ArrayList<>(n);
                        for (l = 0; l < n; l++) {
                            temp_visited.add(0);
                        }
                        int present = 0;
                        for (l = 0; l < temp_path.size(); l++) {
                            present = temp_path.get(l);
                            temp_visited.set(present, 1);
                            temp_extended_path.add(present);
                        }
                        for (l = 0; l < n; l++) {
                            boolean unfound = true;
                            for (k = 0; k < unvisited.size(); k++) {
                                if (l == unvisited.get(k)) {
                                    unfound = false;
                                }
                            }
                            if (unfound) {
                                temp_visited.set(l, 1);
                            }
                        }
                        for (l = 0; l < n; l++) {
                            ArrayList<Integer> neighbor = new ArrayList<>(n);
                            for (l = 0; l < n; l++) {
                                if (graph[present][l] == 1 && temp_visited.get(l) == 0) {
                                    neighbor.add(l);
                                }
                            }
                            if (!neighbor.isEmpty()) {
                                int choice = neighbor.get(0);
                                int minimum = n;
                                for (l = 0; l < neighbor.size(); l++) {
                                    ArrayList<Integer> next_neighbor = new ArrayList<>(n);
                                    for (k = 0; k < n; k++) {
                                        if (graph[neighbor.get(l)][k] == 1 && temp_visited.get(k) == 0) {
                                            next_neighbor.add(k);
                                        }
                                    }
                                    int eta = next_neighbor.size();
                                    if (eta < minimum) {
                                        choice = neighbor.get(l);
                                        minimum = eta;
                                    }
                                }
                                present = choice;
                                temp_visited.set(present, 1);
                                temp_extended_path.add(present);
                            } else {
                                break;
                            }
                        }
                        int last_vertex = temp_extended_path.get(temp_extended_path.size() - 1);
                        int vj = 0;
                        boolean check = false;
                        while (!check && !temp_extended_path.isEmpty()) {
                            for (p = pathSize - 2; p > i; p--) {
                                if (graph[path[p]][last_vertex] == 1 && graph[path[i + 1]][path[p + 1]] == 1) {
                                    check = true;
                                    vj = p;
                                    break;
                                }
                            }
                            if (!check  && !temp_extended_path.isEmpty()) {
                                Integer last = temp_extended_path.remove(temp_extended_path.size() - 1);
                                if (temp_extended_path.isEmpty()) {
                                    last_vertex = last;
                                } else {
                                    last_vertex = temp_extended_path.get(temp_extended_path.size() - 1);
                                }
                            }
                        }
                        if (check) {
                            ArrayList<Integer> temp = new ArrayList<Integer>(n);
                            for (p = 0; p <= i; p++) {
                                temp.add(path[p]);
                            }
                            for (p = 0; p < temp_extended_path.size(); p++) {
                                temp.add(temp_extended_path.get(p));
                            }
                            for (p = vj; p > i; p--) {
                                temp.add(path[p]);
                            }
                            for (p = vj + 1; p < pathSize; p++) {
                                temp.add(path[p]);
                            }
                            temp_extended_path = new ArrayList<>(temp);
                            big_check = true;
                            extended_path = new ArrayList<>(temp_extended_path);
                        }
                    }
                }
                if (big_check) {
                    break;
                }
            }
            if (!extended_path.isEmpty()) {
                path = extended_path.stream().mapToInt(Integer::intValue).toArray();
                pathSize = extended_path.size();
            }
            if (m < pathSize) {
                path = procedure_1(graph,path);
                path = procedure_2(graph,path);
            } else {
                quit = true;
            }
        }
        return path;
    }

    private static int[] procedure_2c(int[][] graph, int[] path) {

        int[] reversed_path = new int[graph.length];
        int index = 0;
        for (int i = pathSize - 1; i >= 0; i--) {
            reversed_path[index++] = path[i];
        }
        reversed_path = procedure_2b(graph, reversed_path);
        return reversed_path;
    }

    private static int[] sort(int[][] graph, int size) {
        int i;
        int j;
        int[] degree = new int[size];
        for (i = 0; i < graph.length; i++) {
            int sum = 0;
            for (j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 1) {
                    sum++;
                }
            }
            degree[i] = sum;
        }
        int[] index = new int[size];
        for (i = 0; i < size; i++) {
            index[i] = i;
        }

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (degree[i] < degree[j]) {
                    index[i] = index[i] ^ index[j];
                    index[j] = index[i] ^ index[j];
                    index[i] = index[i] ^ index[j];
                }
            }
        }
        return index;
    }

    private static int[][] reindex(int[][] graph, int[] index, int size) {
        int i, j;
        int[][] temp= Arrays.stream(graph).map(a -> Arrays.copyOf(a, a.length)).toArray(int[][]::new);

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                temp[i][j] = graph[index[i]][index[j]];
            }
        }
        return temp;
    }
}