import java.util.*;

class simplifyPath {
    public static String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("..")) {
                if (!deque.isEmpty()) deque.pollLast();
            } else if (!part.equals(".") && !part.isEmpty()) {
                deque.addLast(part);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : deque) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {
        String m = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(m));
    }
}
