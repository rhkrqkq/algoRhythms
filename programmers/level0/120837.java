class Solution {
    public int solution(int hp) {
        int answer = 0;
        int jangun = 5;
        int byeong = 3;
        int work = 1;
        int x,y,z=0;
        // 장군 몇마리 필요한지
        x = hp/jangun;
            
        // 병정
        y = (hp-(x*jangun))/byeong;
            
        // 일갬
        z = (hp-(x*jangun)-(y*byeong))/work;
        
        answer = x+y+z;
        return answer;
    }
}