import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        String[] s = in.nextLine().split(" ");
        for (String ss : s) {
            try {
                int x = Integer.parseInt(ss);
                stack.addLast(x);
            } catch (NumberFormatException e) {
                int a = stack.removeLast();
                int b = stack.removeLast();
                switch (ss.charAt(0)) {
                    case '+':
                        stack.addLast(a + b);
                        break;
                    case '*':
                        stack.addLast(a * b);
                        break;
                    case '-':
                        stack.addLast(b - a);
                        break;
                        default:

                }
            }
        }
        System.out.println(stack.removeLast());
    }
}
