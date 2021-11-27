package programmers.level1;

public class MatricesAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i=0; arr1.length>i;i++) {
            for(int j=0; arr1[0].length>j; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
/*
    개인 해설
    각 행, 열의 덧셈을 진행하면서 가장 많이 본 문구는 IndexOutOfBounds
    arr1.length 와 arr1[0].length 를 반대로 적어놓는 바보같은 실수를..
    가장 고민스러웠던 점은 속도입니다.
    나머지는 0.*ms 인데 테스트 케이스 17의 경우 3.60ms가 찍혀서, 어떻게 하면 더 빠르게 할 수 있을 지 고민해보았습니다.
    우선 int[][] answer = arr1 할당도 해보고 했는데, 생각해보면 int[][] answer 구문은 삭제하고 arr1 배열에 더한 값을 재할당 하면 됩니다.
    테스트 케이스 17의 경우는 데이터가 많은 경우인 것 같고, 이중 for문은 반드시 필요할 거라고 생각됩니다.

 */
/*
    문제
    programmers - 연습문제 - 행렬의 덧셈
    https://programmers.co.kr/learn/courses/30/lessons/12950

문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
입출력 예
arr1	        arr2	        return
[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
[[1],[2]]	    [[3],[4]]	    [[4],[6]]

 */