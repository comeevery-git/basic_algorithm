package programmers.level1;

public class Year2016 {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int totalDay = b;
        for(int i=0; i<a-1; i++) {
            totalDay += month[i];
        }
        return week[totalDay % 7];
    }
}
/*
    개인 해설
    2016년 1월 1일은 금요일부터 시작합니다.
    month 배열에는 2016년(윤년)의 월 마다 총 일수를 정의하였고, week 배열에는 요일을 정의하였습니다.
    총 일수를 구하기 위해 totalDay 를 구해야 할 일(b)로 초기화하고, 구해야 할 월(a) 전 월까지의 총 일수를 더했습니다.
    총 일수 / 7 의 나머지 값은 구하려는 요일 값의 인덱스가 됩니다.

 */
/*
    문제
    programmers - 연습문제 - 2016년
    https://programmers.co.kr/learn/courses/30/lessons/12901

문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

입출력 예
a	b	result
5	24	"TUE"

 */