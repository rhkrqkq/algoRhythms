import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {
        int max_yak=1;
        int min_gong=1;
        for (int i=1; i<=n; i++) {
            // n,m둘다 나눠지면
            if (n%i == 0 && m%i == 0) {
                max_yak = i;
            }
        }
        min_gong = (n*m)/max_yak;
        
        return new int[]{max_yak, min_gong};
    }
}