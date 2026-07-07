import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) answer.add(my_string.charAt(i)-'0');
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}