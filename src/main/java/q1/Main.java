package q1;

import java.util.Scanner;

/**
 * 计算 a + b
 * @author admin
 * @date 2020/1/9 22:30
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        while (in.hasNextInt()) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
