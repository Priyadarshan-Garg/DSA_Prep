import java.util.*;

class RobotCollision {
    public List<Integer> Function(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];

        // Step 1: Sort robots by position
        for (int i = 0; i < n; i++) indices[i] = i;
        Arrays.sort(indices, Comparator.comparingInt(i -> positions[i]));

        Stack<Integer> stack = new Stack<>(); // Stack to track active R robots

        for (int i : indices) {
            if (directions.charAt(i) == 'R') {
                stack.push(i); // Store the index of the right-moving robot
            } else { // 'L' robot
                while (!stack.isEmpty()) {
                    int j = stack.peek(); // Top R robot
                    if (healths[i] > healths[j]) {
                        // L wins, R is destroyed
                        healths[i]--; 
                        stack.pop(); 
                    } else if (healths[i] < healths[j]) {
                        // R wins, L is destroyed
                        healths[j]--;
                        healths[i] = 0;
                        break;
                    } else {
                        // Both destroy each other
                        healths[i] = 0;
                        healths[j] = 0;
                        stack.pop();
                        break;
                    }
                }
            }
        }

        // Step 3: Collect remaining survivors in **original input order**
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) result.add(healths[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int x =14;
        int y = 19;
        swap(x,y);
        System.out.println(y);

    }
    public static void swap(int a,int b){
        a =a^b;
        b =a^b;
        a =a^b;
    }

}
