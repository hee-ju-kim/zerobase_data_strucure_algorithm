import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 팩토리얼
		// 1에서 n까지 모든 자연수의 곱(n!)
		System.out.println("== 팩토리얼 ==");
		// 5!
		int n = 5;
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("result = " + result);
		
		// IntStream
		System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> (x * y)));
		
		// 2. 순열
		// 순서를 정해서 나열
		// 서로 다른 n개 중에 r개를 선택하는 경우의 수(순서 O, 중복 X)
		// nPr = n! / (n-r)!
		
		System.out.println("== 순열 ==");
		// 5명을 3줄로 세우는 경우의수
		n = 5;
		int r = 3;
		result = 1;
		
		for (int i = n; i >= n - r + 1; i--) {
			result *= i;
		}
		
		System.out.println("result = " + result);
		
		// 3. 중복 순열
		// 서로 다른 n개 중에 r개를 선택하는 경우의 수(순서 O, 중복O)
		// n의 r승
		System.out.println("== 중복 순열 ==");
		// 서로 다른 4개의 수중 2개를뽑는 경우의 수 (중복 허용)
		n = 4;
		r = 2;
		result = 1;
		
		for(int i = 0; i < r; i++) {
			result *= n;
		}
		
		System.out.println("result = " + result);
		System.out.println(Math.pow(n, r));
		
		// 4. 원 순열
		System.out.println("== 원순열 ==");
		// 원 모양의 테이블에 3명을 앉히는 경우의 수
		n = 3;
		result = 1;
		
		for (int i = 1; i < n; i++) {
			result *= i;
		}
		
		System.out.println("result = " + result);
	}

}
