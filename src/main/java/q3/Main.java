package q3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 计算大整数的和. 注意最后一次不要输出换行.
 * @author admin
 * @date 2020/1/9 22:56
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        count = in.nextInt();
        BigInteger a, b;
        for (int i = 1; i <= count; i++) {
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            System.out.println("Case " + i + ":");
            System.out.println(a + " + " + b + " = " + a.add(b));
            if (i != count) {
                System.out.println();
            }
        }
    }
}
