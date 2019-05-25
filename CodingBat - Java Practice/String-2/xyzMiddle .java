
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

public boolean xyzMiddle(String str) {
  int l=str.length();
  
  if(l>2 &&l%2==1 &&str.charAt(l/2)=='y'&&str.charAt(l/2-1)=='x' &&str.charAt(l/2+1)=='z'){
    return true;
  }
    if(l>2&&l%2==0&&((str.charAt(l/2-1)=='y'&&str.charAt(l/2-2)=='x' &&str.charAt(l/2)=='z')||(str.charAt(l/2)=='y'&&str.charAt(l/2-1)=='x' &&str.charAt(l/2+1)=='z') )){
    return true;
  } else{
    return false;
  } 
}
