
public class Main {
	
	static int getCombination(int n, int r) {
		int pResult = 1;
		for (int i = n; i >= n - r + 1; i--) {
			pResult *= i;
		}
		
		int rResult = 1;
		for (int i = 1; i <= r; i++) {
			rResult *= i;
		}
		
		return pResult / rResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 조합 
		// 서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서 X, 중복 X)
		// nCr = n! / (n-r)!r! = nPr / r!
		System.out.println("== 조합 ==");
		// 서로 다른 4명 중 주번 2명을 뽑는 경우의 수
		int n = 4;
		int r = 2;
		
		int pResult = 1;
		for (int i = n; i >= n - r + 1; i--) {
			pResult *= i;
		}
		
		int rResult = 1;
		for (int i = 1; i <= r; i++) {
			rResult *= i;
		}
		
		System.out.println("결과 : " + pResult / rResult);
		
		// 2. 중복 조합
		// 서로 다른 n개 중에서 r개를 선택하는 경우의 수 (순서 X, 중복 O)
		// nHr = n+r-1Cr
		System.out.println("== 중복 조합 ==");
		// 후보 2, 유권자 3명일 때 무기명 투표 경우의 수
		n = 2;
		r = 3;
		
		System.out.println("결과 : " + getCombination(n + r - 1, r));
	}

}
