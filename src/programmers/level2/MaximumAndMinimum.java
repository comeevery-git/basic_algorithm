package programmers.level2;

class MaximumAndMinimum {
    public String solution(String s) {
        String[] str = s.split(" ");
        int minTemp = Integer.parseInt(str[0]);
        int maxTemp = Integer.parseInt(str[0]);
        for(String v:str) {
            int temp = Integer.parseInt(v);
            if(minTemp > temp) {
                minTemp = temp;
            }
            if(maxTemp < temp) {
                maxTemp = temp;
            }
        }
        return minTemp + " " + maxTemp;
    }
}

/*
    개인 해설
    레벨 2 치고는 쉬운 난이도의 문제였지만, 역시 방법에 따라 성능이 천차만별임을 깨달았습니다.
    먼저 생각났던 방법은 split을 이용해 자른 후 정렬하는 방식이었는데, 어떤 분은 Arrays.sort를 이용하였고
    가장 기억에 남는 방법은 우선순위 큐(PriorityQueue)를 이용한 방법이었습니다.

    Arrays.sort 다른 사람 풀이 ex)
    public String solution(String str) {
        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(arrayInt);
        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

        return result;
    }

    * 성능 TOP
    PriorityQueue 다른 사람 풀이 ex)
    public String solution(String s) {
        if (s.length() == 1) {
            return s + " " + s;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());

        for (String elem : s.split(" ")) {
            pq.add(Integer.parseInt(elem));
            pqr.add(Integer.parseInt(elem));
        }

        StringBuilder builder = new StringBuilder();
        return builder.append(pq.peek()).append(" ").append(pqr.peek()).toString();
    }

 */
/*
    문제
    programmers - 연습문제 - 최댓값과 최솟값
    https://programmers.co.kr/learn/courses/30/lessons/12939

문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

입출력 예
s	            return
"1 2 3 4"	    "1 4"
"-1 -2 -3 -4"	"-4 -1"
"-1 -1"	        "-1 -1"

 */