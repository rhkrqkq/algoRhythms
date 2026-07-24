class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (Integer.parseInt((String.valueOf(a)+String.valueOf(b))) < 2*a*b) {
            answer = 2*a*b;
        } else if (Integer.parseInt((String.valueOf(a)+String.valueOf(b))) > 2*a*b) {
            answer = Integer.parseInt((String.valueOf(a)+String.valueOf(b)));
        }
        return answer;
    }
}