import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int count = Integer.parseInt(br.readLine());
        int[] num = new int[count];
        double mean = 0;
        int middle = 0, vari = 0, range = 0;
        for (int i = 0; i < count; i++) {
            num[i] = Integer.parseInt(br.readLine());
            mean += num[i];
        }

        Arrays.sort(num);
        // 산술 평균
       findMean(mean, num.length);
        // 중앙값
        findMiddle(num);
        // 최빈값
        findVari(num);
        // 범위
        findRange(num);
    }
    static void findRange(int[] num){
        System.out.println(num[num.length-1]-num[0]);
    }

    static void findVari(int[] num){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length; i++) {
            if (!map.containsKey(num[i])){
                map.put(num[i], 1);
            }else {
                map.replace(num[i], map.get(num[i])+1);
            }
        }

        List<Entry<Integer, Integer>> list_entries
                = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if(o1.getValue().equals( o2.getValue())){
                   return o1.getKey().compareTo(o2.getKey());
                }else {
                    return 0;
                }
            }
        });
        
        if(list_entries.size() > 1 &&
                list_entries.get(0).getValue().equals(list_entries.get(1).getValue())) {
            System.out.println(list_entries.get(1).getKey());
        }else {
            System.out.println(list_entries.get(0).getKey());
        }
    }

    static void findMiddle(int[] num){
        System.out.println(num[num.length/2]);
    }

    static void findMean(double m, int c){

        System.out.println((int)Math.ceil(Math.round(m/c)));
    }
}
