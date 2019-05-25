Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]

public int[] frontPiece(int[] nums) {
  int[] a=new int[2];
  if(nums.length>1){
  a[0]=nums[0];
  a[1]=nums[1];
  }
  if(nums.length==1){
    a=new int[1];
    a=nums;
  }
  if(nums.length==0){
    a=new int[0];
  }
  return a;
}
