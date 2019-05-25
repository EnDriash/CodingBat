Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.


inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true

public boolean inOrder(int a, int b, int c, boolean bOk) {
  boolean t=true;
  if(Math.max(a,b)==b&&Math.max(b,c)==c){
    t=true;
  }
  else if(bOk==true&&Math.min(a,b)==b&&c>b){
    t=true;
  }
  else{
    t=false;
  }
  return t;
}
