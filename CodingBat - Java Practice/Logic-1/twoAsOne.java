Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false

public boolean twoAsOne(int a, int b, int c) {
  boolean x=false;
  a=Math.abs(a);
   b=Math.abs(b);
    c=Math.abs(c);
  int m=Math.max(a,Math.max(b,c));
  if(a+b==m||b+c==m||c+a==m){
    x=true;
  }
  return x;
}
