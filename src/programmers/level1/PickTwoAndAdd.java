package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;

public class PickTwoAndAdd {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = set.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}

/*
    개인 해설
    중복제거를 위해 Set을 사용했습니다.
    set을 int 배열 형태로 변환하기 위해 stream의 mapToInt를 사용했습니다.
    HashSet 의 제네릭 타입을 Integer로 생성해야 mapToInt 내부 메서드에서 오버라이딩 시 타입이 일치하여 실행됩니다.

 */
/*
    문제
    programmers - 월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기
    https://programmers.co.kr/learn/courses/30/lessons/68644

문제 설명
정수 배열 numbers가 주어집니다.
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.

입출력 예
numbers	    result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]

입출력 예 설명
입출력 예 #1
2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
3 = 2 + 1 입니다.
4 = 1 + 3 입니다.
5 = 1 + 4 = 2 + 3 입니다.
6 = 2 + 4 입니다.
7 = 3 + 4 입니다.
따라서 [2,3,4,5,6,7] 을 return 해야 합니다.

입출력 예 #2
2 = 0 + 2 입니다.
5 = 5 + 0 입니다.
7 = 0 + 7 = 5 + 2 입니다.
9 = 2 + 7 입니다.
12 = 5 + 7 입니다.
따라서 [2,5,7,9,12] 를 return 해야 합니다.
 */