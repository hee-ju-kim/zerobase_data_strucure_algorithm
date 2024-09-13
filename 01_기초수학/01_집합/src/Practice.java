// Practice
// ArrayList를 사용한 집합 구현 실습 (집합	관련 연산 사용X)

import java.util.ArrayList;
import java.util.Arrays;

class MySet2 {
	ArrayList<Integer> list;
	
	// 생성자 1
	MySet2() {
		this.list = new ArrayList<Integer>();
	}
	
	// 생성자 2
	MySet2(int[] arr)  {
		this.list = new ArrayList<Integer>();
		
		for(int item: arr) {
			this.list.add(item);
		}
	}
	
	//원소 추가(중복 X)
	public void add(int x) {
		for (int item: this.list) {
			if (item == x) {
				return;
			}
		}
		this.list.add(x);
	}
	
	// 교집합
	public MySet2 retainAll(MySet2 b) {
		MySet2 result = new MySet2();
		
		for (int itemA: this.list) {
			for (int itemB: b.list) {
				if (itemA == itemB) {
					result.add(itemA);
				}
			}
		}
		
		return result;
	}
	
	// 합집합
	public MySet2 addAll(MySet2 b) {
		MySet2 result = new MySet2();
		
		for (int itemA: this.list) {
			result.add(itemA);
		}
		
		for (int itemB: b.list) {
			result.add(itemB);
		}
		
		return result;
	}
	
	// 차집합
	public MySet2 removeAll(MySet2 b) {
		MySet2 result = new MySet2();
		
		for (int itemA: this.list) {
			boolean containFlag = false;
			
			for (int itemB: b.list) {
				if(itemA == itemB) {
					containFlag = true;
					break;
				}
			}
			
			if (!containFlag) {
				result.add(itemA);
			}
		}
		
		return result;
	}
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySet2 a = new MySet2();
		
		a.add(1);
		a.add(1);
		a.add(1);
		System.out.println(a.list);
		a.add(2);
		a.add(3);
		System.out.println(a.list);
		
		a = new MySet2(new int[] {1,2,3,4,5});
		MySet2 b = new MySet2(new int[] {2,4,6,8,10});
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		MySet2 result = a.retainAll(b);
		System.out.println("교집합: " + result.list);
		
		result = a.addAll(b);
		System.out.println("합집합: " + result.list); 
		
		result = a.removeAll(b);
		System.out.println("집합: " + result.list);
		

	}

}
