import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int cities = Integer.parseInt(br.readLine());
        String[] distance = br.readLine().split(" ");
        String[] cost = br.readLine().split(" ");
        Pair[] pair = new Pair[distance.length];
        for (int i = 0; i < distance.length; i++) {
            pair[i] = new Pair(Long.parseLong(distance[i]), Long.parseLong(cost[i]));
        }
        find(pair);
    }

    static void find(Pair[] p) {
        long answer = p[0].cost * p[0].dist;
        long current_cost = p[0].cost; // 휘발유의 가격

        for (int i = 0; i < p.length - 1; i++) {
            if (current_cost * p[i + 1].dist > p[i + 1].cost * p[i + 1].dist) {
                current_cost = p[i + 1].cost;
            }
            answer += current_cost * p[i + 1].dist;
        }

        System.out.print(answer);

    }

    static class Pair {
        long dist, cost;

        Pair(long dist_, long cost_) {
            dist = dist_;
            cost = cost_;
        }
    }
}
