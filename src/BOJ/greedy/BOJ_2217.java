package BOJ.greedy;

import java.util.*;
import java.io.*;

public class BOJ_2217 {

    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Integer[] rope;
    static int max = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        rope = new Integer[N];
        for(int i=0; i<N; i++){
            rope[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(rope,Collections.reverseOrder());

        for(int i=0; i<N; i++){
            int w = rope[i] * (i + 1);
            max = Math.max(w,max);
        }
        System.out.println(max);
    }


}
