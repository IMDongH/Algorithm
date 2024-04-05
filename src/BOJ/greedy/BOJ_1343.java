package BOJ.greedy;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1343 {

    static String A = "AAAA";
    static String B = "BB";
    static String[] input;
    static BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("\\.");

        for(int i=0; i<input.length; i++) {


            if(i!=input.length-1){
                sb.append(".");
            }

        }
    }
}
