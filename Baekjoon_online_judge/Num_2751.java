import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter( System.out));


    public static void main(String[] args) throws IOException {

        String input;
        String inputArr;

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            input = br.readLine();
            array[i] = Integer.parseInt(input);
        }

        merge(array);

        for(int i : array){
           bw.write(i + "" + "\n");
        }
        bw.flush();

    }

    static void mergeSort(int[] arrA, int[] arrB, int[] arrC) {
        int ai = 0;
        int bi = 0;
        int ci = 0;

        while (ai < arrA.length) {
            if (bi < arrB.length) {
                if (arrA[ai] > arrB[bi]) {
                    arrC[ci] = arrB[bi];
                    bi++;
                } else {
                    arrC[ci] = arrA[ai];
                    ai++;
                }

                ci++;
            } else {
                while (ai < arrA.length) {
                    arrC[ci] = arrA[ai];
                    ai++;
                    ci++;
                }
            }
        }
        while (bi < arrB.length) {
            arrC[ci] = arrB[bi];
            ci++;
            bi++;
        }

    }


    static void merge(int[] a) {
        int n = a.length;
        int[] arr_tmp1;
        int[] arr_tmp2;

        if (n == 1) {
            return;
        }

        arr_tmp1 = new int[n / 2];
        arr_tmp2 = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            arr_tmp1[i] = a[i];
        }

        for (int i = 0; i < n - n / 2; i++) {
            arr_tmp2[i] = a[i + n / 2];
        }

        merge(arr_tmp1);
        merge(arr_tmp2);

        mergeSort(arr_tmp1, arr_tmp2, a);
    }
}
