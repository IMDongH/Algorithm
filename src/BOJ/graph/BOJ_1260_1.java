package BOJ.graph;

import java.util.*;
import java.io.*;

public class BOJ_1260_1 {

    static boolean[] visited;
    static boolean[][] graph;

    static int N,M,V;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        graph = new boolean[N+1][N+1];

//        for(int i=0; i<=N; i++){
//            graph.add(new ArrayList<>());
//        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

//            graph.get(start).add(end);
//            graph.get(end).add(start);
            graph[start][end] = true;
            graph[end][start] = true;
        }
        Arrays.fill(visited,false);
        dfs(V);
        System.out.println(sb);
        sb = new StringBuilder();
        Arrays.fill(visited,false);
        bfs(V);
        System.out.println(sb);

    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            if(visited[poll]) continue;
            visited[poll] = true;
            sb.append(poll).append(" ");
            for(int i=1; i<=N; i++){
                if(graph[poll][i]){
                    queue.add(i);
                }
            }
        }



    }

    private static void dfs(int start) {

        sb.append(start).append(" ");
        visited[start] = true;


        for(int i=1; i<=N; i++){
            if(!graph[start][i]) continue;
            if(visited[i]) continue;

            dfs(i);
        }

    }

}
