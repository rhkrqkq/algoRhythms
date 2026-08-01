class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        int last = num_list[len - 1];    
        int before = num_list[len - 2]; 
        
        if (last > before) {
            answer[len] = last - before;
        } else {
            answer[len] = last * 2;
        }
        
        return answer;
    }
}
