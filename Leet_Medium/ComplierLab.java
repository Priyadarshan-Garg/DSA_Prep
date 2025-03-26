import java.util.Scanner;

public class ComplierLab {
        static boolean validity(String str) {
            for (int i = 0; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                if (i == 0 || i == str.length() - 1) {
                    if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                        return false;
                    }
                }
                else if (i < str.length() - 1) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        return false;
                    } else if (str.charAt(i) == '+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/') {
                        if (str.charAt(i + 1) == '+'|| str.charAt(i + 1) == '-' ||
                                str.charAt(i + 1) == '*' || str.charAt(i + 1) == '/' ) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Expression : ");
            String str = sc.nextLine();
            System.out.println(validity(str));
        }
    }