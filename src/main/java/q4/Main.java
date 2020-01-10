package q4;

import java.util.Scanner;

/**
 * 计算最大子序列和
 * @author admin
 * @date 2020/1/9 23:24
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            int length = in.nextInt();
            int[] nums = new int[length];
            for (int j = 0; j < length; j++) {
                nums[j] = in.nextInt();
            }
            int max = nums[0], start = 1, end = 1, tmp = 0, tmpStart = 0;
            for (int j = 0; j < length; j++) {
                tmp += nums[j];
                if (tmp > max) {
                    max = tmp;
                    start = tmpStart + 1;
                    end = j + 1;
                }
                if (tmp < 0) {
                    tmp = 0;
                    tmpStart = j + 1;
                }
            }
            System.out.println("Case " + i + ":");
            System.out.println(max + " " + start + " " + end);
            if (i < count) {
                System.out.println();
            }
        }
    }

    public static Result maxSequence(int[] num) {
        int tmp, i, j;
        Result result = new Result();
        for (i = 0; i < num.length; i++) {
            tmp = 0;
            for (j = i; j < num.length; j++) {
                tmp += num[j];
                if (tmp > result.getMax()) {
                    result.setMax(tmp);
                    result.setStart(i);
                    result.setEnd(j);
                }
            }
        }
        return result;
    }

    static class Result {
        private int max;
        private int start;
        private int end;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
