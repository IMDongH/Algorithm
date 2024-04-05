package BOJ.greedy;

import java.util.*;
import java.io.*;

public class BOJ_1541_1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int  result = 0;
    public static void main(String[] args) throws IOException{
        String[] input = br.readLine().split("-");

        result = solve(input[0]);
        for(int i=1; i<input.length; i++){
            result = result-solve(input[i]);
        }
        System.out.println(result);

    }

    private static int solve(String num) {
        return Arrays.stream(num.split("\\+")).mapToInt(Integer::parseInt).sum();
    }

}
