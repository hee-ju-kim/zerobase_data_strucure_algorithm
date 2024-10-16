
public class Main {
	
	static int recursion1(int n) {
		if (n == 1) {
			return 1;
		}
		return 3 * recursion1(n - 1);
	}
	
	static int recursion2(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursion2(n - 1);
	}
	
	static int recursion3(int n) {
		if (n < 3 ) {
			return 1;
		}
		
		return recursion3(n - 2) + recursion3(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 점화식(Recurrence)
		// 어떤 수열의 일반항을 그 이전의 항들을 이용하여 정리한 식
		// 예,피보나치 수열
		// 1, 1, 2, 3, 5, 8, 13...
		
		// 2. 재귀함수
		// 어떤 함수가 자신을 다시 호출하여 작업을 수행하는 방식
		// 점화식으로 나타낸것을 풀어서 나타낼 수 있음

		System.out.println("== 점화식/재귀함수 연습 1 ==");
		// 1, 3, 9, 27 ...의 n번째의 수
		int n = 4;
		int result = 1;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				result = 1;
			} else {
				result *= 3;
			}
		}
		
		System.out.println(result);
		System.out.println(recursion1(4));
		
		System.out.println("== 점화식/재귀함수 연습 2 ==");
		// 1,2,3,4,5,6 ...의 n번째까지의 합
		n = 5;
		result = 0;
		for (int i = 1; i < n + 1; i++) {
			result += i;
			
		}
		System.out.println(result);
		System.out.println(recursion2(5));
		
		System.out.println("== 점화식/재귀함수 연습 3 ==");
		// 1, 1, 2, 3, 5, 8, 13 ..의 n번째 수
		n = 6;
		result = 0;
		int a = 1;
		int b = 1;
		
		// 쌤이 푼거
		if (n < 3) {
			result = 1;
		} else {
			for (int i = 2; i < n; i++) {
				result = a + b;
				a = b;
				b = result;
			}
		}

		
		// 내가 푼거
//		for (int i = 2; i < n; i++) {
//			if (i == 2) {
//				result =  a + b;
//			} else {
//				b = result;
//				result += a;
//				a = b;
//			}
//			System.out.println(result);
//		}
		System.out.println(result);
		
		System.out.println(recursion3(6));
	}

}
