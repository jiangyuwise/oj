package q6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author admin
 * @date 2020/1/10 11:56
 */
class MainTest {

    @Test
    void test() {
        long[] nums = new long[49];
        for (int i = 0; i < 49; i++) {
            nums[i] = Main.fib(1, 1, i);
        }
        System.out.println(Arrays.toString(nums));
    }

}