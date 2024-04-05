package BOJ.greedy;

import java.util.*;
import java.io.*;
public class BOJ_13305 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[] cities;
    static long distance;
    static long[] oil;
    static long total = 0L;
    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());

        cities = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        oil = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        distance = Arrays.stream(cities).sum();
        total = distance*oil[0];
        distance=distance-cities[0];

        int best = 0;
        for(int i=1; i<N-1; i++){
            long newOne = total - distance * oil[best] + distance * oil[i];
            System.out.print("  newOne = " + newOne);
            System.out.print("  total = " + total);
            System.out.println("  distance = " + distance);
            distance=distance-cities[i];
            if(newOne<total) {
                best=i;
                total = newOne;
            }
        }


        System.out.println(total);
    }

}
