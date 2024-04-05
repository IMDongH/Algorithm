package BOJ.graph;

import java.util.*;
import java.io.*;

public class BOJ_2606 {

    static int N,M,V=1;
    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int result = 0;

    public static void main(String[] args) throws IOException{

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        bfs(V);
        System.out.println(result);
        result=0;
        Arrays.fill(visited,false);

//        dfs(V);
//        System.out.println(result);
    }

    private static void dfs(int start) {
        visited[start] = true;

        for (Integer vertex : graph.get(start)) {
            if(visited[vertex]) continue;

            result++;
            dfs(vertex);
        }
    }

    private static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] =true;
        while(!queue.isEmpty()){
            Integer poll = queue.poll();

            for (Integer vertex : graph.get(poll)) {
                if(visited[vertex]) continue;

                visited[vertex] =true;
                result++;
                queue.add(vertex);
            }
        }
    }

}
