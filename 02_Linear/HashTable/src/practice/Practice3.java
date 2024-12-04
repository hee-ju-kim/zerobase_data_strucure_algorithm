package practice;// Practice3
// 참고 - Hashtable? HashMap?

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        // Hashtalbe
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(0, 10);
        System.out.println(ht.get(0));

        // Hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 10);
        System.out.println(map.get(0));

        Map<Integer, Integer> map1 = ht;
        Map<Integer, Integer> map2 = map;
        System.out.println(map.get(0));
        System.out.println(map2.get(0));

//        ht.put(null, 999);
//        System.out.println(ht.get(null));

        map.put(null, 999);
        System.out.println(map.get(null));

        // Hashtable과 HashMap차이
        // 공통 : 둘 다 Map 인터페이스를 구현
        // 차이 :
            // Key에 Null사용 여부
            // Hashtalbe X
            // HashMap O

            // Thread-safe
            // Hashtable: O (멀티 스레드 환경에서 우수)
            // HashMap: X (싱글 스레드 환경에서 우수)
    }
}
