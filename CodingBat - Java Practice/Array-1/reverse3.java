
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]

public int[] reverse3(int[] nums) {
  int[] b= new int[nums.length];
  int a=0;
  for(int x=(nums.length-1);x>=0;x--){
    b[x]=nums[a];
    a++;
    
  }
  return b;
}
