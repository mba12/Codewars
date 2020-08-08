package com.michaelahern.tsp;

import com.michaelahern.PrettyPrinter;

import java.util.List;
import java.util.ArrayList;

public class GFG {

    public static int[][] createMatrix() {

        String[] m = {"0 1 0 0 1 1 0 0", "1 0 1 0 0 0 0 1", "0 1 0 1 1 0 0 0", "0 0 1 0 1 0 0 0",
                      "1 0 1 1 0 0 0 0", "1 0 0 0 0 0 1 1", "0 0 0 0 0 1 0 1", "0 1 0 0 0 1 1 0"};

        int[][] matrix = new int[m.length][m.length];
        for(int i = 0; i < m.length; i++) {
            String[] row = m[i].split(" ");
            for(int j = 0; j < m.length; j++) {
                matrix[i][j] = Integer.valueOf(row[j]);
            }
        }
        PrettyPrinter pp = new PrettyPrinter(System.out);
        pp.print(matrix);
        return matrix;
    }

    public static List<Integer> solve(double[][] matrix) {

        int[][] intMatrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                intMatrix[i][j] = (int) intMatrix[i][j];

        return solve(intMatrix);
    }

    public static List<Integer> solve(int[][] matrix) {
        boolean solved = false;
        int i, j, k, n, vertex;
        List<Integer> answer = new ArrayList<>();
        n = matrix.length; //Read number of vertices
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); //Read adjacency matrix of graph
        for (i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (j = 0; j < n; j++) {
                row.add(matrix[i][j]);
            }
            graph.add(row);
        }

        ArrayList<Integer> index = sort(graph);
        graph = reindex(graph, index);

        for (vertex = 0; vertex < n; vertex++) { //Loop through all vertices

            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(vertex); //Select initial vertex
            path = procedure_1(graph, path); //Part I
            path = procedure_2(graph, path); //Part II
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

            if (k == n) {
                ArrayList<Integer> circuit_maker = procedure_3(graph,path);
                if (!circuit_maker.isEmpty()) {
                    for (j = 0; j < circuit_maker.size(); j++) {
                        for (k = 0; k <= circuit_maker.get(j); k++) {
                            System.out.print((index.get(path.get(k)) + 1) + " ");
                        }
                        for (k = n - 1; k > circuit_maker.get(j); k--) {
                            System.out.print( (index.get(path.get(k)) + 1) + " ");
                        }
                        System.out.println("\n");
                    }
                }
                System.out.println("\n");
            }
        }

        if(solved)
            return answer;
        else
            return null;

    }

    private static ArrayList<Integer> procedure_1(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> path) {
        int i, j, k;
        int n = graph.size();
        List<Integer> extended_path = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
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
            List<Integer> neighbor = new ArrayList<>();
            for (i = 0; i < n; i++) {
                if (graph.get(present).get(i) == 1 && visited.get(i) == 0) {
                    neighbor.add(i);
                }
            }
            if (!neighbor.isEmpty()) {
                int choice = neighbor.get(0);
                int minimum = n;
                for (i = 0; i < neighbor.size(); i++) {
                    ArrayList<Integer> next_neighbor = new ArrayList<Integer>();
                    for (j = 0; j < n; j++) {
                        if (graph.get(neighbor.get(i)).get(j) == 1 && visited.get(j) == 0) {
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
            } else {
                break;
            }
        }
        return new ArrayList<Integer>(extended_path);
    }

    private static ArrayList<Integer> procedure_2(ArrayList< ArrayList<Integer>> graph, ArrayList<Integer> path) {
        int i, j, k;
        int n = graph.size();
        boolean quit = false;
        while (quit != true) {
            int m = path.size();
            int inlet = -1;
            int outlet = -1;
            ArrayList<Integer> neighbor = new ArrayList<Integer>();
            for (i = 0; i < path.size(); i++) {
                if (graph.get(path.get(m - 1)).get(path.get(i)) == 1) {
                    neighbor.add(i);
                }
            }
            ArrayList<Integer> unvisited = new ArrayList<Integer>();
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
                        if (graph.get(path.get(neighbor.get(i) + 1)).get(unvisited.get(j)) == 1) {
                            ArrayList<Integer> next_neighbor = new ArrayList<Integer>();
                            for (k = 0; k < unvisited.size(); k++) {
                                if (graph.get(unvisited.get(j)).get(unvisited.get(k)) == 1) {
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
            ArrayList<Integer> extended_path = new ArrayList<Integer>();
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
                path = new ArrayList<Integer>(extended_path);
            }
            if (m < path.size()) {
                path = procedure_1(graph,path);
            } else {
                quit = true;
            }
        }
        return new ArrayList<Integer>(path);
    }

    private static ArrayList<Integer> procedure_2b(ArrayList< ArrayList<Integer>> graph, ArrayList<Integer> path)
    {
        int i, j, k, l, p;
        int n = graph.size();
        boolean quit = false;
        while (quit != true) {
            ArrayList<Integer> extended_path = new ArrayList<Integer>();
            int m = path.size();
            ArrayList<Integer> unvisited = new ArrayList<Integer>();
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
                    if (graph.get(unvisited.get(j)).get(path.get(i)) == 1) {
                        ArrayList<Integer> temp_path = new ArrayList<Integer>();
                        temp_path.add(unvisited.get(j));
                        ArrayList<Integer> temp_extended_path = new ArrayList<Integer>();
                        ArrayList<Integer> temp_visited = new ArrayList<Integer>();
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
                            ArrayList<Integer> neighbor = new ArrayList<Integer>();
                            for (l = 0; l < n; l++) {
                                if (graph.get(present).get(l) == 1 && temp_visited.get(l) == 0) {
                                    neighbor.add(l);
                                }
                            }
                            if (!neighbor.isEmpty()) {
                                int choice = neighbor.get(0);
                                int minimum = n;
                                for (l = 0; l < neighbor.size(); l++) {
                                    ArrayList<Integer> next_neighbor = new ArrayList<Integer>();
                                    for (k = 0; k < n; k++) {
                                        if (graph.get(neighbor.get(l)).get(k) == 1 && temp_visited.get(k) == 0) {
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
                                if (graph.get(path.get(p)).get(last_vertex) == 1 && graph.get(path.get(i + 1)).get(path.get(p + 1)) == 1) {
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
                            ArrayList<Integer> temp = new ArrayList<Integer>();
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
                            temp_extended_path = new ArrayList<Integer>(temp);
                            big_check = true;
                            extended_path = new ArrayList<Integer>(temp_extended_path);
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

    private static ArrayList<Integer> procedure_2c(ArrayList< ArrayList<Integer>> graph, ArrayList<Integer> path) {
        ArrayList<Integer> reversed_path = new ArrayList<Integer>();
        for (int i = path.size() - 1; i >= 0; i--)
        {
            reversed_path.add(path.get(i));
        }
        reversed_path = procedure_2b(graph,reversed_path);
        return new ArrayList<Integer>(reversed_path);
    }

    private static ArrayList<Integer> procedure_3(ArrayList< ArrayList<Integer>> graph, ArrayList<Integer> path) {

        int i;
        int n = path.size();

        ArrayList<Integer> circuit_maker = new ArrayList<Integer>();
        for (i = 0; i < n - 1; i++) {
            if ((graph.get(path.get(0)).get(path.get(i + 1)) == 1) && (graph.get(path.get(i)).get(path.get(n - 1)) == 1)) {
                circuit_maker.add(i);
            }
        }
        return new ArrayList<Integer>(circuit_maker);
    }

    private static ArrayList<Integer> sort(ArrayList<ArrayList<Integer>> graph) {
        int i;
        int j;
        ArrayList<Integer> degree = new ArrayList<Integer>();
        for (i = 0; i < graph.size(); i++) {
            int sum = 0;
            for (j = 0; j < graph.get(i).size(); j++) {
                if (graph.get(i).get(j) == 1) {
                    sum++;
                }
            }
            degree.add(sum);
        }
        ArrayList<Integer> index = new ArrayList<Integer>();
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

    private static ArrayList<ArrayList<Integer>> reindex(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> index) {
        int i, j;
        ArrayList<ArrayList<Integer>> temp = copyGraph(graph);
        for (i = 0; i < temp.size(); i++) {
            for (j = 0; j < temp.get(i).size(); j++) {
                Integer value = graph.get(index.get(i)).get(index.get(j));
                temp.get(i).set(j, value);
            }
        }
        return temp;
    }

    private static ArrayList<ArrayList<Integer>> copyGraph(ArrayList<ArrayList<Integer>> graph) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        int i, j;
        for (i = 0; i < graph.size(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (j = 0; j < graph.get(i).size(); j++) {
                Integer val = graph.get(i).get(j);
                row.add(j, val);
            }
            temp.add(row);
        }
        return temp;
    }
}



