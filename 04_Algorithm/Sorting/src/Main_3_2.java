// 계수 정렬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main_3_2 {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] curArr = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            curArr[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < curArr.length; i++) {
            while(curArr[i] > 0 ) {
                arr[idx++] = i;
                curArr[i] -= 1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item: arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int idx2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int cnt = map.get(list.get(i));
            while(cnt > 0) {
                arr[idx2++] = list.get(i);
                cnt--;
            }
        }

    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 10, 27, 32, 17, 99, 56};
        countingSort(arr);
        System.out.println("계수 정렬: " + Arrays.toString(arr));
    }
}
