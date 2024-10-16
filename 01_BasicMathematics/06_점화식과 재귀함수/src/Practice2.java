// 최대공약수를 재귀함수로 구하시오

public class Practice2 {

	static int gcd (int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gcd(3, 5));
		System.out.println(gcd(2, 6));
		System.out.println(gcd(8, 12));
	}

}
