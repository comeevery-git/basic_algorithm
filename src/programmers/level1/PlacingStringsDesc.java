package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class PlacingStringsDesc {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<ch.length;i++) {
            int temp = ch[i];
            list.add(temp);
        }
        list.sort(Comparator.reverseOrder());
        list.forEach(n -> {
            sb.append((char) (int) n);
        });
        return sb.toString();
    }
}
/*
    개인 해설
    입출력 예시를 보고 StringBuilder reverse 함수를 사용하려고 했는데
    문제를 다시 읽어보니 문자 ASCII 코드값을 이용 한 정렬문제였습니다.
    char[] 배열에 넣어 ASCII 코드값을 list에 넣고 정렬한 후 StringBuilder 로 취합했습니다.

 */
/*
    문제
    programmers - 연습문제 - 문자열 내림차순으로 배치하기
    https://programmers.co.kr/learn/courses/30/lessons/12917

문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.

입출력 예
s	        return
"Zbcdefg"	"gfedcbZ"

 */