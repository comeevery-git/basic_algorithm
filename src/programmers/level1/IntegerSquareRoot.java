package programmers.level1;

public class IntegerSquareRoot {
    public long solution(long n) {
        long temp = (long) Math.sqrt(n);
        return (n == Math.pow(temp, 2))? (long) Math.pow(temp+1, 2) : -1;
    }
}

/*
    개인 해설
    n 값이 어떤 양의 정수 x의 제곱인 지 아닌 지 판단하는 문제입니다.
    Math.sqrt() 를 사용하여 제곱근을 구하고, 제곱근이 구해졌다면 다시 제곱한 수와 일치할 것이라는 조건으로 리턴하였습니다.

 */
/*
    문제
    programmers - 연습문제 - 정수 제곱근 판별
    https://programmers.co.kr/learn/courses/30/lessons/12934

문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.

입출력 예
n	    return
121	    144
3	    -1
입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

 */