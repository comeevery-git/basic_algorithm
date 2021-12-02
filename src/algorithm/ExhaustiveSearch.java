package algorithm;

import java.util.Vector;

// Brute-Force Search
public class ExhaustiveSearch {

/*
    완전 탐색
    컴퓨터의 빠른 계산 능력을 이용하여 가능한 경우의 수를 일일이 나열하면서 답을 찾는 방법

    사실 가능한 방법을 전부 실행해보는 방법이라 알고리즘을 공부하지 않은 사람도 주로 사용하는 방법입니다.
    그렇지만 직접 계산하는 것보다는 컴퓨터의 연산 능력이 훨씬 뛰어나고, 입력값이 적을 경우 완전 탐색이 더 빠른 알고리즘의 기반이 되기도 합니다.

 */

/*
    재귀 함수(recursive function), 재귀 호출(recursion)
        자신이 수행할 작업을 유사한 형태의 여러 조각으로 쪼갠 뒤 그 중 한 조각을 수행하고, 나머지를 자기 자신을 호출해 실행하는 함수입니다.
        문제의 특성에 따라 재귀 호출은 코딩을 훨씬 간편하게 해줄 수 있는 강력한 무기가 됩니다.
 */

    // 필수 조건: n >= 1
    // 결과: 1부터 n까지의 합을 반환
    private int recursiveSum(int n) {
        if(n == 1) return 1; // 더 이상 쪼개지지 않을 때, 모든 재귀 함수는 최소한의 작업에 도달했을 때 곧장 반환하는 조건문을 포함해야 합니다.
        // 쪼개지지 않는 가장 작업 작업들을 가리켜 재귀 호출의 기저 사례(base case)라고 합니다.
        return n + recursiveSum(n-1);
    }

    // 예제: 중첩 반복문 대체
    // 문제: 0번부터 차례대로 번호 매겨진 n개의 원소 중 4개를 고르는 모든 경우의 수 출력

    // before
    private void forEx(int n) {
        for(int i = 0; i < n; ++i)
            for(int j = i+1; j < n; ++j)
                for(int k = j+1; k < n; ++k)
                    for(int l = k+1; l < n; ++l)
                        // ...
                        break;

        // after 실행, 작업 목록
        // 1. 원소들의 총 개수
        // 2. 더 골라야 할 원소들의 개수
        // 3. 지금까지 고른 원소들의 번호
        Vector<Integer> number = new Vector<Integer>();
        forExPick(10, number, 3);
    }

    // after
    private void forExPick(int n, Vector<Integer> picked, int toPick) {
        // n : 전체 원소의 수
        // picked : 지금까지 고른 원소들의 번호
        // toPick : 더 고를 원소의 수

        // 기저 사례: 더 고를 원소가 없을 때 고른 원소들을 출력한다.
        // toPick 0 일 때 종료합니다.
        if(toPick == 0) { System.out.println(picked); return; }
        // 고를 수 있는 가장 작은 번호를 계산한다.
        int smallest = picked.isEmpty()? 0 : picked.size();
        // 이 단계에서 원소 하나를 고른다.
        for(int next = smallest; next < n; ++next) {
            picked.add(next);
            forExPick(n, picked, toPick - 1);
            picked.remove(picked.size() - 1);
        }

    }
}
