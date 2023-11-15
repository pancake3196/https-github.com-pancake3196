class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        int sum;
                
         if(number % n ==0 && number % m == 0){         //number에 n과 m을 나눈 후 나머지가 0이라면
              sum = 1;
         }else{
              sum = 0; 
         }
       
        answer = sum;
        
        
        return answer;
    }
}