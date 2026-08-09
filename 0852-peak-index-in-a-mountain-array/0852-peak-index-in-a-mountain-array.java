class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
    int mid=0;

    while(start<end){
    mid=start+(end-start)/2;
    //we can also do mid=(start+end)/2, but its a wrong process cause it may end with a data overflow in java
  //opor er line ta mone rakh pore kaje lagbe.....
if(arr[mid]>arr[mid+1]){
   end=mid;
   //array is in the descending part

  }
   else{
    start=mid+1;
   }
// actually when we both find start,end then loop stops cause start==end , then only one pass to return means we get the result -> ei kotha ta mone rakh kaje lagbe...
    }
return start;
    }
    
}