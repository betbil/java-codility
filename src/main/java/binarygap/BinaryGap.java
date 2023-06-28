package main.java.binarygap;

public class BinaryGap {
    public static void main(String[] args){
        int num = 1041;
        System.out.println(num + " to binary: " + Integer.toBinaryString(num));
        System.out.println(solution(num));
        num = 24;
        System.out.println(num + " to binary: " +Integer.toBinaryString(num));
        System.out.println(solution(num));

    }

    private static int solution(int num){
        int i = -1;
        int gap = 0;
        while (num >0) {
            if ((num & 1) == 1) {
                i = 0;
            }else if (i >= 0){
                i++;
                gap = Math.max(gap, i);
            }
            num = num >> 1;
        }
        return gap;
    }
}
