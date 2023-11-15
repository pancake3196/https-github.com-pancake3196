class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int sum = 1; sum <= n; sum++){
            if(n % sum == 0){         //n을 sum로 나눈 후 나머지가 0일때       
                answer++;
            }else{
                continue;
            }
            
        }
        
        return answer;
    }
}