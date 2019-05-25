Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true

public boolean lessBy10(int a, int b, int c) {
  int x=Math.min(a,Math.min(b,c));
  boolean t=false;
  if(a-x>=10||b-x>=10||c-x>=10){
    t=true;
  }
  else{
    t=false;
  }
  return t;
}
