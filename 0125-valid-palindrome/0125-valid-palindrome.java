class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String temp="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if((ch>='a'&&ch<='z')||((ch>='0'&&ch<='9'))){
                temp+=ch;
            }
        }
        String reverse="";
        for(int j=temp.length()-1;j>=0;j--){
          
            reverse += temp.charAt(j);
        }
        return reverse.equals(temp);
    }
}