package baekjoon.level1;

import java.util.*;

// public class Main {
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
/*
    개인 해설
    백준 문제는 처음 풀어보았는데 기본 클래스 제공이 없어서 당황했습니다.
    백준 클래스 명은 항상 Main 이고 파라미터는 Scanner 를 통해 입력받는 형식입니다.
    단계별 풀기 1단계의 모든 문제를 풀었습니다. 해당 문제는 마지막 문제입니다.
    이제 푸는 방식을 터득한 것 같습니다. :)

 */
/*
    문제
    baekjoon - 단계별 풀기 1 단계 - 입출력과 사칙연산 - 곱셈
    https://www.acmicpc.net/problem/2588

(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(세 자리 수 자릿 수 별로 곱하는 방식 이미지)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1
472
385
예제 출력 1
2360
3776
1416
181720

 */