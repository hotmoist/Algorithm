import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[t];
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            meetings[i] = new Meeting(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end == o2.end){
                    return o1.start-o2.start;
                }

                return o1.end - o2.end;
            }
        });

        findMax(meetings);

    }

    static void findMax(Meeting[] meetings) {
        int start = meetings[0].start;
        int end = meetings[0].end;
        int count = 1;

        for (int i = 0; i < meetings.length - 1; i++) {
            if (end <= meetings[i + 1].start) {
                start = meetings[i + 1].start;
                end = meetings[i + 1].end;
                count++;
            }
        }

        System.out.print(count);
    }

    static class Meeting {
        int start, end;

        Meeting(int start_, int end_) {
            start = start_;
            end = end_;
        }
    }
}
