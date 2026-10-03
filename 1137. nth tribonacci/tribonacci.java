 class Solution {
    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        int i, first, second , third , next ;
        first =0;
        second=1;
        third=1;
        
          for(i=3; i<=n; i++){
            next= first +second+ third;
            first = second;
            second= third;
            third= next;
          }
          return third; 
    }
} 
