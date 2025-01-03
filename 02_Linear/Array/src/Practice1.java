// Practice1
// 배열 arr 의 모든 데이터에 대해서,
// 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.

// 입출력 예시)
// 배열 arr: 1, 2, 3, 4, 5, 6, 7, 8, 9
// 결과:
// 짝수 평균: 5.0
// 홀수 평균: 5.0

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sumOdd = 0.0;
        double sumEven = 0.0;
        int sumOddCnt = 0;
        int sumEvenCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
                sumEvenCnt++;
            } else {
                sumOdd += arr[i];
                sumOddCnt++;
            }
        }

        System.out.printf("짝수 평균: %f\n", sumEven / sumEvenCnt);
        System.out.printf("홀수 평균: %f\n", sumOdd / sumOddCnt);

    }

}
