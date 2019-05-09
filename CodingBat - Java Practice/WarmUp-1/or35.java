
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false


public boolean or35(int n) {
  int f = n%5;
  int t = n%3;
  boolean istrue= false;
  if (f==0||t==0){
istrue=true;
  }
  return istrue;
}
