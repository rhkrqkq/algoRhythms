class Solution {
    public int solution(int a, int b) {
        int q = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
int w = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        int answer = 0;
        if (q>w) {
            answer = q;
        } else {
            answer = w;
        }
        return answer;
    }
}