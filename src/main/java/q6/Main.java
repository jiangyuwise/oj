package q6;

import java.util.Scanner;

/**
 * 给定 A, B, 计算  f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7
 * 其中 f(1) = 1, f(2) = 1;
 *
 * @author admin
 * @date 2020/1/10 10:45
 */
public class Main {

    public static long fib(int a, int b, int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long x = 1, y = 1, sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = (a * y + b * x) % 7;
            x = y;
            y = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, n;
        long[] nums = new long[49];
        while ((a = in.nextInt()) != 0 && (b = in.nextInt()) != 0 && (n = in.nextInt()) != 0) {
            for (int i = 0; i < 49; i++) {
                nums[i] = fib(a, b, i);
            }
            System.out.println(nums[n % 49]);
        }
    }
}
