Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
 the elements from a followed by the elements from b. The arrays may be any length, including 0, 
 but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]


public int[] make2(int[] a, int[] b) {
  int sum= a.length+b.length;
  int dif=sum-a.length;
  int[] p=new int[sum];
  for (int x=0; x<a.length;x++) {
    p[x]=a[x];
  }
  int q=0;
  for (int x=a.length; x<sum; x++){
    
    p[x]=b[q];
    q=q+1;
  }
  int[] x={p[0],p[1]};
  return x;
}
