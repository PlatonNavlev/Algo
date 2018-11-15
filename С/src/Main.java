import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ochered = new int[100010];
        int j = -1;
        int c = 0;
        int[] ochered2 = new int[100010];
        for (int i = 0; i < n; i++) {
            switch (in.nextInt()) {
                case 1: {
                    int temp = in.nextInt();
                    j++;
                    ochered[temp] = j; // j пришло в целом
                    ochered2[j] = temp;
                    break;
                }
                case 2: {
                    c++; //ушло человек
                    break;
                }
                case 3: {
                    j--;
                    break;
                }
                case 4: {
                    System.out.println(ochered[in.nextInt()] - c);
                    break;
                }
                case 5:
                    System.out.println(ochered2[c]);
                default:
            }

        }
    }
}

