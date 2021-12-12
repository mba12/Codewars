package com.michaelahern.tsp;

public class IsRobotBounded {

    int[] NORTH = {0,1};
    int[] SOUTH = {0,-1};
    int[] WEST = {-1, 0};
    int[] EAST = {1, 0};
    int[][] directions = {WEST, NORTH, EAST, SOUTH};
    int direction = 1;

    public boolean sameSpot(int[] one, int[] two) {
        return one[0] == two[0] && one[1] == two[1];
    }

    public int[] nextPosition(int[] current, char instruction) {
        int[] next = new int[2];
        next[0] = current[0]; next[1] = current[1];
        switch(instruction) {
            case 'G':
                current[0] += directions[direction][0];
                current[1] += directions[direction][1];
                break;
            case 'L':
                direction--;
                direction = direction % 4;
                break;
            case 'R':
                direction++;
                direction = direction % 4;
                break;
        }

        return next;

    }

    public boolean isRobotBounded(String instructions) {

        char[] steps = instructions.toCharArray();
        int[] current = new int[2];

        for(char c : steps) {
            switch (c) {
                case 'G':
                    current[0] += directions[direction][0];
                    current[1] += directions[direction][1];
                    break;
                case 'L':
                    direction += 3;
                    direction = direction % 4;
                    break;

                case 'R':
                    direction += 1;
                    direction = direction % 4;
                    break;
            }
            System.out.println("Position: " + current[0] + ", " + current[1]);
        }
        return (current[0] == 0 && current[1] == 0) ||  !(directions[direction][0] == 0 && directions[direction][1] == 1);
    }
}
