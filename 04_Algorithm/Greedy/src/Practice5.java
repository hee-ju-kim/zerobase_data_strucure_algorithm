// Practice
// 정수 num 이 주어졌을 때,
// num 숫자에서 두 자리를 최대 한번만 교체하여 얻을 수 있는 최대값을 출력하세요.

// 입출력 예시
// num: 2736
// 출력: 7236

// 입력: 7116
// 출력: 7611

public class Practice5 {
    public static int solution(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] maxArr = new int[arr.length];

        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(max, arr[i] - '0');
            maxArr[i] = max;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - '0' < maxArr[i + 1] ) {
                for (int j = arr.length - 1; j >= i + 1 ; j--) {
                    if (arr[j] - '0' == maxArr[i + 1]) {
                        char tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                        return Integer.parseInt(String.valueOf(arr));
                    }
                }
            }
        }
        return num;

    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(2736));
        System.out.println(solution(7116));
        System.out.println(solution(91));
    }
}
