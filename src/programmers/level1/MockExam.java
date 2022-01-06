package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] onePerson = {1, 2, 3, 4, 5};
        int[] twoPerson = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threePerson = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int onePersonCheck = 0, twoPersonCheck = 0, threePersonCheck = 0;

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<answers.length;i++) {
            if(answers[i] == onePerson[i%5])
                onePersonCheck++;
            if(answers[i] == twoPerson[i%8])
                twoPersonCheck++;
            if(answers[i] == threePerson[i%10])
                threePersonCheck++;
        }

        int max = Math.max(Math.max(onePersonCheck,twoPersonCheck),threePersonCheck);
        if(max == onePersonCheck) list.add(1);
        if(max == twoPersonCheck) list.add(2);
        if(max == threePersonCheck) list.add(3);

        // return list.stream().mapToInt(i -> i).toArray();
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}

/*
    개인 해설
    1, 2, 3번 수포자의 찍는 규칙을 저장해놓고 정답과 비교해가며 정답 수를 카운팅합니다.
    정답을 가장 많이 맞춘 수포자들을(동률 포함) 리턴하는 문제입니다.
    각 수포자들의 찍는 규칙 길이(onePerson, twoPerson, threePerson)는 다르며, 정답길이만큼 채점을 해야하기 때문에
    [i%수포자의 규칙길이]로 값을 꺼내어 비교합니다.
    최대 정답자를 ArrayList 에 담아 최종 결과를 도출했으며 stream 을 사용해 다시 array 로 변환하여 리턴했습니다.

    * ArrayList -> Array 변경 방식 수정
        테스트 실행 시 평균 2.*ms 속도를 보여 스트림 사용 시 속도가 느린 부분을 고려하여
        도출 된 정답자 리스트(list)의 사이즈만큼 배열길이를 생성한 뒤 for 문으로 데이터를 넣었습니다.
        수정 후 테스트 실행 시 평균 0.5ms 속도로 확인되었습니다.

 */
/*
    문제
    programmers - 완전탐색 - 모의고사
    https://programmers.co.kr/learn/courses/30/lessons/42840

문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
answers	    return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]

입출력 예 설명
입출력 예 #1
수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2
모든 사람이 2문제씩을 맞췄습니다.

 */