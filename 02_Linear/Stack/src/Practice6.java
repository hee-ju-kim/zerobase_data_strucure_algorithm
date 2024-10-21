// Practice2
// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.Stack;

public class Practice6 {
    public static void checkParenthesis(String str) {
        Stack stack = new Stack();

        boolean check = true;
        for(String s: str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    check = false;
                }
            }
        }

        if (check && stack.isEmpty()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("(");          // FAIL!
        checkParenthesis(")");          // FAIL!
        checkParenthesis("()");         // PASS!
        checkParenthesis("()()()");     // PASS!
        checkParenthesis("(())()");     // PASS!
        checkParenthesis("(((()))");    // FAIL!
    }
}
