import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        for (int i=0; i<my_string.length(); i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        Arrays.sort(arr);
        return new String(arr);
    }
}