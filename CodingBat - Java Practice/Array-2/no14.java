Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

public boolean no14(int[] nums) {
 boolean is4=false;
 boolean is1=false;
 for(int i=0;i<nums.length;i++){
  if(nums[i]==4){
    is4=true;
  }
   if(nums[i]==1){
   is1=true;
  }
 }
if(is4==true&&is1==true){
  return false;
}
else{
  return true;
}
 }

