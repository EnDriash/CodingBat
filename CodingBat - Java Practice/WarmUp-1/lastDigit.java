
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true


public boolean lastDigit(int a, int b) {
  boolean istrue=false;
  int a1=a%10;
  int b1=b%10;
  if(a1==b1){
    istrue=true;
  }
  return istrue;
}
