package algorithm;

import java.util.LinkedList;
import java.util.ListIterator;

// BFS
// TODO: 추후 2권을 읽고 예제를 추가할 예정입니다.
//  알고리즘 문제해결 전략 2 881p ~
public class BreadthFirstSearch {

/*
    너비 우선 탐색
    시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법입니다.

    노드를 넓게(wide) 탐색합니다. 주로 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶을 때 이 방법을 사용합니다.
    주로 구현은 큐라는 자료에 이웃하는 정점을 다 담아놓고 차례대로 POP 하는 방식으로 구현합니다.

 */

/*
    미로 찾기 예제로 보는 BFS (FIFO 큐)
    https://www.youtube.com/watch?v=16SLOYDCYuc&t=1516s

 */
    /*
        참고 링크
            https://gmlwjd9405.github.io/2018/08/15/algorithm-bfs.html
        실행
            BreadthFirstSearch bfs = new BreadthFirstSearch(10);
            bfs.addEdge(0, 1);
            bfs.addEdge(0, 2);
            bfs.addEdge(1, 2);
            bfs.addEdge(2, 0);
            bfs.addEdge(2, 3);
            bfs.addEdge(3, 3);
            bfs.start(2);
     */
    private int nodesSize; // 노드의 개수
    private LinkedList<Integer> adjacency_list[]; // 인접 노드 리스트

    BreadthFirstSearch(int nSize) {
        nodesSize = nSize;
        adjacency_list = new LinkedList[nSize];

        // 인접 노드 리스트를 초기화
        for(int i=0; i<nSize; ++i) {
            adjacency_list[i] = new LinkedList<>();
        }
    }

    // 문제 세팅을 위한 노드 연결 함수
    void addEdge(int x, int y) {
        adjacency_list[x].add(y);
    }

    // 탐색 시작
    void start(int node) {
        // 노드의 방문 여부 (default: false)
        boolean visited[] = new boolean[nodesSize];
        // FIFO 큐 생성
        LinkedList<Integer> queue = new LinkedList<>();

        // 현재 노드 방문 표시, 큐 삽입(enqueue)
        visited[node] = true;
        queue.add(node);

        // 큐가 빌 때까지 반복
        while (queue.size() != 0) {
            // 방문 노드의 큐에서 추출(dequeue)하고 값 출력
            node = queue.poll();
            System.out.println(node + " ");

            // 방문 노드와 인접한 모든 노드를 가져옴
            ListIterator<Integer> i = adjacency_list[node].listIterator();
            while(i.hasNext()) {
                int n = i.next();
                // 방문 하지 않은 노드면 방문한 것으로 표시, 큐 삽입(enqueue)
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}