package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMissingNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> notExistList = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        for(int i=0; i<10; i++){
            if(!list.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}

/*
    개인 해설
    0~9까지의 숫자 중 일부만 numbers 에 존재하고, 존재하는 값만 모두 더하는 문제입니다.
    요구사항에 맞게 답안을 그대로 작성해보았는데요.
    생각을 다르게 해보면, 0~9까지의 숫자를 모두 더한 후 존재하는 숫자만 빼면 요구하는 값과 일치하게 됩니다 :)
    ex)
        int answer = 45;
        for (int i : numbers) {
            answer -= i;
        }
        return answer;

 */
/*
    문제
    programmers - 월간 코드 챌린지 시즌3 - 없는 숫자 더하기
    https://programmers.co.kr/learn/courses/30/lessons/86051

문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 수 ≤ 9
numbers의 모든 수는 서로 다릅니다.

입출력                 예
numbers	            result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	    6

입출력 예 설명
입출력 예 #1
5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
입출력 예 #2
1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.

 */