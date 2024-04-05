package org.example.programmers;

/**
 * 문제 설명
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 < common의 길이 < 1,000
 * -1,000 < common의 원소 < 2,000
 * common의 원소는 모두 정수입니다.
 * 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
 * 등비수열인 경우 공비는 0이 아닌 정수입니다.
 * 입출력 예
 * common	result
 * [1, 2, 3, 4]	5
 * [2, 4, 8]	16
 *
 */
public class 다음에올숫자 {

    public static void main(String[] args){

        int[] common = {1, 2, 3, 4};
        System.out.println(solution(common));

    }

    public static int solution(int[] common) {

        int answer = 0;
        int[] diffNum = new int[common.length-1];

        for(int i=0; i<common.length; i++){

            if(i == common.length-1)
                break;

            diffNum[i] = common[i+1]-common[i];

        }


        if(diffNum[0] == diffNum[1])
            answer = common[common.length-1]+ (diffNum[0]);
        else
            answer = common[common.length-1] * (diffNum[1]/diffNum[0]);


        return answer;
    }
}
