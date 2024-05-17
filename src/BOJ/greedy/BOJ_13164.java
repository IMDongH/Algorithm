package BOJ.greedy;

import java.util.*;
import java.io.*;

/**
 * 5 4
 * 1 3 5 6 10
 *  2 2 1 4
 */
public class BOJ_13164 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, K;
    static int result = 0;
    public static void main(String[] args) throws IOException{
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        int[] student = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] diff = new int[N-1];
        for(int i=0; i<N-1; i++){
            diff[i] = student[i+1] - student[i];
        }

        Arrays.sort(diff);

        for(int i=0; i<N-K; i++){
            result += diff[i];
        }
        System.out.println(result);
    }

}
