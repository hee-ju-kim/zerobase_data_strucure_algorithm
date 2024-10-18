// 선형 자료구조 - 스택

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek()); // peek은 스택의 마지막값을 반환은 하지만 스택에서 실제로 데이터 삭제는 안함
        System.out.println(stack);

        System.out.println(stack.contains(1)); // contains 데이터가 있는지 확인

        System.out.println(stack.size()); // 스택의 사이즈 확인

        System.out.println(stack.empty()); // 스택에 값이 비어있는지 확인

        stack.clear(); // 스택 데이터 전부 삭제
        System.out.println(stack);

        stack.pop(); // 스택에 데이터가 없는데 pop을 할경우 에러 발생

    }

}
