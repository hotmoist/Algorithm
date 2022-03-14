/*
 * Programmers coding test practice
 * 2020 kakao internship ( brute force )(level 1)
 * Problem name : 키패드 
 */
class Solution {
    public String solution(int[] numbers, String hand) {
    
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;


        for (int i = 0; i < numbers.length; i++) {
            int lx = 0, ly = 0, rx = 0, ry = 0;
            int cx = 0, cy = 0;
            int ldist = 0, rdist = 0;

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i];
                sb.append("L");
                //  answer = answer + "L";
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i];
                sb.append("R");
            } else {
                lx = left / 3;
                ly = left % 3;
                rx = right / 3;
                ry = right % 3;
                if (numbers[i] == 0) {
                    cx = 3;
                    cy = 2;
                } else {
                    cx = numbers[i] / 3;
                    cy = numbers[i] % 3;
                }
                if (ly == 0) {
                    lx -= 1;
                    ly += 1;
                }
                if (ry == 0) {
                    rx -= 1;
                    ry += 1;
                }

                if (cy == 0) {
                    cx -= 1;
                    cy += 1;
                }

                ldist = (int) Math.sqrt(Math.pow(lx - cx, 2)) + (int) Math.sqrt(Math.pow(ly - cy, 2));
                rdist = (int) Math.sqrt(Math.pow(rx - cx, 2)) + (int) Math.sqrt(Math.pow(ry - cy, 2));

                if (ldist > rdist) {
                    if (numbers[i] == 0) {
                        right = 11;
                    } else {
                        right = numbers[i];
                    }
                    sb.append("R");
                } else if (ldist < rdist) {
                    if (numbers[i] == 0)
                        left = 11;
                    else
                        left = numbers[i];
                    sb.append("L");
                } else {
                    if (hand.equals("right")) {
                        if (numbers[i] == 0)
                            right = 11;
                        else
                            right = numbers[i];
                        sb.append("R");
                    } else {
                        if (numbers[i] == 0)
                            left = 11;
                        else
                            left = numbers[i];
                        sb.append("L");
                    }
                }
            }
        }

        return sb.toString();
    }
    
}
