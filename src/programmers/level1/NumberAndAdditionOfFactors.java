package programmers.level1;

public class NumberAndAdditionOfFactors {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right;i++){
            int cnt = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0) {
                    cnt++;
                }
            }
            if(cnt%2==0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}

/*
    개인 해설
    약수의 개수를 구하며 짝수일 때는 더하고 홀수일 때는 빼는 문제 입니다.
    보통 범위 이내의 약수를 구한 후 홀, 짝을 판별하여 풀이한 분들이 많았는데 제곱수의 성질을 잘 이용한 풀이가 인상깊었습니다.
    제곱수인 경우 약수의 개수가 홀수고, 제곱수가 아닌 경우 약수의 개수가 짝수인 점을 이용하였습니다.
    다른 사람 풀이 ex)
      public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            // 제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            // 제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }

 */
/*
    문제
    programmers - 월간 코드 챌린지 시즌2 - 약수의 개수와 덧셈
    https://programmers.co.kr/learn/courses/30/lessons/77884

문제 설명
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000

입출력 예
left	right	result
13	    17	    43
24	    27	    52

입출력 예 설명
입출력 예 #1
다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
13	1, 13	2
14	1, 2, 7, 14	4
15	1, 3, 5, 15	4
16	1, 2, 4, 8, 16	5
17	1, 17	2
따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.

입출력 예 #2
다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
24	1, 2, 3, 4, 6, 8, 12, 24	8
25	1, 5, 25	3
26	1, 2, 13, 26	4
27	1, 3, 9, 27	4
따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.

 */