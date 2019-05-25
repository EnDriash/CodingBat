Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]

public int[] biggerTwo(int[] a, int[] b) {
  int sum1=a[0]+a[1];
  int sum2=b[0]+b[1];
  int x=Math.max(sum1,sum2);
  int[] z=new int[2];
  if(x==sum1){
    z=a;
  }
  else if (x==sum2){
    z=b;
    
  }
  else if(sum1==sum2){
    z=b;
  }
  return z;
}
