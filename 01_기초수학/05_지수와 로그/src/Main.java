
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.제곱, 제곱근, 지수
		// 제곱 : 같은수롤 두번 곱합
		// 거듭제곱 : 같은 수를 거듭하여 곱함
		// 제곱근 : a를 제곱하여 b가 될떄 a를 b의 제곱근이라함
		System.out.println("== 제곱 ==");
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(2, -3)); // -3제곱은 나누기로 들어가면됨
		System.out.println(Math.pow(-2,- 3));
		
		System.out.println(Math.pow(2,30));
		System.out.printf("%.0f\n", Math.pow(2, 30));
		
		System.out.println("== 제곱근 ==");
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(16, 1.0/2));
		System.out.println(Math.pow(16, 1.0/4));
		
		// 참고) 절대 값 
		System.out.println(" == 절대 값 ==");
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5));
		
		// 2. 로그
		// logaB > a가 b가 되기 위해 제곱해야 하는 수
		System.out.println("== 로그 ==");
		System.out.println(Math.E);
		System.out.println(Math.log(2.718281828459045));
		System.out.println(Math.log10(1000));
		System.out.println(Math.log(4) / Math.log(2));
	}

}


