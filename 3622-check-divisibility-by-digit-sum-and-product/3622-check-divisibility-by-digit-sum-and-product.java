class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,mul=1,temp=n;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            mul*=digit;
            n=n/10;
        }
     if (temp%(sum+mul)==0){
        return true;
     }
      else{
        return false;
      }
    }}