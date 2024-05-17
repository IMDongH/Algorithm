package BOJ.greedy;

import java.util.*;
import java.io.*;

public class BOJ_1931_1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int result=1;
    public static void main(String[] args) throws IOException{
        n = Integer.parseInt(br.readLine());

        PriorityQueue<Room> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);

            pq.add(new Room(start,end));

        }


        Room room = pq.poll();
        for(int i=1; i<n; i++){
            Room nextRoom = pq.poll();
            if(room.end<=nextRoom.start){
                result++;
                room=nextRoom;
            }
        }
        System.out.println(result);
    }

     static class Room implements Comparable<Room>{
        int start;
        int end;

        public Room(int start, int end) {
            this.start = start;
            this.end = end;
        }



        @Override
        public String toString() {
            return "Room{" +
                "start=" + this.start +
                ", end=" + this.end +
                '}';
        }

        @Override
        public int compareTo(Room o) {
            if(this.end-o.end==0)
                return this.start-o.start;

            return this.end-o.end;
        }
    }
}
