class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 더 큰숫자가 앞 인덱스로 
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0]<sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        // 순서 바뀐 size 돌면서 가로세로 맥시멈 뽑기
        int max_garo = 0;
        int max_sero = 0;
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0] > max_garo) max_garo = sizes[i][0];
            if (sizes[i][1] > max_sero) max_sero = sizes[i][1];
        }
        answer = max_garo * max_sero;
        return answer;
    }
}