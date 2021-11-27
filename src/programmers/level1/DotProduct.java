package programmers.level1;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;a.length>i;i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
/*
    개인 해설
    '내적'이라는 단어를 보고 문제를 보고 풀어..볼까? 하고 잠시 망설였습니다.
    요구사항이 써있으니 요구사항에만 맞게 작성해보자! 하고 시작했는데 정말 간단했습니다.
    스칼라 곱이라고 들으니 전에 들어본 기억이 나네요.
    수학용어는 조금 어렵네요 :)

    * 내적 (벡터의 곱 중에 하나, 스칼라 곱)
    https://wikidocs.net/22384
    https://rfriend.tistory.com/145

 */
/*
    문제
    programmers - 월간 코드 챌린지 시즌1 - 내적
    https://programmers.co.kr/learn/courses/30/lessons/70128

문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

입출력 예
a	        b	            result
[1,2,3,4]	[-3,-1,0,2]	    3
[-1,0,1]	[1,0,-1]	   -2

입출력 예 설명
입출력 예 #1
a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
입출력 예 #2
a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.

 */