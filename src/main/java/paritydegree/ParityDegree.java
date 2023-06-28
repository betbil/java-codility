package main.java.paritydegree;

public class ParityDegree {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(n + " to binary: " + Integer.toBinaryString(n));
        System.out.println(solution(n));
        n = 24;
        System.out.println(n + " to binary: " +Integer.toBinaryString(n));
        System.out.println(solution(n));

    }

    private static int solution(int N){
        int i =0;
        while ((N & 1) == 0){
            N = N >> 1;
            i++;
        }
        return i;
    }
}
