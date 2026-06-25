class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt = 0;
        for (int i=0; i<number.length; i++) {
            // 3개 더했을때 0
            for (int j=i+1; j<number.length; j++) {
                for (int k=j+1; k<number.length; k++) {
                    if (k==i || k==j || j==i) continue;
                    if (number[i]+number[j]+number[k]==0) cnt++;
                }
            }
        }
        return cnt;
    }
}