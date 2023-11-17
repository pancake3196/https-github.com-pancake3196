class Solution {
    public int solution(int[] num_list) {
        int fle = 0;
        int gop = 1;
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){   //num_list의 길이만큼 i를 1씩 더하다가
           
            if(num_list.length >= 11){              //num_list의 길이가 11 이상이면
          fle += num_list[i];                    //int형의 fle에 num_list의 i번째 주소값을 더함
                answer = fle;                   //전부다 더한 값을 answer에 넣음
                
        }else {                                   //만약 i가 k이하면
          gop *= num_list[i];                    //int형 주소값에 num_list의 i번째 주소값을 곱함
        answer = gop;                            //전부다 곱한 값을 answer에 넣음
                
                //fle이 0인 이유 : 1로 하면 결과값+1로 출력되기 때문
                //fop이 1인 이유 : 0으로 하면 0*n이 되서 무슨 값을 넣든 0이되서
                
        }
          
            
        }
       
       return answer;   //fle,gop을 answer에 넣었으니 answer를 리턴한다
    }
            

}
//결괏값이 0이다 = answer로 전달을 안한 채로 실행이 되었다