package org.example.leetcode.array_string;

import java.util.Stack;

/**
 *
 *
 * 괄호 문자앞의 숫자만큼 반복해서 출력하기
 *
 * 반복문자 처리하기 패턴2
 */
public class RepeatTests2 {

    public static void main(String[] args){

        //System.out.println(checkString("3(ab)cc5(d)"));
        System.out.println(checkString("2(a2(bb))cd"));
    }

    public static String checkString(String str) {

        //2(abbbb)cd
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 괄호가 아니면 스택에 푸시
            if (ch != ')') {
                stack.push(ch);
            } else {
                // 닫힌 괄호를 만났을 때
                StringBuilder tempStr = new StringBuilder();
                // 열린 괄호를 만날 때까지 스택에서 팝
                while (!stack.isEmpty() && stack.peek() != '(') {
                    tempStr.insert(0, stack.pop());
                }
                // 열린 괄호 제거
                stack.pop();

                // 괄호 앞의 숫자 찾기
                StringBuilder number = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    number.insert(0, stack.pop());
                }

                // 숫자가 있으면 반복, 없으면 1로 처리
                int repeat = number.length() > 0 ? Integer.parseInt(number.toString()) : 1;
                String repeatedStr = tempStr.toString().repeat(repeat);

                // 반복된 문자열을 다시 스택에 푸시
                for (char c : repeatedStr.toCharArray()) {
                    stack.push(c);
                }
            }
        }

        // 스택에 있는 모든 문자를 연결
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
