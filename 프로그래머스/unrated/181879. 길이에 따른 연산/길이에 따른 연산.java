class Solution {
    public int solution(int[] num_list) {
        int fle = 0;
        int gop = 1;
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){   //num_list의 길이만큼 i를 1씩 더하다가
           
            if(num_list.length >= 11){              //num_list의 길이가 11 이상이면
          fle += num_list[i];                    //ans에 num_list의 i번째 주소값을 더함
                
                 answer = fle;                        
        }else {                                   //만약 i가 k이하면
          gop *= num_list[i];                    //answer에 num_list의 i번째 주소값을 곱함
        answer = gop;
        }
          
            
        }
       
       return answer;
    }
            

}
//결괏값이 0이다 = answer로 전달을 안한 채로 실행이 되었다