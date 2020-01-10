package q2;

import java.util.Scanner;

/**
 * 计算 1 + ... + n
 * 注意使用 long.
 * @author admin
 * @date 2020/1/9 22:41
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a;
        while (in.hasNext()) {
            a = in.nextLong();
            System.out.println(((1 + a) * a) / 2);
            System.out.println();
        }
    }
}
