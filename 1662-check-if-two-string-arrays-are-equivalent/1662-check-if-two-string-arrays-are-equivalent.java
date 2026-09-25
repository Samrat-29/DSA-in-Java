class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder ans1 = new StringBuilder();
       StringBuilder ans2 = new StringBuilder();
     for(String s:word1){
        ans1.append(s);

     }
     for(String s:word2){
        ans2.append(s);
     }
     return ans1.toString().equals(ans2.toString());
    }
}