package q5;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 计算出现次数最多的 key
 * @author admin
 * @date 2020/1/10 09:59
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != 0) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < num; i++) {
                String key = in.next();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
            int max = 0;
            String maxKey = "";
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                int tmp = map.get(key);
                if (tmp > max) {
                    max = tmp;
                    maxKey = key;
                }
            }
            System.out.println(maxKey);
            num = in.nextInt();
        }
    }
}
