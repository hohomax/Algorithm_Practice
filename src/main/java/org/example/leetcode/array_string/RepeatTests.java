package org.example.leetcode.array_string;

/**
 *
 *
 * 괄호 문자앞의 숫자만큼 반복해서 출력하기
 *
 * 반복문자 처리하기 패턴1
 */
public class RepeatTests {

    public static void main(String[] args){

        //System.out.println(checkString("3(ab)cc5(d)"));
        System.out.println(checkString("3(xaab)cc(f)2(ed)gg"));

    }

    public static String checkString(String a){

        if(a.contains("("))
            a = repeatA(a);

        return a;
    }


    public static String repeatA(String a){

        int startNumIndex = 0;
        int endNumIndex = 0;
        int repeatNum = 1;
        StringBuilder repeatString = new StringBuilder();
        StringBuilder resultSb = new StringBuilder();

        for(int i=0; i<a.length(); i++){

            if( i!= 0 && a.charAt(i) == '(' ){
                startNumIndex = i+1;

                if(Character.isDigit(a.charAt(i-1)))
                    repeatNum = Character.getNumericValue(a.charAt(i-1));

                break;
            }
        }

        for(int i=0; i<a.length(); i++){
            if( i!= 0 && a.charAt(i) == ')' ){
                endNumIndex = i-1;
                break;
            }
        }

        int i=0;
        while(i < repeatNum){
            repeatString.append(a.substring(startNumIndex, endNumIndex+1));
            i++;
        }


        String start = a.substring(0, startNumIndex-1);
        String mid = repeatString.toString();
        String edge = a.substring(endNumIndex+2, a.length());

        resultSb.append(start).append(mid).append(edge);

        if(resultSb.toString().contains("("))
            return repeatA(resultSb.toString());

       return resultSb.toString();
    }
}
