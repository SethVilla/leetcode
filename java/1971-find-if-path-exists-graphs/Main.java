// 1971. Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/

public class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // a -> a
        if (source == destination) return true;

        // from class we can represent graph like an adjacency list
        // [0 => [1,2,3]]
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // undericted graph a -> b, b -> a
        // [[0,1],[0,2],[3,5],[5,4],[4,3]]
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        // implement BFS with queue
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        // we only need to worry about source and not iterating through all vertices
        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            // this will never be empty and cause null exception
            int current = queue.poll();

            for (int neighbor : adjacencyList.get(current)) {
                if (neighbor == destination) {
                    return true;
                }
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}