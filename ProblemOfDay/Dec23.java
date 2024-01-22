package ProblemOfDay;

import java.util.HashSet;

public class Dec23 {
    public static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0"); // Add the starting point to the set

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y += 1;
            } else if (dir == 'S') {
                y -= 1;
            } else if (dir == 'E') {
                x += 1;
            } else if (dir == 'W') {
                x -= 1;
            }

            // Check if the current position has been visited before
            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true; // Path has crossed itself
            }

            // Add the current position to the set
            visited.add(currentPosition);
        }

        return false; // No path crossing detected
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
    }
}
