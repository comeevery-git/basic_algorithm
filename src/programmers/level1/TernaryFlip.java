package programmers.level1;

public class TernaryFlip {
    public int solution(int n) {
        String ternary = "";
        while (n > 0) {
            ternary = (n % 3) + ternary;
            n /= 3;
        }
        StringBuilder tsb = new StringBuilder(ternary);
        tsb.reverse();
        return Integer.parseInt(String.valueOf(tsb), 3);
    }
}
/*
    개인 해설
    10 진법 -> N 진법으로 변환 시 7번, 8번 라인과 같이 3 대신 변환 할 N을 대입합니다.
    요구사항은 3진법 변환 후 뒤집어야해서 StringBuilder 를 통해 뒤집었고, (StringBuffer 도 가능)
    뒤집은 값을 다시 10진법으로 변환하는 방법은 12번 라인 입니다.
    int 형으로의 변환을 위해서만 사용했었는데 10진법으로 변환해주는 기능은 이번에 알게되었습니다 :D
    -> Integer.parseInt(str, N)

 */
/*
    문제
    programmers - 월간 코드 챌린지 시즌1 - 3진법 뒤집기
    https://programmers.co.kr/learn/courses/30/lessons/68935

문제 설명
자연수 n이 매개변수로 주어집니다.
n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.

입출력 예
n	result
45	7
125	229

입출력 예 설명
입출력 예 #1
답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	        1200	    0021	        7
따라서 7을 return 해야 합니다.

입출력 예 #2
답을 도출하는 과정은 다음과 같습니다.
n       (10진법)	n   (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	    11122       22111	                229
따라서 229를 return 해야 합니다.

 */