// 알고리즘 - 정렬_3
// 기수 정렬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main_3 {
    public static void radixSort(int[] arr) {
        // 기수테이블 만들기
        ArrayList<Queue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }

        int idx = 0;
        int div = 1;
        int max = getMaxLen(arr);

        for (int i = 0; i <max ; i++) {
            for (int j = 0; j < arr.length; j++) {
                list.get((arr[j]/ div) % 10).offer(arr[j]);
            }

            for (int j = 0; j < 10; j++) {
                Queue<Integer> queue = list.get(j);
                while(!queue.isEmpty()) {
                    arr[idx++] = queue.poll();
                }
            }

            idx = 0;
            div *= 10;
        }

    }

    // 최대 자리수 구하기
    public static int getMaxLen(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = (int)Math.log10(arr[i]) + 1;
            if (max < len) {
                max = len;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        radixSort(arr);
        System.out.println("기수 정렬: " + Arrays.toString(arr));
    }
}
