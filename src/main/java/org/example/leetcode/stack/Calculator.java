package org.example.leetcode.stack;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) throws ScriptException {

        String expression = "3+((2*7)-23+3)/2";
        List<String> postFix = convertToPostfix(expression);



    }


    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static double evaluatePostfix(String[] postfix) {
        Stack<Double> stack = new Stack<>();

        for (String token : postfix) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double b = stack.pop(), a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop(), dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default:
                    stack.push(Double.valueOf(token));
            }
        }
        return stack.pop();
    }

    public static List<String> convertToPostfix(String infix) {
        List<String> postfix = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // 숫자인 경우 출력
            if (Character.isDigit(c)) {
                postfix.add(Character.toString(c));
            }
            // 왼쪽 괄호인 경우 스택에 푸시
            else if (c == '(') {
                stack.push(c);
            }
            // 오른쪽 괄호인 경우 왼쪽 괄호를 만날 때까지 팝
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix.add(Character.toString(stack.pop()));
                stack.pop();
            }
            // 연산자인 경우
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.add(Character.toString(stack.pop()));
                }
                stack.push(c);
            }
            // 스택에 남은 모든 연산자를 팝하여 출력 리스트에 추가
            while (!stack.isEmpty()) {
                postfix.add(Character.toString(stack.pop()));
            }

            return postfix;
        }
        return null;
    }

}
