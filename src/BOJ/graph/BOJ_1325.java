package BOJ.graph;

import java.util.*;
import java.io.*;

public class BOJ_1325 {

    static List<Integer> answer = new ArrayList<>();
    static int result = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    static int N,M;

    public static void main(String[] args) throws IOException{
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        visited = new boolean[N+1];
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);

            graph.get(end).add(start);
        }


        for(int i=1; i<=N; i++){
            dfs(i);
//            System.out.println("result = " + result);
            answer.add(result);
            max=Integer.max(max,result);
            result = 0;
            Arrays.fill(visited,false);
        }


        for(int i=1; i<=N; i++)
        {
            if(max== answer.get(i-1))
                System.out.print(i + " ");
        }

    }

    private static void dfs(int start) {
        visited[start]=true;

        for (Integer integers : graph.get(start)) {
            if(visited[integers]) continue;

            result++;

            dfs(integers);
        }
    }


}
