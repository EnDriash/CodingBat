Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

public int[] front11(int[] a, int[] b) {
  int[] x=new int[2];
  if(a.length>0&&b.length>0){
   
    x[0]=a[0];
    x[1]=b[0];
  }
  else if (a.length==0||b.length==0){
        if(a.length==0&&b.length>0){
          x=new int[1];
          x[0]=b[0];
        }
       else if (b.length==0&&a.length>0){
          x=new int[1];
          x[0]=a[0];
        }
        else{
          x=new int[0];
        }
  }
  return x;
}
