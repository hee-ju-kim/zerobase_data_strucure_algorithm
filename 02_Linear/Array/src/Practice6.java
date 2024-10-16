// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;

class MyArray2 {
    int[] arr;

    MyArray2(int size) {
        this.arr = new int[size];
    }

    public boolean elementChk(int ele) {
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            if (ele == this.arr[i]) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public void inputEle (int ele) {
        int[] tmp = this.arr.clone();
        this.arr = new int[tmp.length + 1];
        for (int i = 0; i < tmp.length ; i++) {
            this.arr[i] = tmp[i];
        }
        this.arr[this.arr.length - 1] = ele;
    }

}
public class Practice6 {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5, 6};
        MyArray2 tmp = new MyArray2(0);
        for (int i = 0; i < arr.length; i++) {
            boolean chk = tmp.elementChk(arr[i]);
            if (chk == false) {
                tmp.inputEle(arr[i]);
            }
        }

        System.out.println(Arrays.toString(tmp.arr));
    }
}

