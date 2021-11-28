package programmers.level1;

import java.util.Arrays;

public class DescendingOrder {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();
        for(String s:str) sb.append(s);

        return Long.parseLong(sb.reverse().toString());
    }
}
/*
    개인 해설
    단순 레벨1 문제는 커밋하지 않으려고 했으나, 다른 사람들의 다양한 풀이를 보고 신기하여 커밋하였습니다.
    단순하게 input 값이 long이니 String으로 변환하여 list에 담아 정렬하거나, char 배열에 toCharArrays()로 담거나 하여 풀이하였었습니다.
    StringBuilder의 reverse 함수를 사용하기도 하고.. 아래 다른 분들의 답변 소스는 깊이있게 이해하고 있으신 것 같아 신기했습니다 :)
    속도는 위에 작성한 방식이 더 빠릅니다.
 */
/*
    다른 사람 풀이 1

    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
 */
/*
    다른 사람 풀이 2
    public long solution(long n) {
         return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
 */
/*
    문제
    programmers - 연습문제 - 정수 내림차순으로 배치하기
    https://programmers.co.kr/learn/courses/30/lessons/12933

문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n   	return
118372	873211

 */