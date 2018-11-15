import java.util.Scanner;

public class Main {
    static class Node {
        Node left = null;
        Node right = null;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private static Node begin, middle, end;

    private static int size = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = in.nextLine().split(" ");
            switch (s[0].charAt(0)) {
                case '+': {
                    int x = Integer.parseInt(s[1]);
                    if (size == 0) {
                        begin = new Node(x);
                        middle = begin;
                        end = begin;
                    } else {
                        Node temp = new Node(x);
                        end.right = temp;
                        temp.left = end;
                        end = temp;
                        if (size % 2 == 0) {
                            middle = middle.right;
                        }
                    }
                    size++;

                    break;
                }
                case '*': {
                    int x = Integer.parseInt(s[1]);
                    if (size == 0) {
                        begin = new Node(x);
                        middle = begin;
                        end = begin;
                    } else {
                        Node temp = new Node(x);
                        if (size != 1) {
                            temp.right = middle.right;
                            temp.left = middle;
                            middle.right.left = temp;
                            middle.right = temp;
                        } else {
                            middle.right = temp;
                            temp.left = middle;
                        }
                        if (size % 2 == 0) {
                            middle = middle.right;
                        }
                    }
                    size++;

                    break;
                }
                case '-': {
                    System.out.println(begin.value);
                    begin = begin.right;
                    size--;
                    if (size % 2 == 1) {
                        middle = middle.right;
                    }
                    break;
                }

            }


        }
    }
}
