package GH.GH220514.Programmers;

//        문제 설명
//        수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//        제한 조건
//        시험은 최대 10,000 문제로 구성되어있습니다.
//        문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//        가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//        입출력 예
//        answers	return
//        [1,2,3,4,5]	[1]
//        [1,3,2,4,2]	[1,2,3]

import java.io.*;
import java.util.*;

public class 모의고사 {
    public static void main(String[] arg) throws IOException {
        int[] answers = {1,2,3,4,5};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> answer = new ArrayList<>();
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int max = 0;
        for (int i = 0; i < answers.length; i++){
            if(answers[i] == student1[i%student1.length]) result1++;
            if(answers[i] == student2[i%student2.length]) result2++;
            if(answers[i] == student3[i%student3.length]) result3++;
        }
        max = Math.max(result1,result2);
        max = Math.max(max,result3);
        if (max == result1) answer.add(1);
        if (max == result2) answer.add(2);
        if (max == result3) answer.add(3);
    }
}
