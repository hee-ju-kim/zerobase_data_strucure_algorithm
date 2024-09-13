import java.util.Arrays;
import java.util.HashSet;

// 기초 수학 - 집합

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 집합 
		System.out.println("HashSet");
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(1);
		
		System.out.println("set1 = " + set1);
		
		set1.add(2);
		set1.add(3);
		
		System.out.println("set1 = " + set1);
		
		set1.remove(1);
		System.out.println("set1 = " + set1);
		System.out.println(set1.size()); 		// hashSet 사이즈
		System.out.println(set1.contains(2));	// hashSet에 2가 있는지 
		
		// 2. 집합 연산
		System.out.println("집합연산");
		
		// 2-1. 교집합
		HashSet<Integer> a = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		HashSet<Integer> b = new HashSet<Integer>(Arrays.asList(2,4,6,8,10));
		
//		a.retainAll(b);
//		System.out.println("교집합: " + a);
		
		// 2-1. 합집합
//		a.addAll(b);
//		System.out.println("합집합: " + a);
		
		// 2-3. 차집합
		a.removeAll(b);
		System.out.println("차집합: " + a);
		
	}

}
