package com.michaelahern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SquareSums {

    private static final int[] sqs = new int[60];
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
        sqs[58] =	3364;
        sqs[59] =	3481;

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

    public static List<Integer> buildUpTo(int n) {
        System.out.print(n + ": ");
        long start = System.currentTimeMillis();

        Set<Integer> squaresSet = setupSquareSet(n);
        int[][] distance = buildMatrixGraph(n, squaresSet);
        List<Integer> answer = solve(distance);

        List<Integer> finalAnswer = null;

        if(answer != null && answer.size() > 0) {
            finalAnswer = new ArrayList<>();
            for(int i=0; i < n; i++) {
                finalAnswer.add(answer.get(i) + 1);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return finalAnswer;
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

    public static List<Integer> solve(int[][] graph) {
        boolean solved = false;
        int i, j, k, n, vertex;

        n = graph.length;

        ArrayList<Integer> index = sort(graph, n);
        graph = reindex(graph, index, n);
        List<Integer> answer = null;
        for (vertex = 0; vertex < n; vertex++) {

            answer = new ArrayList<>();
            ArrayList<Integer> path = new ArrayList<>(n);
            path.add(vertex);
            path = procedure_1(graph, path);
            path = procedure_2(graph, path);
            k = path.size();
            if (k < n) { path = procedure_2b(graph, path); k = path.size(); }
            if (k < n) { path = procedure_2c(graph, path); k = path.size(); }
            if (k < n) {
                solved = false;
            } else {
                solved = true;
            }
            for (i = 0; i < path.size(); i++) {
                answer.add(index.get(path.get(i)));
            }
            if(solved) return answer;
        }

        if(solved)
            return answer;
        else
            return null;

    }

    private static ArrayList<Integer> procedure_1(int[][] graph, ArrayList<Integer> path) {
        int i, j, k;
        int n = graph.length;
        List<Integer> extended_path = new ArrayList<>(n);
        List<Integer> visited = new ArrayList<>(n);
        for (i = 0; i < n; i++) {
            visited.add(0);
        }
        int present = 0;
        for (i = 0; i < path.size(); i++) {
            present = path.get(i);
            visited.set(present, 1);
            extended_path.add(present);
        }
        for (k = 0; k < n; k++) {
            List<Integer> neighbor = new ArrayList<>(n);
            for (i = 0; i < n; i++) {
                if (graph[present][i] == 1 && visited.get(i) == 0) {
                    neighbor.add(i);
                }
            }
            if (!neighbor.isEmpty()) {
                int choice = neighbor.get(0);
                int minimum = n;
                for (i = 0; i < neighbor.size(); i++) {
                    ArrayList<Integer> next_neighbor = new ArrayList<>();
                    for (j = 0; j < n; j++) {
                        if (graph[neighbor.get(i)][j] == 1 && visited.get(j) == 0) {
                            next_neighbor.add(j);
                        }
                    }
                    int eta = next_neighbor.size();
                    if (eta < minimum) {
                        choice = neighbor.get(i);
                        minimum = eta;
                    }
                }
                present = choice;
                visited.set(present, 1);
                extended_path.add(present);
                if(extended_path.size() > n) {
                    System.out.println("N: " + n + " EP: " + extended_path.size());
                }
            } else {
                break;
            }
        }
        return new ArrayList<Integer>(extended_path);
    }

    private static ArrayList<Integer> procedure_2(int[][] graph, ArrayList<Integer> path) {
        int i, j, k;
        int n = graph.length;
        boolean quit = false;
        while (quit != true) {
            int m = path.size();
            int inlet = -1;
            int outlet = -1;
            ArrayList<Integer> neighbor = new ArrayList<>(n);
            for (i = 0; i < path.size(); i++) {
                if (graph[path.get(m - 1)][path.get(i)] == 1) {
                    neighbor.add(i);
                }
            }
            ArrayList<Integer> unvisited = new ArrayList<>(n);
            for (i = 0; i < n; i++) {
                boolean outside = true;
                for (j = 0; j < path.size(); j++) {
                    if (i == path.get(j)) {
                        outside = false;
                    }
                }
                if (outside == true) {
                    unvisited.add(i);
                }
            }
            if ((!unvisited.isEmpty()) && (!neighbor.isEmpty())) {
                int maximum = 0;
                for (i = 0; i < neighbor.size(); i++) {
                    for (j = 0; j < unvisited.size(); j++) {
                        if (graph[path.get(neighbor.get(i) + 1)][unvisited.get(j)] == 1) {
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
                    extended_path.add(path.get(i));
                }
                for (i = path.size() - 1; i > inlet; i--) {
                    extended_path.add(path.get(i));
                }
                extended_path.add(outlet);
            }
            if (!extended_path.isEmpty()) {
                path = new ArrayList<>(extended_path);
            }
            if (m < path.size()) {
                path = procedure_1(graph, path);
            } else {
                quit = true;
            }
        }
        return new ArrayList<Integer>(path);
    }

    private static ArrayList<Integer> procedure_2b(int[][] graph, ArrayList<Integer> path)
    {
        int i, j, k, l, p;
        int n = graph.length;
        boolean quit = false;
        while (quit != true) {
            ArrayList<Integer> extended_path = new ArrayList<>(n);
            int m = path.size();
            ArrayList<Integer> unvisited = new ArrayList<>(n);
            for (i = 0; i < n; i++) {
                boolean outside = true;
                for (j = 0; j < path.size(); j++) {
                    if (i == path.get(j)) {
                        outside = false;
                    }
                }
                if (outside) {
                    unvisited.add(i);
                }
            }
            boolean big_check = false;
            for (i = 0; i < path.size(); i++) {
                for (j = 0; j < unvisited.size(); j++) {
                    if (graph[unvisited.get(j)][path.get(i)] == 1) {
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
                            for (p = path.size() - 2; p > i; p--) {
                                if (graph[path.get(p)][last_vertex] == 1 && graph[path.get(i + 1)][path.get(p + 1)] == 1) {
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
                                temp.add(path.get(p));
                            }
                            for (p = 0; p < temp_extended_path.size(); p++) {
                                temp.add(temp_extended_path.get(p));
                            }
                            for (p = vj; p > i; p--) {
                                temp.add(path.get(p));
                            }
                            for (p = vj + 1; p < path.size(); p++) {
                                temp.add(path.get(p));
                            }
                            temp_extended_path = new ArrayList<>(temp);
                            big_check = true;
                            extended_path = new ArrayList<>(temp_extended_path);
                        }
                    }
                }
                if (big_check == true) {
                    break;
                }
            }
            if (!extended_path.isEmpty()) {
                path = new ArrayList<Integer>(extended_path);
            }
            if (m < path.size()) {
                path = procedure_1(graph,path);
                path = procedure_2(graph,path);
            } else {
                quit = true;
            }
        }
        return new ArrayList<Integer>(path);
    }

    private static ArrayList<Integer> procedure_2c(int[][] graph, ArrayList<Integer> path) {
        ArrayList<Integer> reversed_path = new ArrayList<>(path.size());
        for (int i = path.size() - 1; i >= 0; i--)
        {
            reversed_path.add(path.get(i));
        }
        reversed_path = procedure_2b(graph, reversed_path);
        return new ArrayList<Integer>(reversed_path);
    }

    private static ArrayList<Integer> sort(int[][] graph, int size) {
        int i;
        int j;
        ArrayList<Integer> degree = new ArrayList<Integer>(size);
        for (i = 0; i < graph.length; i++) {
            int sum = 0;
            for (j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 1) {
                    sum++;
                }
            }
            degree.add(sum);
        }
        ArrayList<Integer> index = new ArrayList<>(size);
        for (i = 0; i < degree.size(); i++) {
            index.add(i);
        }

        for (i = 0; i < degree.size(); i++) {
            for (j = i + 1; j < degree.size(); j++) {
                if (degree.get(i) < degree.get(j)) {
                    swap(index, i, j);
                }
            }
        }
        return new ArrayList<Integer>(index);
    }

    private static void swap(ArrayList<Integer> index, int i, int j) {
        Integer temp = index.get(i);
        index.set(i, index.get(j));
        index.set(j, temp);
    }

    private static int[][] reindex(int[][] graph, ArrayList<Integer> index, int size) {
        int i, j;
        int[][] temp= Arrays.stream(graph).map(a ->  Arrays.copyOf(a, a.length)).toArray(int[][]::new);

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                temp[i][j] = graph[index.get(i)][index.get(j)];
            }
        }
        return temp;
    }
}