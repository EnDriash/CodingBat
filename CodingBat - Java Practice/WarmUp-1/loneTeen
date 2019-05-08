
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false


public boolean loneTeen(int a, int b) {
  boolean isteen= false;
  if(a<=19&&a>=13){
     isteen=true;
    if(b<=19&&b>=13){
      isteen=false;
    }
  }
   if(b<=19&&b>=13){
     isteen=true;
    if(a<=19&&a>=13){
      isteen=false;
    }
  }
  return isteen;
}
