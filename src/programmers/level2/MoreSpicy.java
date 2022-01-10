package programmers.level2;

import java.util.PriorityQueue;

class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int sum = 0;
        if(K == 0) return 0;

        PriorityQueue<Integer> queue = new PriorityQueue();
        for(int num:scoville) {
            queue.add(num);
        }

        while(queue.size() >= 2) {
            int min = queue.poll();
            if(min < K) {
                int nextMin = queue.poll();
                sum = min + (nextMin * 2);
                queue.add(sum);
                answer++;
            }
        }

        // 모든 스코빌 지수를 K 이상으로 만들 수 없을 때
        if(sum < K) return -1;

        return answer;
    }
}

/*
    개인 해설
    주니어 개발자가 배열의 최소값을 구할 때 가장 손쉽게 떠올리게 되는 것이 ArrayList의 min() 메서드일 것입니다.
    그렇게 풀이하였다면 효율성에서 탈락하게 됩니다. 최소, 최대값을 구하는 데 특화되어있는 자료구조인 Heap을 이용하여 풀이하면 통과할 수 있습니다.
    PriorityQueue를 이용하여 풀이하였고, poll, add를 사용할 경우 시간복잡도는 O(log n)이 됩니다.
    * 참고링크
        https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
        * Thread-safe를 고려하는 상황에서는 PriorityBlockingQueue를 사용해야 합니다.
        https://shanepark.tistory.com/261#priorityqueue

 */
/*
    문제
    programmers - 힙(Heap) - 더 맵게
    https://programmers.co.kr/learn/courses/30/lessons/42626

문제 설명
매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해
Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해
섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

제한 사항
scoville의 길이는 2 이상 1,000,000 이하입니다.
K는 0 이상 1,000,000,000 이하입니다.
scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.

입출력 예
scoville	            K	return
[1, 2, 3, 9, 10, 12]	7	2

입출력 예 설명
스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]

스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
가진 음식의 스코빌 지수 = [13, 9, 10, 12]

모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.

 */