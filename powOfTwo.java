import java.util.Scanner;

public class powOfTwo {
    public static void main(String[] args) {
        // to check whether the given number is power of 2 or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = checkPowerOfTwo(n);
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    public static boolean checkPowerOfTwo(int x) {
        return (x > 0) && (x & (x - 1)) == 0;
    }

}
